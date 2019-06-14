package com.helr.cscollectservice.service;

import com.helr.cscollectservice.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Title ReceiveService2
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/13 0013 9:49
 */

//@Component
//@RabbitListener(queues = RabbitMqConfig.VISIT_MSG2)
public class ReceiveService2 {

    //@RabbitHandler
    private void process (String msg) {
        System.out.println("Receive2 visit_msg2：" + msg);
    }
}
