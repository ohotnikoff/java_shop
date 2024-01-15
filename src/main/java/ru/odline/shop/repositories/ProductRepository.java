package ru.odline.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.odline.shop.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
