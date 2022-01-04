package com.example.ecom.service;

import com.example.ecom.models.Demo;
import com.example.ecom.repository.DemoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;


    //GET ALL DEMOS
    public List<Demo> getDemoList() {
        return demoRepository.findAll();
    }

    //ADD DEMO
    public List<Demo> addDemo(Demo demo) {
//        Demo demo1 =new Demo();
//        demo1.setExList();
        demoRepository.save(demo);
        return demoRepository.findAll();
    }

    //GET ONE DEMO BY ID
    public Optional<Demo> getById(UUID demoId) {
        return demoRepository.findById(demoId);
    }

    public void deleteId(UUID demoId) {
        demoRepository.deleteById(demoId);
    }

    public Optional<Demo> putById(UUID demoId, Demo demo1) {
        Demo _demo = demoRepository.findById(demoId).orElse(null);
        if (_demo != null) {
            _demo.setDemoName(demo1.getDemoName());
            _demo.setDemoRoll(demo1.getDemoRoll());
            demoRepository.save(_demo);
        } else {
            return null;
        }
        return demoRepository.findById(demoId);
    }
}
