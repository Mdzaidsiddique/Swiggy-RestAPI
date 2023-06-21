package com.masai.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer restaurantId;

	@NotNull(message="value can not be null")
    private String name;

	@NotNull(message="value can not be null")
    private String address;

	
	@OneToMany(mappedBy = "restaurant" , cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Orders> orders ;
	
	@ManyToMany
	private List<DeliveryPartner> delivaryList = new ArrayList<>();

	public Restaurant(Integer restaurantId, @NotNull(message = "value can not be null") String name,
			@NotNull(message = "value can not be null") String address, List<Orders> orders,
			List<DeliveryPartner> delivaryList) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.address = address;
		this.orders = orders;
		this.delivaryList = delivaryList;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<DeliveryPartner> getDelivaryList() {
		return delivaryList;
	}

	public void setDelivaryList(List<DeliveryPartner> delivaryList) {
		this.delivaryList = delivaryList;
	}

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

}