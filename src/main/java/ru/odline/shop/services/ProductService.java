package ru.odline.shop.services;

import org.springframework.stereotype.Service;
import ru.odline.shop.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(
                ++ID,
                "Test",
                "Test desc",
                100,
                "Yekateringburg",
                "ohotnikoff")
        );
        products.add(new Product(
                ++ID,
                "Test 2",
                "Test desc",
                100,
                "Yekateringburg",
                "ohotnikoff")
        );
    }

    public List<Product> listProducts() { return products; }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
