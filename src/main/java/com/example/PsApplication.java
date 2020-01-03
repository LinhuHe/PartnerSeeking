package com.example;

import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.apache.commons.lang.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@EnableScheduling
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class PsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsApplication.class, args);
    }

    @RequestMapping()
    public String hellow() {
        return "hellow spring boot!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot!";
    }

   @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/getUsersID")   //just a testing of a successfully connection
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from user";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }

    @Autowired
    public UserMapper ump ;

    @RequestMapping("/test")
    public List<User> findUser(User u)  //find by id and/or nickname
    {


        UserExample ue=new UserExample();
        UserExample.Criteria criteria=ue.createCriteria();

        System.out.println(u.getuId()+"    "+u.getuNickname());

        if(u!=null)
        {
            if(u.getuId()!=null)
            criteria.andUIdEqualTo(u.getuId());
            if(u.getuNickname()!=null)
            criteria.andUNicknameEqualTo(u.getuNickname());
        }


        return ump.selectByExample(ue);
    }
}
