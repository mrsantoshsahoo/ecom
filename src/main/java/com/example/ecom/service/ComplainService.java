package com.example.ecom.service;

import com.example.ecom.models.ComplaintModel;
import com.example.ecom.repository.ComplaintRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComplainService {
    @Autowired
    private ComplaintRepo complaintRepo;
    public List<ComplaintModel> getComplaints() {
        return complaintRepo.findAll();
    }

    public String postComplaints(ComplaintModel complaintModel) {
        complaintRepo.save(complaintModel);
        return  "Complain Post Sucessfully";
    }
}
