package com.helr.cscollectservice.service;


import com.helr.cscollectservice.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitMqConfig.VISIT_MSG)
public class TestReceiveService2 {

    @RabbitHandler
    private void process (String msg) {
        System.out.println("TestReceiveService2 visit_msg：" + msg);
    }
}
