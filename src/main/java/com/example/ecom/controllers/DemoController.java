package com.example.ecom.controllers;

import com.example.ecom.models.Demo;
import com.example.ecom.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/demo1")
public class DemoController {

    @Autowired
    private DemoService demoService;

    //GET ALL DEMOS
    @GetMapping("")
    public List<Demo> getDemoList() {
        return demoService.getDemoList();
    }

    //ADD ONE DEMO
    @PostMapping("")
    public List<Demo> addDemo(@RequestBody Demo demo) {
        return demoService.addDemo(demo);
    }

    //GET DEMO BY ID
    @GetMapping("/{demoId}")
    public Optional<Demo> getById(@PathVariable UUID demoId) {
        return demoService.getById(demoId);
    }

    @DeleteMapping("/{demoId}")
    public String deleteId(@PathVariable UUID demoId) {
        demoService.deleteId(demoId);
        return "Data Deleted Sucessfully";
    }

    @PutMapping("/{demoId}")
    public Optional<Demo> putById(@PathVariable UUID demoId, @RequestBody Demo demo) {
        demoService.putById(demoId, demo);
        return demoService.putById(demoId,demo);
    }

}
