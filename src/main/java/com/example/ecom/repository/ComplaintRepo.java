package com.example.ecom.repository;

import com.example.ecom.models.ComplaintModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ComplaintRepo extends MongoRepository<ComplaintModel, UUID> {
}
