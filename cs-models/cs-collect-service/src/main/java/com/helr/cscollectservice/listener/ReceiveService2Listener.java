package com.helr.cscollectservice.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;

/**
 * @Title ReceiveService2Listener
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/13 0013 15:49
 */
public class ReceiveService2Listener implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message) {
        throw new IllegalStateException("Should never be called for a ChannelAwareMessageListener");
    }

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        channel.basicQos(1);
        byte[] body = message.getBody();
        System.out.println("开始接收消息：" + new String(body));
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }
}
