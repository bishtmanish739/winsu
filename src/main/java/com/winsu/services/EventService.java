package com.winsu.services;

import com.winsu.dto.EventDTO;

import java.util.List;

public interface EventService {
    EventDTO createEvent(EventDTO eventDTO);

    EventDTO getEventById(Long id);

    List<EventDTO> getAllEvents();

    EventDTO updateEvent(Long id, EventDTO eventDTO);

    void deleteEvent(Long id);
}
