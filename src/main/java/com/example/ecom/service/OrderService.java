package com.example.ecom.service;

import com.example.ecom.models.ComplaintModel;
import com.example.ecom.models.OrdersData;
import com.example.ecom.repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrdersRepo ordersRepo;
    public List<OrdersData> getOrdersList() {
        return  ordersRepo.findAll();
    }

    public String postOrders(OrdersData complaintModel) {
        ordersRepo.save(complaintModel);
        return "Create Order Complain Sucessfully";
    }
}
