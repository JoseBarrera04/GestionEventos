package com.radagon.gestioneventos.service;

import com.radagon.gestioneventos.model.Event;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    private final List<Event> events = new ArrayList<>();

    public List<Event> getAllEvents() {
        return events;
    }

    public Event getEventByName(String name) {
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(name)) {
                return event;
            }
        }
        return null;
    }

    public Event createEvent(Event event) {
        events.add(event);
        return event;
    }

    public Event updateEvent(@RequestBody Event event) {
        for (Event e : events) {
            if (e.getName().equalsIgnoreCase(event.getName())) {
                e.setDate(event.getDate());
                e.setOpeningTime(event.getOpeningTime());
                e.setStartTime(event.getStartTime());
                e.setPlace(event.getPlace());
                e.setAddress(event.getAddress());
                e.setCity(event.getCity());
                e.setCapacity(event.getCapacity());
                e.setStatus(event.getStatus());
                e.setCurrentCapacity(event.getCurrentCapacity());
                e.setPrice(event.getPrice());
                return e;
            }
        }
        return null;
    }

    public Event deleteEvent(@PathVariable String name) {
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(name)) {
                events.remove(event);
                return event;
            }
        }
        return null;
    }

    public Event updateEventStatus(@RequestBody Event event) {
        for (Event e : events) {
            if (e.getName().equalsIgnoreCase(event.getName())) {
                e.setStatus(event.getStatus());
                return e;
            }
        }
        return null;
    }
}
