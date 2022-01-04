package com.example.ecom.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "otherdata")
public class ExModel {

    @Id
    private UUID exId;
    private String exCity;

    //PARAMETERIZED CONSTRUCTOR
    public ExModel(UUID exId, String exCity) {
        this.exId = exId;
        this.exCity = exCity;
    }

    //DEFAULT CONSTRUCTOR
    public ExModel() {
        this.exId = UUID.randomUUID();
    }

    //GETTERS AND SETTERS
    public UUID getExId() {
        return exId;
    }
    public void setExId(UUID exId) {
        this.exId = exId;
    }
    public String getExCity() {
        return exCity;
    }
    public void setExCity(String exCity) {
        this.exCity = exCity;
    }

    @Override
    public String toString() {
        return "ExModel{" +
                "exId='" + exId + '\'' +
                ", exCity='" + exCity + '\'' +
                '}';
    }

}
