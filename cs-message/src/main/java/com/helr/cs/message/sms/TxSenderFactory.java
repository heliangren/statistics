package com.helr.cs.message.sms;

/**
 * @Title TxSenderFactory
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:50
 */
public class TxSenderFactory implements Provider {
    @Override
    public Sender produce() {
        System.out.println("初始化TxSenderFactory....");
        return new TxSender();
    }
}
