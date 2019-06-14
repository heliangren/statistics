package com.helr.cscollectservice.config;

import com.helr.cscollectservice.listener.ReceiveService2Listener;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title RabbitListenerContainerConfig
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/13 0013 15:45
 */
@Configuration
public class RabbitListenerContainerConfig {

    @Bean
    public SimpleMessageListenerContainer simpleMessageListenerContainer (Queue queueMessage2, CachingConnectionFactory cachingConnectionFactory) {
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer(cachingConnectionFactory);
        simpleMessageListenerContainer.setQueues(queueMessage2);
        simpleMessageListenerContainer.setExposeListenerChannel(true);
        simpleMessageListenerContainer.setMaxConcurrentConsumers(1);
        simpleMessageListenerContainer.setConcurrentConsumers(1);
        simpleMessageListenerContainer.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        simpleMessageListenerContainer.setMessageListener(new ReceiveService2Listener());
        return simpleMessageListenerContainer;
    }
}
