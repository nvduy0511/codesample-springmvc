package com.codesample.controllers.admin;

import com.codesample.entities.Subject;
import com.codesample.entities.Theory;
import com.codesample.entities.User;
import com.codesample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class QLUserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/admin/QLUser/", method = RequestMethod.GET)
    public ModelAndView quanLyLT(HttpSession session){
        if(session.getAttribute("admin")!=null)
        {
            ModelAndView mav = new ModelAndView("admin/QLUser");
            List<User> listU = userRepository.findAll();
            mav.addObject("getAllUser", listU);
            return mav;
        }
        ModelAndView mav1 = new ModelAndView("admin/NoneLogin");
        return mav1;
    }
}
