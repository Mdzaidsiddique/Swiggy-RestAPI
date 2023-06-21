package com.masai.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
////import lombok.AllArgsConstructor;
////import lombok.Data;
////import lombok.NoArgsConstructor;
//
//
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
@Entity
public class Orders {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	@NotNull(message="value can not be null")
    private String customerId;
	@NotNull(message="value can not be null")
    private String restaurantId;
	@NotNull(message="value can not be null")
    private String deliveryPartnerId;
	@NotNull(message="value can not be null")
    private List<String> items;
	@NotNull(message="value can not be null")
    private OrderStatus orderStatus;
	
	@ManyToOne
	private Customer customer ;
	@ManyToOne
	private Restaurant restaurant ;
	@ManyToOne
	private DeliveryPartner deliveryPartner ;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(Integer orderId, @NotNull(message = "value can not be null") String customerId,
			@NotNull(message = "value can not be null") String restaurantId,
			@NotNull(message = "value can not be null") String deliveryPartnerId,
			@NotNull(message = "value can not be null") List<String> items,
			@NotNull(message = "value can not be null") OrderStatus orderStatus, Customer customer,
			Restaurant restaurant, DeliveryPartner deliveryPartner) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.deliveryPartnerId = deliveryPartnerId;
		this.items = items;
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.restaurant = restaurant;
		this.deliveryPartner = deliveryPartner;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getDeliveryPartnerId() {
		return deliveryPartnerId;
	}
	public void setDeliveryPartnerId(String deliveryPartnerId) {
		this.deliveryPartnerId = deliveryPartnerId;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public DeliveryPartner getDeliveryPartner() {
		return deliveryPartner;
	}
	public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
		this.deliveryPartner = deliveryPartner;
	}
	
	
	
	
}