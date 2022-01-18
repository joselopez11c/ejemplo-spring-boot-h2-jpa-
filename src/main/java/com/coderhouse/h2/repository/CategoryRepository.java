package com.coderhouse.h2.repository;

import com.coderhouse.h2.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long>  {

}