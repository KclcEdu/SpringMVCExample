package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.InfoModel;
import com.example.service.InfoService;

@Controller
public class BasicSampleController {

    @Autowired
    private InfoService service;

    @RequestMapping(name = "hello", path = "/")
    public String hello(ModelMap map) {
        List<InfoModel> list;
        try {
            list = service.getInfo();
            map.addAttribute("listInfo", list);
        } catch (Exception e) {
            return "redirect:/error?msg=" + e.getMessage();
        }
        return "hello";
    }

    @RequestMapping(name = "addInfo", path = "/addInfo")
    public String addInfo(@ModelAttribute(name = "info") InfoModel info) {
        try {
            service.saveInfo(info);
        } catch (Exception e) {
            return "redirect:/error?msg=" + e.getMessage();
        }
        return "redirect:/";
    }

    @RequestMapping(name = "error", path = "/error")
    public String error(@RequestParam("msg") String msg, ModelMap map) {
        map.addAttribute("msg", msg);
        return "error";
    }

}
