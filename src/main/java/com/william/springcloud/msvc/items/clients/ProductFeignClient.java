package com.william.springcloud.msvc.items.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.william.springcloud.msvc.items.models.Product;

@FeignClient(name = "msvc-products")    //este es el mismo puerto del proyecto de products
public interface ProductFeignClient {

    @GetMapping("/api/products")
    List<Product> findAll();    //este metodo esta enlazado al list() del ProductController

    @GetMapping("/api/products/{id}")
    Product details(@PathVariable Long id);    //este metodo tambien esta enlazado, como toda la clase, con ProductContro,ler del proyecto Controller, el nombre del metodo no tiene qe coincidir, pero si las variables qe recibe
}
