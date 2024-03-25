package com.vijay.foodCatalog.repository;

import com.vijay.foodCatalog.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodCatalogRepository extends JpaRepository<FoodItem, Long> {

    List<FoodItem> findByRestaurentId(Long id);
}
