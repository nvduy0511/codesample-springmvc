package com.codesample.entities.key;

import com.codesample.entities.Theory;
import com.codesample.entities.User;

import java.io.Serializable;

public class LearnedKey implements Serializable {
    private Theory theory;
    private User user;
}
