package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.InfoModel;
import com.example.service.InfoService;

@Controller
public class HelloController {

    @Autowired
    private InfoService service;

    @RequestMapping(name = "hello", path = "/")
    public String hello(ModelMap map) {
        List<InfoModel> list;
        try {
            list = service.getInfo();
            map.addAttribute("listInfo", list);
        } catch (Exception e) {
            return "redirect:/error";
        }
        return "hello";
    }

    @RequestMapping(name = "addInfo", path = "/addInfo")
    public String addInfo(@ModelAttribute(name = "info") InfoModel info) {
        try {
            service.saveInfo(info);
        } catch (Exception e) {
            return "redirect:/error";
        }
        return "redirect:/";
    }

}
