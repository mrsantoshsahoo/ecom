package com.example.ecom.repository;

import com.example.ecom.models.OrdersData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OrdersRepo extends MongoRepository<OrdersData, UUID> {
}
