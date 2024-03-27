package com.starfirst.doexam.repository;

import com.starfirst.doexam.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Iterable<Category> findAllByNameLikeIgnoreCase(String filter);
}
