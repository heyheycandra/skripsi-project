package com.id.latihan.latihanspring.repository;

import com.id.latihan.latihanspring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
