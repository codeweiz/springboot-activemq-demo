package cn.microboat.springbootactivemqdemo.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class TopicConsumer {

    @JmsListener(destination = "${myTopic}")
    public void receiveTopic(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到主题发布消息：" + textMessage.getText());
    }
}
