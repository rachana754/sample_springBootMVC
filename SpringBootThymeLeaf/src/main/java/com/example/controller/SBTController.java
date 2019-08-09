package com.example.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Fruit;
import com.example.service.SBTService;

@Controller
public class SBTController {
	
	@Autowired
	SBTService sbtService;
	
	@RequestMapping(value="/helloWorld")
	public ModelAndView helloWorld(HttpSession session) 
	{
		ModelAndView mav = new ModelAndView("helloWorld");
		session.setAttribute("today", LocalDateTime.now());
		List<Fruit> fruits = new ArrayList<>();
		sbtService.loadFruits(fruits);
		mav.addObject("fruits", fruits);
		return mav;
	}
	
	@RequestMapping(value="/helloWorld/newWorld")
	public ModelAndView newWorld() {
		ModelAndView mav = new ModelAndView("newHelloWorld");
		mav.addObject("today", LocalDate.now());
		return mav;
	}

}
