package com.helr.cs.message.entity;

import java.io.Serializable;

/**
 * @Title SMSMessage
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:18
 */
public class SMSMessage implements Serializable {

    private String phoneNumber;

    private String content;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
