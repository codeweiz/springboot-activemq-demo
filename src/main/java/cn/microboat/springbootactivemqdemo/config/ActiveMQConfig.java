package cn.microboat.springbootactivemqdemo.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author zhouwei
 * EnableJms 声明对 JMS 注解的注解
 * */
@Configuration
@EnableJms
public class ActiveMQConfig {

    @Value("${myQueue}")
    private String myQueue;

    @Value("${myTopic}")
    private String myTopic;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(myQueue);
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(myTopic);
    }
}
