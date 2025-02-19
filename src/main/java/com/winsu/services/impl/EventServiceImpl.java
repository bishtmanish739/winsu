package com.winsu.services.impl;

import com.winsu.domain.Event;
import com.winsu.dto.EventDTO;
import com.winsu.mapper.EventMapper;
import com.winsu.repository.EventRepository;
import com.winsu.services.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    public EventServiceImpl(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = eventMapper.toEntity(eventDTO);
        return eventMapper.toDto(eventRepository.save(event));
    }

    @Override
    public EventDTO getEventById(Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));
        return eventMapper.toDto(event);
    }

    @Override
    public List<EventDTO> getAllEvents() {
        return eventRepository.findAll().stream()
                .map(eventMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public EventDTO updateEvent(Long id, EventDTO eventDTO) {
        Event existingEvent = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));

        existingEvent.setEventName(eventDTO.getEventName());
        existingEvent.setStartTime(eventDTO.getStartTime());
        existingEvent.setEndTime(eventDTO.getEndTime());
        existingEvent.setStatus(eventDTO.getStatus().name());
        existingEvent.setEventImageUrl(eventDTO.getEventImageUrl());

        return eventMapper.toDto(eventRepository.save(existingEvent));
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
