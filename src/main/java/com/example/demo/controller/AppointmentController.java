package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.AppointmentExample;
import com.example.demo.sevice.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    /*根据传入的uid,找到所有和这个id有关的已达成的约定*/
    @RequestMapping("/findAllByUID/{id}")
    public List<Appointment> findAllByUID(@PathVariable("id") String uid)
    {
        return appointmentService.findAllByUID(uid);
    }

    /*添加appointment信息*/
    @RequestMapping("/addAppointment")
    public boolean addAppointment(String aInviterid,String aInvitedid,int aPid)
    {
        return appointmentService.addAppointment(new Appointment(aInviterid,aInvitedid,aPid));
    }

    @RequestMapping("/findInviterByUID/{id}")
    public List<Appointment> findInviterByUID(@PathVariable("id") String uid)
    {
        return appointmentService.findInviterByUID(uid);
    }

    @RequestMapping("/findInvitedByUID/{id}")
    public List<Appointment> findInvitedByUID(@PathVariable("id") String uid)
    {
        return appointmentService.findInvitedByUID(uid);
    }


}
