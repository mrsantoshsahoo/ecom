package com.example.ecom.service;

import com.example.ecom.models.Demo;
import com.example.ecom.models.Ecom;
import com.example.ecom.models.ExModel;
import com.example.ecom.repository.ExRepository;
import com.example.ecom.repository.MailOto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.*;

@Service
public class ExService {

    @Autowired
    private ExRepository exRepository;
    @Autowired
    private MailOto mailOto;
    @Autowired
    private JavaMailSender javaMailSender;


    public List<ExModel> getExData() {
        return exRepository.findAll();
    }



    public String getMail(String mail) {
      String otp=  new DecimalFormat("000000").format(new Random().nextInt(999999));
        Ecom ecom=new Ecom();
        ecom.setOtp(otp);
        mailOto.save(ecom);
        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("mrsantoshh.sahoo07@gmail.com");
        message.setTo(mail);
        message.setSubject("Varification Code");
        message.setText("Your otp is "+otp+" don't share to any one");

        javaMailSender.send(message);

        return "Mail sent successfully";

    }
    public String validateMetMail() {

//        if (){
//            return  "suessesfully validate";
//        }else {
//            return  "suessesfully validate";
//        }
        return  "suessesfully validate";
    }
    public String getOtp(){
        return  new DecimalFormat("000000").format(new Random().nextInt(999999));
    }
    public  Page<ExModel> getDemoListPagination(int pageSize,int PageNo) {
        Page<ExModel> all = exRepository.findAll(PageRequest.of(pageSize, PageNo));
        return all;
    }

    public List<ExModel> postExData(ExModel exModel) {
        exRepository.save(exModel);
        return exRepository.findAll();
    }

    public Optional<ExModel> updateData(UUID exId) {
        exRepository.findById(exId);
        return exRepository.findById(exId);
    }
}
