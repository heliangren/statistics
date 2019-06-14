package com.helr.cscollectservice.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String VISIT_MSG = "visit_msg";

    public static final String VISIT_MSG2 = "visit_msg2";

    public static final String EXCHANGE = "exchange";
    public static final String FANOUT_EXCHANGE = "fanoutExchange";
    public static final String DIRECT_EXCHANGE = "directExchange";

    @Bean
    public Queue queueMessage() {
        return new Queue(VISIT_MSG);
    }

    @Bean
    public Queue queueMessage2() {
        return new Queue(VISIT_MSG2);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    @Bean
    FanoutExchange fanoutExchange () {
        return new FanoutExchange(FANOUT_EXCHANGE);
    }

    @Bean
    DirectExchange directExchange () {
        return new DirectExchange(DIRECT_EXCHANGE);
    }

    /**************--topic--****************/
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with(VISIT_MSG);
    }

    @Bean
    Binding bindingExchangeMessage2(Queue queueMessage2, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage2).to(exchange).with(VISIT_MSG2);
    }

    /**************--fanout--****************/
    @Bean
    Binding bindingFanoutExchangeMessage2(Queue queueMessage2, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueMessage2).to(fanoutExchange);
    }

    @Bean
    Binding bindingFanoutExchangeMessage(Queue queueMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueMessage).to(fanoutExchange);
    }

    /**************--direct--****************/
    @Bean
    Binding bindingDirectExchangeMessage2(Queue queueMessage2, DirectExchange directExchange) {
        return BindingBuilder.bind(queueMessage2).to(directExchange).with(VISIT_MSG2);
    }

    @Bean
    Binding bindingDirectExchangeMessage(Queue queueMessage, DirectExchange directExchange) {
        return BindingBuilder.bind(queueMessage).to(directExchange).with(VISIT_MSG);
    }
}
