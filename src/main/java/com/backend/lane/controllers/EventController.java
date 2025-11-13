package com.backend.lane.controllers;

import com.backend.lane.domain.Event;
import com.backend.lane.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    //This method will get all the events created on the App
    @GetMapping("/events/{id}")
    public ResponseEntity<List<EventService>> getAllEvents(@PathVariable Long id){
        return null;
    }

    //Create Events
    @PostMapping("/create")
    public ResponseEntity<EventService> createEvent (@RequestBody Event event) {return null;}

    //Delete a user from the event
    @DeleteMapping("delete/{id}")
    public void deleteEvent(@PathVariable Long id){
        eventService.deleteEvent(id);
    }

}
