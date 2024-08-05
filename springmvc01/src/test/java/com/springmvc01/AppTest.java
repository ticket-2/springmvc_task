package com.springmvc01;


import com.springmvc01.POJO.User;
import com.springmvc01.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AppTest {

   /* private JdbcTemplate jdbcTemplate;
    private ApplicationContext applicationContext;*/
    @Autowired
    private UserService userService;

   /*@Autowired
    private JdbcTemplate jdbcTemplate;*/
    /*@Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
    }*/

    @Test
    public void test01() {
        /*String sql = "insert into t_use values (null, ?, ?)";
        jdbcTemplate.update(sql,"hijack",24);*/
        User user = new User();
        user.setName("yet");
        user.setAge(199);
        int count = userService.addUser(user);
        System.out.println("inflect rows:" +count);
    }
}
