package com.codesample.services;

import com.codesample.entities.FeedBack;

public interface IFeedbackService {
    FeedBack add(int star, int idUser, String message);
}
