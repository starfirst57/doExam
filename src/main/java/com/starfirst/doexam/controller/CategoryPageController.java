package com.starfirst.doexam.controller;

import com.starfirst.doexam.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryPageController {

    private final CategoryService service;
    @GetMapping("")
    public String categoriesGet(Model model) {
        model.addAttribute("categories", this.service.getAll(""));
        return "categories";
    }


}
