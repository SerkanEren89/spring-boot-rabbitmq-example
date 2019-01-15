package com.example.rabbitmq.rabbitmq.listener;

import com.example.rabbitmq.rabbitmq.dto.ConfigDto;
import com.example.rabbitmq.rabbitmq.util.RabbitContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Config Dto listener
 *
 * @author eren
 */
@Component
public class ConfigDtoListener {

    private static final Logger log = LoggerFactory.getLogger(ConfigDtoListener.class);

    @RabbitListener(queues = RabbitContants.QUEUE_CONFIGS)
    public void processConfigDto(ConfigDto configDto) {
        log.debug("created new config dto: ", configDto.toString());
    }
}
