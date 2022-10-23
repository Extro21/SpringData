package com.example.springdata.contrillers;

import com.example.springdata.data.Product;
import com.example.springdata.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productService.findA();
    }

    @GetMapping("/products/{id}")
    public Product getStudentById(@PathVariable Long id) {
        return productService.findById(id).get();
    }

    @GetMapping("/products/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }



}
