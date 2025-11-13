package com.backend.lane.controllers;

import com.backend.lane.domain.Filters;
import com.backend.lane.service.FiltersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/filters")
public class FiltersController {

    //Here we bring the Method Filters Service
    FiltersService filtersService;

    //This method will receive all the Services created on the Filter Service
    public FiltersController(FiltersService filtersService){
        this.filtersService = filtersService;
    }

    //Get all the filters created at Event
    @GetMapping("/get")
    public List<Filters> getAllFilters() {
        return filtersService.getAllFilters();
    }

    //Create Filters
    @PostMapping("/create")
    public ResponseEntity<FiltersService> createFilters (@RequestBody Filters filters){
        return null;
    }

    //Delete all the filters
    @DeleteMapping("/{id}")
    public void deleteFilters (@PathVariable Long id){
        filtersService.deleteFilters(id);
    }
}
