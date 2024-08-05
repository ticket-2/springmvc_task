package com.springmvc01.Service;

import com.springmvc01.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    /* @Resource(name ="jdbcTemplate")*/
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /*private ApplicationContext applicationContext;*/

    /*public List<User> getUserById()
    {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate =(JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        String sql = "select * from t_use";
        RowMapper<User> rowMapper =new BeanPropertyRowMapper<>(User.class);
        List<User> user = jdbcTemplate.query(sql, rowMapper);
        return user;
    }*/

    public int addUser( User user)
    {
        /*applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate =(JdbcTemplate) applicationContext.getBean("jdbcTemplate");*/
        String sql = "insert into t_use values(null,?, ?)";
        int count = jdbcTemplate.update(sql, user.getName(), user.getAge());
        return count;
    }
}
