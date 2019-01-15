package com.example.rabbitmq.rabbitmq.controller;

import com.example.rabbitmq.rabbitmq.dto.ConfigDto;
import com.example.rabbitmq.rabbitmq.service.ConfigService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Config controller
 *
 * @author eren
 */
@RestController("/configs")
public class ConfigController {

    private final ConfigService configService;

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @PostMapping
    public ResponseEntity<ConfigDto> createConfig(@RequestBody final ConfigDto configDto) {
        return new ResponseEntity<>(configService.createConfig(configDto), HttpStatus.CREATED);
    }
}
