package com.masai.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


//@AllArgsConstructor
//@NoArgsConstructor
//@Data
@Entity
public class Customer {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	
	@NotNull(message = "Name can not be null")
    private String name;
	@Email(message = "Email sould be in a proper format")
    private String email;
	@NotNull(message= "address is mandatory")
    private String address;
	
	@OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Orders> orders ;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, @NotNull(message = "Name can not be null") String name,
			@Email(message = "Email sould be in a proper format") String email,
			@NotNull(message = "address is mandatory") String address, List<Orders> orders) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", orders=" + orders + "]";
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	
	


}
