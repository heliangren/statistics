package com.helr.cs.message.sms;

/**
 * @Title Sender
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:25
 */
public interface Sender {

    boolean shouldVerify ();

    void before ();

    void send ();

}
