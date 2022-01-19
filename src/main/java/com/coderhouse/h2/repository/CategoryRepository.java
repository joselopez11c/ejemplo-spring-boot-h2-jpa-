package com.coderhouse.h2.repository;

import com.coderhouse.h2.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Role, Long>  {

}
