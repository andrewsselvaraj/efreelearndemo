package com.efreelearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class NormalController {
@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
public String showAddTodoPage(ModelMap model) {
	 model.addAttribute("todo", "");
    return "todo";

}
@RequestMapping(value = "/next", method = RequestMethod.GET)
public String nextMethod(ModelMap model) {
    model.addAttribute("message", "message");
    model.addAttribute("todo", "");
    return "next";

}
}