package com.radagon.gestioneventos.controller;

import com.radagon.gestioneventos.model.Event;
import com.radagon.gestioneventos.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{name}")
    public Event getEventByName(@PathVariable String name) {
        return eventService.getEventByName(name);
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PutMapping
    public Event updateEvent(@RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @DeleteMapping("/{name}")
    public Event deleteEvent(@PathVariable String name) {
        return eventService.deleteEvent(name);
    }

    @PatchMapping
    public Event updateEventStatus(@RequestBody Event event) {
        return eventService.updateEventStatus(event);
    }
}
