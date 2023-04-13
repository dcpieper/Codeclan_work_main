package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {
    private final WhiskyRepository whiskyRepository;

    public WhiskyController(WhiskyRepository whiskyRepository) {
        this.whiskyRepository = whiskyRepository;
    }

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> findWhiskiesFilterByYearQueryString(@RequestParam(name = "year", required = false) Integer year){
        if (year!=null){
            return new ResponseEntity<>(whiskyRepository.findByYear(year), HttpStatus.OK);
        }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/age/")
    public ResponseEntity<List<Whisky>> findWhiskiesFilterByAgeQueryString(@RequestParam(name = "age", required = false) Integer age){
        if (age!=null){
            return new ResponseEntity<>(whiskyRepository.findByAge(age), HttpStatus.OK);
        }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }


}
