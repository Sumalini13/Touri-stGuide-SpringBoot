package com.tour.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tour.demo.Entity.PlacesEntity;

public interface PlaceRepo extends JpaRepository<PlacesEntity,Long>{

}
