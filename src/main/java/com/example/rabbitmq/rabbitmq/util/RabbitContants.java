package com.example.rabbitmq.rabbitmq.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Application general contants
 *
 * @author eren
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RabbitContants {

    public static final String QUEUE_CONFIGS = "configs-queue";
    public static final String QUEUE_DEAD_CONFIGS = "dead-configs-queue";
    public static final String EXCHANGE_CONFIGS = "configs-exchange";
}
