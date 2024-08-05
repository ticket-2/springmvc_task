package com.springmvc01.controller;



import com.springmvc01.POJO.User;
import com.springmvc01.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/*import org.springframework.web.bind.annotation.*;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController {

    //该方法无法返回jsp页面
   /* @RequestMapping(value = "/home")
    public String home_func()
    {
        return "home";    //无法返回home.jsp
    }*/
    /*@Autowired
    private UserService userService;*/
    /*private UserService userService;*/
    @Autowired
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "index"; // 返回home.jsp视图
    }

    @RequestMapping(value="/home", method= RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("hello");
        return mv;
    }

    @GetMapping("/jsonView")
    public ModelAndView getJsonData(Model model) {
        /*List<String> data = Arrays.asList("Item1", "Item2", "Item3");
        model.addAttribute("data", data);*/
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

    /*@RequestMapping("/selec")
    public String selec()
    {
       userService.getUserById();
       return "OK";

    }*/



    @RequestMapping("/addUser")
    public String addUser()
    {
        /*参数
        @RequestParam(name = "name", required = false) String name, int age*/
        User user = new User();
        user.setName("asexual");
        user.setAge(15);
        int count = userService.addUser(user);
        System.out.println("successful/adduser");
        System.out.println(count);
        return "OK";
    }




}
