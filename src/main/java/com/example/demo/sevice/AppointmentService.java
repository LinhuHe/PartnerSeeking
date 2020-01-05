package com.example.demo.sevice;


import com.example.demo.controller.AppointmentController;
import com.example.demo.entity.*;
import com.example.demo.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.table.AbstractTableModel;
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
    @Autowired
    public UserService userService;


    public List<AppointUser> findAllByUID(String uid)
    {
        if(uid==null)
        {
            System.out.println("findPIDByUID:uid is null");
            return null;
        }
        int index = 0;

        List<Appointment> Atemp = new ArrayList<>();
        List<User> Utemp = new ArrayList<>();
        List<String> Ptemp = new ArrayList<>(); //post 标题
        List<AppointUser> finalresult = new ArrayList<>(); //存放appointuser pojo类
        AppointmentExample ae=new AppointmentExample();
        AppointmentExample.Criteria criteria=ae.createCriteria();

        criteria.andAInviteridEqualTo(uid);
        Atemp = appointmentMapper.selectByExample(ae); //获取到“我”是inviter的appointment数据

        //System.out.println(Atemp.toString());
        for(index=0;index<Atemp.size();index++)
        {
            try {
                Utemp.add(userService.getInfoByUid(Atemp.get(index).getaInvitedid()).get(0)); //根据intervied添加相应userinfo
                Ptemp.add(postService.postmapper.selectByPrimaryKeyNoBan(Atemp.get(index).getaPid()).getpTittle()); //ptittle
            }
            catch (Exception e)
            {
                System.out.println("是否存在无信息的人 "+ e);
            }
        }


        AppointmentExample aae=new AppointmentExample();
        AppointmentExample.Criteria acriteria=aae.createCriteria();
        acriteria.andAInvitedidEqualTo(uid);
        Atemp.addAll(appointmentMapper.selectByExample(aae)); ////获取到“我”是invited的appointment数据

        for(;index<Atemp.size();index++)
        {
            try {
                Utemp.add(userService.getInfoByUid(Atemp.get(index).getaInvitedid()).get(0)); //根据intervier添加相应userinfo
                Ptemp.add(postService.postmapper.selectByPrimaryKeyNoBan(Atemp.get(index).getaPid()).getpTittle());
            }
            catch (Exception e)
            {
                System.out.println("是否存在无信息的人 "+ e);
            }
        }

        System.out.println("findAllByUID->Ptemp : "+Ptemp.toString());

        for(int i=0;i<Atemp.size();i++)
        {
            try {
                finalresult.add(new AppointUser(Atemp.get(i), Utemp.get(i), Ptemp.get(i)));
            }
            catch (Exception e)
            {
                System.out.println("若是数组越界 请检查是否存在不存在的pid在appointment中 " +e);
            }
        }

        return finalresult;
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
        postService.setPostUnable(newap.getaPid(),(byte)1); //帖子设为不可见

        appointmentMapper.insert(newap); //
        return true;
    }

    public List<Appointment> findInviterByUID(String uid)
    {
        if(uid == null)
        {
            System.out.println("findInviterByUID -> uid is null");
            return null;
        }

        AppointmentExample ae = new AppointmentExample();
        AppointmentExample.Criteria criteria = ae.createCriteria();

        criteria.andAInviteridEqualTo(uid);

        return appointmentMapper.selectByExample(ae);
    }

    public List<Appointment> findInvitedByUID(String uid)
    {
        if(uid == null)
        {
            System.out.println("findInvitedByUID -> uid is null");
            return null;
        }

        AppointmentExample ae = new AppointmentExample();
        AppointmentExample.Criteria criteria = ae.createCriteria();

        criteria.andAInvitedidEqualTo(uid);

        return appointmentMapper.selectByExample(ae);
    }



}
