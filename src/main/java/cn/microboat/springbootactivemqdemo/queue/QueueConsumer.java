package cn.microboat.springbootactivemqdemo.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class QueueConsumer {

    @JmsListener(destination = "${myQueue}")
    public void receiveQueue(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到消息：" + textMessage.getText());
    }
}
