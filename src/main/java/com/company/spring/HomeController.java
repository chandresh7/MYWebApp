package com.company.spring;


import com.company.Model.Coder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
  @RequestMapping("home")
  public String home(){
    System.out.println("hi");
    return "home";// don't  use .jsp here you have already defined it in application.properties
  }
    @RequestMapping("test")
    public ModelAndView home(Coder coder){
      System.out.println("hi");
      ModelAndView mv=new ModelAndView();
      mv.addObject("obj",coder);
      mv.setViewName("home");
      return mv;
    }
    @RequestMapping("addcoder")
    public void add(Coder coder) {

        System.out.println(coder.getLanguage());
        System.out.println(coder.getCname());


    }

}
