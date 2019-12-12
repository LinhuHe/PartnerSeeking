package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.AppointmentExample;
import com.example.demo.sevice.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    /*根据传入的uid,找到所有和这个id有关的已达成的约定*/
    @RequestMapping("/appointment/findPIDByUID")
    public List<Appointment> findPIDByUID(String uid)
    {
        return appointmentService.findPIDByUID(uid);
    }


}
