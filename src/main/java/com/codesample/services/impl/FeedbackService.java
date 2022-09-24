package com.codesample.services.impl;

import com.codesample.entities.FeedBack;
import com.codesample.entities.User;
import com.codesample.repositories.FeedbackRepository;
import com.codesample.repositories.UserRepository;
import com.codesample.services.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService implements IFeedbackService {

    @Autowired
    FeedbackRepository feedbackRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public FeedBack add(int star, int idUser, String message) {
        try {
            FeedBack feedBack = new FeedBack();
            User user = userRepository.findOne(idUser);
            if(user == null) return null;
            feedBack.setMessages(message);
            feedBack.setStar(star);
            feedBack.setUser(user);
            feedbackRepository.save(feedBack);
            return feedBack;
        }catch (Exception e){
            return null;
        }
    }
}
