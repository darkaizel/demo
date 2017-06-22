package org.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by darka on 2017-06-23.
 */
@Controller
public class controller {

	@RequestMapping("/")
	public String hello(){
		return "index";
	}
}
