package com.vijay.restaurent.repository;

import com.vijay.restaurent.entity.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface RestaurentRepo extends JpaRepository<Restaurent, Long> {
}
