package com.example.ecom.repository;

import com.example.ecom.models.Ecom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MailOto  extends MongoRepository<Ecom, UUID> {
}
