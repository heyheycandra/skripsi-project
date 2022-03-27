package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.model.Product;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @CrossOrigin
    @PostMapping("/addProduct")
    public ResponseEntity<MessageResponse> addDataProduct(@RequestBody Product product){
        productService.saveDataProduct(product);
        return ResponseEntity.ok(new MessageResponse("success insert data"));
    }

    @CrossOrigin
    @PostMapping("/updateProduct")
    public ResponseEntity<MessageResponse> updateDataProduct(@RequestBody Product product){
        productService.updateDataProduct(product);
        return ResponseEntity.ok(new MessageResponse("success update data"));
    }

    @CrossOrigin
    @GetMapping("/getAllProduct")
    public List<Product> getProductAll(){
        return productService.getAllDataProduct();
    }

    @CrossOrigin
    @GetMapping("/product/{product_id}")
    public Optional<Product> findByIdProduct(@PathVariable Long product_id){
        return productService.findByIdProduct(product_id);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{product_id}")
    public ResponseEntity<MessageResponse> deleteDataProductById(@PathVariable Long product_id){
        productService.deleteDataProductById(product_id);
        return ResponseEntity.ok(new MessageResponse("success delete data product id :" + product_id));
    }

}
