package com.example.ecom.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection = "mailOtp")
public class Ecom {
    @Id
  private UUID ecomId;
    private String otp;
public  Ecom(){
    this.ecomId=UUID.randomUUID();

}
    public Ecom(UUID ecomId, String otp) {
        this.ecomId = ecomId;
        this.otp = otp;
    }

    public UUID getEcomId() {
        return ecomId;
    }

    public void setEcomId(UUID ecomId) {
        this.ecomId = ecomId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
    //    private List<> dataList;

    @Override
    public String toString() {
        return "Ecom{" +
                "ecomId=" + ecomId +
                ", otp='" + otp + '\'' +
                '}';
    }
}
