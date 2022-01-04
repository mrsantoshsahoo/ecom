package com.example.ecom.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Document(collection = "orders")
public class OrdersData {
    @Id
    private UUID orderId;
    private String itemName;
    private int itemRepeet;
    private double itemPrice;
    private String issueTitle;
    private String issueRemark;
    private List<String>  issueImag;
    private String issueStatus;
    private String issueResulvedTitle;
    private String issueResulvedRemark;

    public OrdersData() {
        this.orderId = UUID.randomUUID();
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemRepeet() {
        return itemRepeet;
    }

    public void setItemRepeet(int itemRepeet) {
        this.itemRepeet = itemRepeet;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public String getIssueRemark() {
        return issueRemark;
    }

    public void setIssueRemark(String issueRemark) {
        this.issueRemark = issueRemark;
    }

    public List<String> getIssueImag() {
        return issueImag;
    }

    public void setIssueImag(List<String> issueImag) {
        this.issueImag = issueImag;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getIssueResulvedTitle() {
        return issueResulvedTitle;
    }

    public void setIssueResulvedTitle(String issueResulvedTitle) {
        this.issueResulvedTitle = issueResulvedTitle;
    }

    public String getIssueResulvedRemark() {
        return issueResulvedRemark;
    }

    public void setIssueResulvedRemark(String issueResulvedRemark) {
        this.issueResulvedRemark = issueResulvedRemark;
    }

    @Override
    public String toString() {
        return "OrdersData{" +
                "orderId=" + orderId +
                ", itemName='" + itemName + '\'' +
                ", itemRepeet=" + itemRepeet +
                ", itemPrice=" + itemPrice +
                ", issueTitle='" + issueTitle + '\'' +
                ", issueRemark='" + issueRemark + '\'' +
                ", issueImag=" + issueImag +
                ", issueStatus='" + issueStatus + '\'' +
                ", issueResulvedTitle='" + issueResulvedTitle + '\'' +
                ", issueResulvedRemark='" + issueResulvedRemark + '\'' +
                '}';
    }
}
