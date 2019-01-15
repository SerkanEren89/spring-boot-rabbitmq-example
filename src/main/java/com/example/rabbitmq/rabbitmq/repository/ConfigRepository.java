package com.example.rabbitmq.rabbitmq.repository;

import com.example.rabbitmq.rabbitmq.model.Config;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Config repository
 *
 * @author eren
 */
public interface ConfigRepository  extends JpaRepository<Config, Long> {
}
