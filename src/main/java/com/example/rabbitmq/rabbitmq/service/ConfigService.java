package com.example.rabbitmq.rabbitmq.service;

import com.example.rabbitmq.rabbitmq.dto.ConfigDto;

/**
 * Config service
 *
 * @author eren
 */
public interface ConfigService {

    ConfigDto createConfig(ConfigDto configDto);
}
