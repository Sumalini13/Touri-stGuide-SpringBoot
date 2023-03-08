package com.tour.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




	@Entity
	@Table(name="PlacesEntity")
	public class PlacesEntity {

		@Id
		private long placeid;
		private String travelSpot;
		private int price;
		private String location;
		private String famousFood;
		private int locationid;
		private long pincode;
		private long agentno;
		private String agentName;
		private String country;
		public int getLocationid() {
			return locationid;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public void setLocationid(int locationid) {
			this.locationid = locationid;
		}
		public long getPincode() {
			return pincode;
		}
		public void setPincode(long pincode) {
			this.pincode = pincode;
		}
		public long getAgentno() {
			return agentno;
		}
		public void setAgentno(long agentno) {
			this.agentno = agentno;
		}
		public String getAgentName() {
			return agentName;
		}
		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}
		public long getPlaceid() {
			return placeid;
		}
		public void setPlaceid(long placeid) {
			this.placeid = placeid;
		}
		public String getTravelSpot() {
			return travelSpot;
		}
		public void setTravelSpot(String travelSpot) {
			this.travelSpot = travelSpot;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getFamousFood() {
			return famousFood;
		}
		public void setFamousFood(String famousFood) 
		{
			this.famousFood = famousFood;
		}
		
		public PlacesEntity(long placeid,String travelSpot,int price,String location,String famousFood,int locationid,long pincode,long agentno,String agentName, String country ) 
		{
			super();
			this.placeid = placeid;
			this.travelSpot = travelSpot;
			this.price = price;
			this.location = location;
			this.famousFood = famousFood;	
			this.locationid = locationid;
			this.pincode = pincode;
			this.agentno = agentno;
			this.agentName = agentName;
			this.country = country;
		
		}
		public PlacesEntity()
		{
			
		}
	}
		

