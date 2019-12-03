package com.example.ps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@SpringBootApplication
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
}
