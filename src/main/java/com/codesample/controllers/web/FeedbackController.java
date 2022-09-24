package com.codesample.controllers.web;

import com.codesample.entities.User;
import com.codesample.services.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FeedbackController {

    @Autowired
    IFeedbackService feedbackService;

    @GetMapping("/feed-back")
    public String feedBack(){
        return "web/feed-back";
    }
    @PostMapping("/feed-back")
    public String feedBack(HttpServletRequest request, Model model){
        try {
            int start = Integer.parseInt(request.getParameter("rate"));
            String message = request.getParameter("feedback");
            User user = (User) request.getSession().getAttribute("user");
            if(user != null){
                if(feedbackService.add(start, user.getId(), message) != null){
                    model.addAttribute("message","Gửi nhận xét thành công!");
                }else{
                    model.addAttribute("message","Gửi nhận xét thất bại!");
                }

            }else{
                model.addAttribute("message","Bạn chưa đăng nhập không thể gửi lời nhận xét!");
            }
        }catch (Exception e){
            model.addAttribute("message","Nhập đầy đủ thông tin!");
        }
        return "web/feed-back";
    }
}
