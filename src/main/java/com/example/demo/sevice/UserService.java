package com.example.demo.sevice;

import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.mapper.UserMapper;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public boolean addUserInfo(User u)
    {
        if(u==null) {
            return false;
        }
        System.out.println(u);

        UserExample ue = new UserExample();
        UserExample.Criteria criteria = ue.createCriteria();
        criteria.andUIdEqualTo(u.getuId());

        int num = userMapper.countByExample(ue);

        if(num>0)
        {
            System.out.println("不重复授权");
            return false;
        }

        userMapper.insert(u);
        return true;


    }

    public List<User> getInfoByUid(String uid)
    {


        UserExample ue = new UserExample();
        UserExample.Criteria criteria = ue.createCriteria();

        criteria.andUIdEqualTo(uid);

        return userMapper.selectByExample(ue);
    }

}
