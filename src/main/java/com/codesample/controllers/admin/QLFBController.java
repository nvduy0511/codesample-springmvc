package com.codesample.controllers.admin;

import com.codesample.entities.FeedBack;
import com.codesample.entities.User;
import com.codesample.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class QLFBController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @RequestMapping(value = "/admin/QLFB/", method = RequestMethod.GET)
    public ModelAndView QLFB(HttpSession session){
        if(session.getAttribute("admin")!=null)
        {
            ModelAndView mav = new ModelAndView("admin/QLFB");
            List<FeedBack> listFB = feedbackRepository.findAll();
            mav.addObject("getAllFB", listFB);
            return mav;
        }
        ModelAndView mav1 = new ModelAndView("admin/NoneLogin");
        return mav1;
    }
}
