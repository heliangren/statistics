package com.helr.cs.message.sms;

/**
 * @Title TxSender
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:27
 */
public class TxSender extends InitializeSenderAdapter {

    @Override
    public void before() {

    }

    @Override
    public void send() {
        System.out.println("TxSender...send");
    }
}
