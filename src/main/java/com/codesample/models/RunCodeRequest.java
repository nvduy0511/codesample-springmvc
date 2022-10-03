package com.codesample.models;

public class RunCodeRequest {
    private String code;
    private String language;
    private String input;

    public String getCode() {
        return code;
    }

    public RunCodeRequest(){

    }

    public RunCodeRequest(String code, String language, String input) {
        this.code = code;
        this.language = language;
        this.input = input;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
