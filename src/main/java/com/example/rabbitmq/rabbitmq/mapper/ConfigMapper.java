package com.example.rabbitmq.rabbitmq.mapper;

import com.example.rabbitmq.rabbitmq.dto.ConfigDto;
import com.example.rabbitmq.rabbitmq.model.Config;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Config mapper
 *
 * @author eren
 */
@Mapper(componentModel = "spring")
public interface ConfigMapper {

    ConfigDto toConfigDto(Config config);

    @Mapping(ignore = true, target = "id")
    Config toConfig(ConfigDto configDto);
}
