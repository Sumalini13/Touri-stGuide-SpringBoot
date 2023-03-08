package com.tour.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.demo.Entity.PlacesEntity;
import com.tour.demo.Repository.PlaceRepo;


	
	@Service
	public class Service123 {
		

		
		     @Autowired     
		     private PlaceRepo place;
		     
		     public PlacesEntity savedetails(PlacesEntity s)
		     {
		    	 return place.save(s);
		     }
		     
		     public List<PlacesEntity> getAllDetails()
		     {    	 List<PlacesEntity> arr = new ArrayList<>();
		    	           arr=place.findAll();
		    	           return arr;
		  	   
		   	 }

		     public void deleteDepartmentById(long id)
		     {
		    	 place.deleteById(id);
		     }
		     
		   public  PlacesEntity update(long id,PlacesEntity s) {
			   return place.saveAndFlush(s);
		   }
		}


