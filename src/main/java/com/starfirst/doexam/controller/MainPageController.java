package com.starfirst.doexam.controller;

import com.starfirst.doexam.service.CategoryService;
import com.starfirst.doexam.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainPageController {
    private final CategoryService categoryService;
    private final QuestionService questionService;


    @GetMapping("")
    public String mainPage(Model model){
        model.addAttribute("categories", this.categoryService.getAll(""));
        return "mainPage";
    }
}
