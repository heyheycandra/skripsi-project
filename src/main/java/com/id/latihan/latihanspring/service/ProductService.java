package com.id.latihan.latihanspring.service;

import com.id.latihan.latihanspring.model.Product;
import com.id.latihan.latihanspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public Product saveDataProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateDataProduct(Product product){
        Product product1 = productRepository.findById(product.getProduct_id()).orElse(null);
        product1.setNama_alat(product.getNama_alat());
        product1.setMerk(product.getMerk());
        product1.setKondisi(product.getKondisi());
        product1.setNama_vendor(product.getNama_vendor());
        product1.setRuangan(product.getRuangan());
        product1.setSn(product.getSn());
        product1.setHarga_beli(product.getHarga_beli());
        product1.setType_alat(product.getType_alat());
        product1.setCreate_on(new Date());
        product1.setCreate_by(product.getCreate_by());
        product1.setUpdate_on(new Date());
        product1.setUpdate_by(product.getUpdate_by());
        return productRepository.save(product);
    }

    public String deleteDataProductById (Long product_id){
        productRepository.deleteById(product_id);
        return ("succsess delete data " + product_id);
    }

    public Optional<Product> findByIdProduct(Long product_id){
        return productRepository.findById(product_id);
    }

    public List<Product> getAllDataProduct(){
        return productRepository.findAll();
    }


}
