package com.fullstack.RestrauntListing.RestrauntListing.Service;

import com.fullstack.RestrauntListing.RestrauntListing.Entity.Restraunt;
import com.fullstack.RestrauntListing.RestrauntListing.Repository.RestroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestrauntService {

    @Autowired
    RestroRepo restroRepo;

    public List<Restraunt> getAllRestraunts() {
        return restroRepo.findAll();
    }

    public Restraunt getRestrauntById(int id) {
        return restroRepo.findById(id).get();
    }

    public Restraunt addRestraunt(Restraunt restraunt) {
        return restroRepo.save(restraunt);
    }
}
