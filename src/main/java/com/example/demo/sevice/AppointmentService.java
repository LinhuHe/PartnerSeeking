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
    @Autowired
    public ReplyService replyService;
    @Autowired
    public PostService postService;


    public List<Appointment> findAllByUID(String uid)
    {
        if(uid==null)
        {
            System.out.println("findPIDByUID:uid is null");
            return null;
        }

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

    public boolean addAppointment(Appointment newap)
    {
        if(newap ==null)
        {
            System.out.println("addAppointment:newap is null");
            return false;
        }
        else if(newap.getaInviterid()==null)
        {
            System.out.println("addAppointment:newap.aInviterid is null");
            return false;
        }
        else if(newap.getaInvitedid()==null)
        {
            System.out.println("addAppointment:newap.aInvitedid is null");
            return false;
        }

        replyService.deleteReplyByPid(newap.getaPid()); //删除帖子相关回复
        postService.deleteByPid(newap.getaPid()); //删除帖子

        appointmentMapper.insert(newap); //
        return true;
    }

    public List<Appointment> findInviterByUID(String uid)
    {
        AppointmentExample ae = new AppointmentExample();
        AppointmentExample.Criteria criteria = ae.createCriteria();

        criteria.andAInviteridEqualTo(uid);

        return appointmentMapper.selectByExample(ae);
    }

    public List<Appointment> findInvitedByUID(String uid)
    {
        AppointmentExample ae = new AppointmentExample();
        AppointmentExample.Criteria criteria = ae.createCriteria();

        criteria.andAInvitedidEqualTo(uid);

        return appointmentMapper.selectByExample(ae);
    }



}
