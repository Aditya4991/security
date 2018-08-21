package com.mindtree.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.model.User;
import com.mindtree.service.UserService;

@Controller
public class RegistrationController {
  @Autowired
  public UserService userService;
  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new User());
    return mav;
  }
  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("user") User user) {
  userService.register(user);
  return new ModelAndView("welcome", "firstname", user.getFirstname());
  }
  @RequestMapping(value = "/add", method = RequestMethod.GET)
  public String showAddItem(Model model) {
	  List<Map<String, String>> list=new LinkedList<>();
	  Map<String, String> map=new HashMap<>();
	  map.put("e1", "shrjkg");
	  map.put("E2", "shrjkg");
	  map.put("e3", "shrjkg");
	list.add(map);
     model.addAttribute("listCat",list);
    // model.addAttribute("command",new Item());
     return "addItem";
  }
}