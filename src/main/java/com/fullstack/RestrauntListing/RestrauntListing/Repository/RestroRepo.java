package com.fullstack.RestrauntListing.RestrauntListing.Repository;

import com.fullstack.RestrauntListing.RestrauntListing.Entity.Restraunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestroRepo extends JpaRepository<Restraunt, Integer> {
}
