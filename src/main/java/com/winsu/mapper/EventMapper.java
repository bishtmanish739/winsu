package com.winsu.mapper;

import com.winsu.domain.Event;
import com.winsu.dto.EventDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface EventMapper {

    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);


    EventDTO toDto(Event event);


    Event toEntity(EventDTO eventDTO);
}
