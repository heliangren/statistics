package com.helr.cs.message.sms;

import com.helr.cs.message.invoker.Invoker;

/**
 * @Title Demo
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:38
 */
public class Demo {

    public static void main(String[] args) {
        Provider provider = new CenterSenderFactory();
        Invoker invoker = new SMSInvoker(provider.produce());
        invoker.action();
    }
}
