package com.helr.cs.message.sms;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Title SenderProperties
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/10 0010 16:47
 */

@ConfigurationProperties(prefix = "cs.message")
public class SenderProperties {

    public static final String TX_SENDER = "com.helr.cs.message.sms.TxSenderFactory";
    public static final String DEFAULT_SENDER = TX_SENDER;
    public static final String CENTER_SENDER = "com.helr.cs.message.sms.CenterSenderFactory";

    private boolean enabled;

    private String senderClassName = DEFAULT_SENDER;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSenderClassName() {
        return senderClassName;
    }

    public void setSenderClassName(String senderClassName) {
        this.senderClassName = senderClassName;
    }
}
