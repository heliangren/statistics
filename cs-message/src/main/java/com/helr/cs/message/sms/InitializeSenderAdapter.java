package com.helr.cs.message.sms;

/**
 * @Title InitializeSenderAdapter
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/4 0004 17:34
 */
public class InitializeSenderAdapter implements Sender {

    private static final boolean verify = true;

    private Boolean shouldVerify;
    private String name;
    private String pwd;

    @Override
    public boolean shouldVerify() {
        return shouldVerify == null ? verify : shouldVerify;
    }

    @Override
    public void before() {
        System.out.println("InitializeSenderAdapter check...");
    }

    @Override
    public void send() {
        // TODO
    }
}
