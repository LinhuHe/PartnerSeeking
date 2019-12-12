package com.example.demo.sevice;


import com.example.demo.controller.AppointmentController;
import com.example.demo.entity.*;
import com.example.demo.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    public AppointmentMapper appointmentMapper;
    @Autowired
    public AppointmentController appointmentController;


    public List<Appointment> findPIDByUID(String uid)
    {
        List<Appointment> temp = new ArrayList<>();
        AppointmentExample ue=new AppointmentExample();
        AppointmentExample.Criteria criteria=ue.createCriteria();

        criteria.andAInviteridEqualTo(uid);
        temp = appointmentMapper.selectByExample(ue);

        AppointmentExample aue=new AppointmentExample();
        AppointmentExample.Criteria acriteria=aue.createCriteria();
        acriteria.andAInvitedidEqualTo(uid);
        temp.addAll(appointmentMapper.selectByExample(aue));

        return temp;
    }



}
