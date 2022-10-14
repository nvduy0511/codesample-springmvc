package com.codesample.controllers.web;

import com.codesample.entities.User;
import com.codesample.repositories.UserInfoRepository;
import com.codesample.services.IMD5Service;
import com.codesample.services.IUserInfoService;
//import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.Base64;

@Controller
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @Autowired
    private IMD5Service md5Service;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    ServletContext context;

    @RequestMapping(value = "/User/Profile/{id}", method = RequestMethod.GET)
    public ModelAndView Info(@PathVariable int id){


        User u = userInfoService.findOneById(id);

        if(u.getBirthDay() != null) {
            Date b = Date.valueOf(u.getBirthDay().toString().split(" ")[0]);
            u.setBirthDay(b);
        }
        if(u.getAvatarUrl() == null){
            u.setAvatarUrl("https://cdn-icons-png.flaticon.com/512/149/149071.png");
            userInfoRepository.save(u);
        }
        ModelAndView info = new ModelAndView("web/profile");
        info.addObject("user", u);
        return info;
    }
    @RequestMapping(value = "/User/Profile/{id}", method = RequestMethod.POST)
    public String save(@PathVariable int id, HttpServletRequest request, ModelMap model){


        User u = userInfoService.findOneById(id);

        String username = request.getParameter("UserName");
        String fullname = request.getParameter("FullName");
        String birthday = request.getParameter("birthDay");
        String email = request.getParameter("Email");

        u.setFullName(fullname);
        u.setUserName(username);

        u.setBirthDay(Date.valueOf(birthday.split(" ")[0]));
        u.setEmail(email);


        userInfoRepository.save(u);
        model.addAttribute("user", u);
        return "web/profile";
    }

    @RequestMapping(value = "/User/Profile/changePass/{id}", method = RequestMethod.POST)
    public String changePass(@PathVariable int id,HttpServletRequest request, ModelMap model){

        String oldPass = request.getParameter("pass");
        String newPass = request.getParameter("newPass");
        String newPassAcp = request.getParameter("newPassAcp");
        User u = userInfoService.findOneById(id);

        if(md5Service.hash(oldPass).equals(u.getPassWord())){

            if(newPass.equals(newPassAcp)){
                String encryptPass = md5Service.hash(newPass);
                u.setPassWord(encryptPass);
                userInfoRepository.save(u);
            }

        }

        return "redirect:/User/Profile/"+ u.getId();
    }



}
