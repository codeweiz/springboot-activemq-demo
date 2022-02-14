package cn.microboat.springbootactivemqdemo.api;

import cn.microboat.springbootactivemqdemo.queue.QueueProduce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ActiveMQController {
    @Resource
    private QueueProduce queueProduce;

    @GetMapping("/queue/produce")
    public String queueSend() {
        queueProduce.produceMsg();
        return "消息发送成功";
    }
}
