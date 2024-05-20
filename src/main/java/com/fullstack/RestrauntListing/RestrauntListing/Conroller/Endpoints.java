package com.fullstack.RestrauntListing.RestrauntListing.Conroller;

import com.fullstack.RestrauntListing.RestrauntListing.Entity.Restraunt;
import com.fullstack.RestrauntListing.RestrauntListing.Service.RestrauntService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restraunt")
public class Endpoints {

    @Autowired
    RestrauntService restrauntService;

    @GetMapping("/all")
    public ResponseEntity<List<Restraunt>> getAllRestraunts() {
        return new ResponseEntity<>(restrauntService.getAllRestraunts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restraunt> getRestrauntById(@PathVariable int id) {
        return new ResponseEntity<>(restrauntService.getRestrauntById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Restraunt> addRestraunt(@RequestBody Restraunt restraunt) {
        return new ResponseEntity<>(restrauntService.addRestraunt(restraunt), HttpStatus.CREATED);
    }
}
