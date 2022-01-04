package com.example.ecom.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;
import java.util.UUID;

@Document(collection = "testCollection1")
public class Demo {

    @Id
    private UUID demoId;
    private String demoName;
    private String demoRoll;
    private List<ExModel> exList;

    public Demo() {
            this.demoId = UUID.randomUUID();
    }

    public Demo(UUID demoId, String demoName, String demoRoll, ExModel exModel, List<ExModel> exList) {
        this.demoId = demoId;
        this.demoName = demoName;
        this.demoRoll = demoRoll;
        this.exList = exList;
    }

    public UUID getDemoId() {
        return demoId;
    }
    public void setDemoId(UUID demoId) {
        this.demoId = demoId;
    }
    public String getDemoName() {
        return demoName;
    }
    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }
    public String getDemoRoll() {
        return demoRoll;
    }
    public void setDemoRoll(String demoRoll) {
        this.demoRoll = demoRoll;
    }
    public List<ExModel> getExList() {
        return exList;
    }
    public void setExList(List<ExModel> exList) {
        this.exList = exList;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "demoId='" + demoId + '\'' +
                ", demoName='" + demoName + '\'' +
                ", demoRoll='" + demoRoll + '\'' +
                ", exList=" + exList +
                '}';
    }

}
