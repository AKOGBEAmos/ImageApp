package net.javaguides.springmvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.javaguides.springmvc.helloworld.model.HelloWorld;

/**
 * @author Sp1der
 */
@Controller
public class HelloWorldController {

	@RequestMapping("/rapid7")
	public void vulnerable(HelloWorld model) {
	}
}

