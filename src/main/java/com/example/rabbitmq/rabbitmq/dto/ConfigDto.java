package com.example.rabbitmq.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Config dto
 *
 * @author eren
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigDto implements Serializable {

    private String name;

    private String type;
}
