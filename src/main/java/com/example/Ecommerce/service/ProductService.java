package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public List<Product> getProductsByCategory(String category) {
        List<Product> products=null;
        List<Product> allProducts=productRepo.findAll();
        for(Product product: allProducts){
            if(product.getCategory().equals(category)) {
                products.add(product);
            }
        }
        return products;
    }

    public String deleteProduct(Integer productId) {
        Optional<Product> allProducts=productRepo.findById(productId);
        Product product=allProducts.get();
        if(allProducts.isPresent()){
            productRepo.delete(product);
            return "Product has been deleted.";
        }else{
            return "No product found with given id";
        }
    }
}
