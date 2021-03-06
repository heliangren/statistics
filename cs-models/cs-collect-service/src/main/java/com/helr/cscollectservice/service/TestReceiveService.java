package com.helr.cscollectservice.service;


import com.helr.cscollectservice.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitMqConfig.VISIT_MSG)
public class TestReceiveService {

    @RabbitHandler
    private void process (String msg) {
        System.out.println("TestReceiveService visit_msg：" + msg);
    }
}
