package com.example.rabbitmq.rabbitmq.service.impl;

import com.example.rabbitmq.rabbitmq.dto.ConfigDto;
import com.example.rabbitmq.rabbitmq.mapper.ConfigMapper;
import com.example.rabbitmq.rabbitmq.model.Config;
import com.example.rabbitmq.rabbitmq.repository.ConfigRepository;
import com.example.rabbitmq.rabbitmq.service.ConfigService;
import com.example.rabbitmq.rabbitmq.util.RabbitContants;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * Config service impl
 *
 * @author eren
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    private final RabbitTemplate rabbitTemplate;
    private final ConfigRepository configRepository;
    private final ConfigMapper configMapper;


    public ConfigServiceImpl(RabbitTemplate rabbitTemplate,
                             ConfigRepository configRepository,
                             ConfigMapper configMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.configRepository = configRepository;
        this.configMapper = configMapper;
    }

    /**
     * {@inheritDoc}
     */
    public ConfigDto createConfig(ConfigDto configDto) {
        Config config = configRepository.save(configMapper.toConfig(configDto));
        ConfigDto savedConfigDto = configMapper.toConfigDto(config);
        rabbitTemplate.convertAndSend(RabbitContants.QUEUE_CONFIGS, savedConfigDto);
        return savedConfigDto;
    }
}
