package com.tour.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tour.demo.Entity.PlacesEntity;
import com.tour.demo.Service.Service123;


	


	@CrossOrigin
	@RestController
	public class Controller123 {
			@Autowired
			private Service123 placeSer;

			@GetMapping("/getPlaces")
			public List<PlacesEntity> getDetails(){
				return placeSer.getAllDetails();
		   }
			
			@PostMapping("/addPlaces")
			public PlacesEntity postDetails(@RequestBody PlacesEntity s) {
				return placeSer.savedetails(s);
				
			}
			@DeleteMapping ("/delete/{placeid}")
			public void delete(@PathVariable("placeid") long placeid) {
				placeSer.deleteDepartmentById(placeid);
			}
			@PutMapping("/update/{placeid}")
		      public  PlacesEntity  update(@PathVariable long placeid,@RequestBody PlacesEntity s) {
		    	  return placeSer.update(placeid, s);
		      }

	}


