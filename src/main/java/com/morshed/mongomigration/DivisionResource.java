package com.morshed.mongomigration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class DivisionResource {
    private final DivisionRepository divisionRepository;

    public DivisionResource(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @GetMapping
    public List<Division> getAllDivisions(){
        List<Division> divisions = divisionRepository.findAll();
        return divisionRepository.findAll();
    }
}
