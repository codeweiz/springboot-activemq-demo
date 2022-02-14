package cn.microboat.springbootactivemqdemo.topic;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Topic;

@Component
public class TopicProduce {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private Topic topic;

    @Scheduled(fixedDelay = 3000)
    public void produceTopicScheduled() {
        jmsMessagingTemplate.convertAndSend(topic, "=>produceTopicScheduled");
        System.out.println("topic 消息推送完毕！");
    }
}
