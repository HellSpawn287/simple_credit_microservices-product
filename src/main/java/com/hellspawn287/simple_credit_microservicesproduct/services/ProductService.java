package com.hellspawn287.simple_credit_microservicesproduct.services;

import com.hellspawn287.simple_credit_microservicesproduct.web.model.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(Long id);

    ProductDTO createNewProduct(ProductDTO productDTO);

    ProductDTO saveProductByDTO(Long id, ProductDTO productDTO);

    ProductDTO patchProduct(Long id, ProductDTO productDTO) throws ResourceNotFoundException;

    void deleteProductById(Long id);
}