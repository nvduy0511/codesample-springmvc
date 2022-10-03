package com.codesample.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Rank {
    private String userName;
    private int testCasePass;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private Date time;

    public Rank(String userName, int testCasePass, Date time) {
        this.userName = userName;
        this.testCasePass = testCasePass;
        this.time = time;
    }

}
