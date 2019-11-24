package com.hellspawn287.simple_credit_microservicesproduct.web.mapper;


import com.hellspawn287.simple_credit_microservicesproduct.domain.Product;
import com.hellspawn287.simple_credit_microservicesproduct.web.model.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO productToProductDTO(Product product);

    Product productDTOToProduct(ProductDTO productDTO);
}