package com.example.ecom.controllers;

import com.example.ecom.models.ComplaintModel;
import com.example.ecom.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complains")
public class ComplainControler {
    @Autowired
    private ComplainService complainService;

    @GetMapping("")
    public List<ComplaintModel> getComplaints(){
        return complainService.getComplaints();
    }
    @PostMapping("")
    public String postComplaints(@RequestBody ComplaintModel complaintModel){
        return complainService.postComplaints(complaintModel);
    }
}
