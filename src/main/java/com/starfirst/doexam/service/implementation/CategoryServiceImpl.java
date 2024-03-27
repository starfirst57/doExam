package com.starfirst.doexam.service.implementation;

import com.starfirst.doexam.entity.Category;
import com.starfirst.doexam.repository.CategoryRepository;
import com.starfirst.doexam.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;

    public List<Category> getAll(String filter) {
        return repository.findAll();
    }
}
