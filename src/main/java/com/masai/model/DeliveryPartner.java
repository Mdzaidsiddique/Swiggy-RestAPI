package com.masai.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class DeliveryPartner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deliveryPartnerId;
	@NotNull
    private String name;
	@Size(min=10 , max=13 , message="length should be proper")
    private String phoneNumber;
	
	@OneToMany(mappedBy = "deliveryPartner" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Orders> orders ;
	
	@ManyToMany(mappedBy = "delivaryList")
	@JsonIgnore
	private List<Restaurant> restaurants = new ArrayList<>() ;

	public Integer getDeliveryPartnerId() {
		return deliveryPartnerId;
	}

	public void setDeliveryPartnerId(Integer deliveryPartnerId) {
		this.deliveryPartnerId = deliveryPartnerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public DeliveryPartner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeliveryPartner(Integer deliveryPartnerId, @NotNull String name,
			@Size(min = 10, max = 13, message = "length should be proper") String phoneNumber, List<Orders> orders,
			List<Restaurant> restaurants) {
		super();
		this.deliveryPartnerId = deliveryPartnerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.orders = orders;
		this.restaurants = restaurants;
	}
	
	

}