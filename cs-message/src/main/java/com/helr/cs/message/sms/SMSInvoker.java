package com.helr.cs.message.sms;

import com.helr.cs.message.invoker.Invoker;

/**
 * @Title SMSInvoker
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:24
 */
public class SMSInvoker implements Invoker {

    private Sender sender;

    public SMSInvoker (Sender sender) {
        this.sender = sender;
    }

    @Override
    public void action () {
        if (sender.shouldVerify())
            sender.before();
        sender.send();
    }
}
