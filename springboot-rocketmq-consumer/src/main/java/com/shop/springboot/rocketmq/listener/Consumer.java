package com.shop.springboot.rocketmq.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@RocketMQMessageListener(topic = "springboot-rocketmq",consumeMode = ConsumeMode.CONCURRENTLY,consumerGroup = "${rocketmq.consumer.group}")
@Component
@Slf4j
public class Consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        log.info("接收到消息："+s);
    }
}
