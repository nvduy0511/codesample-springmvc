package com.codesample.controllers.web;

import com.codesample.entities.User;
import com.codesample.services.IMD5Service;
import com.codesample.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IMD5Service md5;

    @Autowired
    IUserService userService;

    @Autowired
    JavaMailSender mailSender;

    @GetMapping("/login-or-register")
    public String loginOrRegister(){
        return "web/login-or-register";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String pass, HttpSession session)
    {
        pass = md5.hash(pass);
        User user = userService.login(email,pass);
        if(user != null){
            session.setAttribute("user", user);
            return "redirect:/trang-chu";
        }
        return "redirect:/account/login-or-register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name, @RequestParam String email, @RequestParam String pass, HttpSession session)
    {
        User user = userService.addUser(name,email,pass);
        if(user != null)
        {
            session.setAttribute("user", user);
            return "redirect:/trang-chu";
        }
        return "redirect:/account/login-or-register";

    }

    @GetMapping("/forgot-password")
    public String forgotPassword(){
        return "web/forgot-password";
    }

    @PostMapping("/forgot-password")
    public String forgotPassword(HttpServletRequest request){
        String email = request.getParameter("email");
        try {
            String pass = userService.forgotPassword(email);
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom("codesample.somee.@gmail.com");
            mailMessage.setTo(email);
            mailMessage.setSubject("Forgot Password");
            mailMessage.setText("New password is "+pass);
            mailSender.send(mailMessage);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:/account/login-or-register";
    }
}
