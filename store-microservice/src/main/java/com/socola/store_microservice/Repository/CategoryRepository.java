package com.socola.store_microservice.Repository;

import com.socola.store_microservice.Entity.Category;
import com.socola.store_microservice.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {

    List<Product> findByCategory(Category category);
}
