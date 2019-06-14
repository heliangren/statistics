package com.helr.cs.message.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title SenderAutoConfiguration
 * @Description TODO
 * @Author heliangren
 * @Date 2019/6/10 0010 17:02
 */

@Configuration
@EnableConfigurationProperties(SenderProperties.class)
@ConditionalOnClass(Sender.class)
@ConditionalOnProperty(value = "cs.message.enabled",matchIfMissing = false)
public class SenderAutoConfiguration {

    @Autowired
    private SenderProperties senderProperties;

    @Bean
    @ConditionalOnMissingBean(Sender.class)
    public Sender sender () {
        Provider provider = chooseProvider();
        return provider.produce();
    }

    public Provider chooseProvider () {
        try {
            Provider provider = (Provider) Class.forName(senderProperties.getSenderClassName()).newInstance();
            return provider;
        } catch (ClassNotFoundException e) {
            new ClassNotFoundException("initialize Sender bad，" + senderProperties.getSenderClassName() + "not exist!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
