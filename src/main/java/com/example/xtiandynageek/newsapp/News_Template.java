package com.example.xtiandynageek.newsapp;

/**
 * Created by Xtian Dynageek on 3/24/2018.
 */

public class News_Template {

    /**
     * this is the POJO class for a single news Object
     *for now, we shall only add two properties, the new message and a flag to check what kind of news it is (whether text only or text with
     * caption)
     */


    private String newsMessage;
    private Boolean is_text_only; //this is our flag and depending on this we shall inflate different layouts;


    public News_Template(String newsMessage, Boolean is_text_only) {
        this.newsMessage = newsMessage;
        this.is_text_only = is_text_only;
    }

    public String getNewsMessage() {
        return newsMessage;
    }

    public void setNewsMessage(String newsMessage) {
        this.newsMessage = newsMessage;
    }

    public Boolean getIs_text_only() {
        return is_text_only;
    }

    public void setIs_text_only(Boolean is_text_only) {
        this.is_text_only = is_text_only;
    }
}
