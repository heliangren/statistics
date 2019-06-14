package com.helr.cs.message.sms;

/**
 * @Title CenterSender
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:28
 */
public class CenterSender extends InitializeSenderAdapter {

    @Override
    public void send() {
        System.out.println("CenterSender...send");
    }
}
