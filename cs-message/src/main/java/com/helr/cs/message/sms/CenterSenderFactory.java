package com.helr.cs.message.sms;

/**
 * @Title CenterSenderFactory
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:43
 */
public class CenterSenderFactory implements Provider{

    @Override
    public Sender produce() {
        System.out.println("初始化CenterSenderFactory....");
        return new CenterSender();
    }
}
