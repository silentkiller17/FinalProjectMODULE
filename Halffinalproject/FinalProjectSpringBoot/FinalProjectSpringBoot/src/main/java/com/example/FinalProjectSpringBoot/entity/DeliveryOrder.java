package com.example.FinalProjectSpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class DeliveryOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private String deliveryAddress;
    private String status;

  

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
        return orderId;
    }

    public void setCustomerId(Long customerId) {
        this.orderId = customerId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getStatus() {
        return status;
    }

	

	public DeliveryOrder() {
		
	}

	public DeliveryOrder(Long id,Long orderId, String deliveryAddress, String status) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.deliveryAddress = deliveryAddress;
		this.status = status;
	}

	public static DeliveryOrder save(DeliveryOrder order) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStatus (String status2) {
		// TODO Auto-generated method stub
		
	}
}
