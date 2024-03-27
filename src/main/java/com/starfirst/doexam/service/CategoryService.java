package com.starfirst.doexam.service;

import com.starfirst.doexam.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAll(String filter);
}
