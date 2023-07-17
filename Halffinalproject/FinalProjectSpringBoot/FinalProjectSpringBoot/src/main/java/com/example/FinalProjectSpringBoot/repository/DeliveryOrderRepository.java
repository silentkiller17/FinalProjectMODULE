package com.example.FinalProjectSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalProjectSpringBoot.entity.DeliveryOrder;

public interface DeliveryOrderRepository extends JpaRepository<DeliveryOrder, Long> {
	
	
}