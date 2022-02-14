package cn.microboat.springbootactivemqdemo.queue;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Queue;

@Component
public class QueueProduce {
    @Resource
    private JmsMessagingTemplate template;

    @Resource
    private Queue queue;

    /**
     * 通过 JmsMessagingTemplate 发送到 Queue 队列
     * */
    public void produceMsg() {
        template.convertAndSend(queue, "produceMsg");
    }

    /**
     * 通过 JmsMessagingTemplate 发送到 Queue 队列
     * 注解 @Scheduled(fixedDelay = 3000)，定时器，fixedDelay 固定延时，单位 ms
     * 开启 @Scheduled 必须在启动类上增加对应的支持注解 @EnableScheduling
     * */
    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled() {
        template.convertAndSend(queue, "produceMsgScheduled");
        System.out.println("系统定时投递 produceMsgScheduled");
    }


}
