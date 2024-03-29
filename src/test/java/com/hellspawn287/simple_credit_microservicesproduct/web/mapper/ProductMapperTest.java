package com.hellspawn287.simple_credit_microservicesproduct.web.mapper;

import com.hellspawn287.simple_credit_microservicesproduct.domain.Product;
import com.hellspawn287.simple_credit_microservicesproduct.web.model.ProductDTO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductMapperTest {
    private static final String NAME = "someNAME";
    private static final Long VALUE = 33L;
    private ProductMapper productMapper = ProductMapper.INSTANCE;

    @Test
    public void productToProductDTO() {
//      given
        Product product = new Product();
        product.setName(NAME);
        product.setValue(VALUE);
//      when
        ProductDTO productDTO = productMapper.productToProductDTO(product);

//      then
        assertEquals(product.getName(), productDTO.getName());
        assertEquals(product.getValue(), productDTO.getValue());
    }

    @Test
    public void productDTOToProduct() {
//        given
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName(NAME);
        productDTO.setValue(VALUE);

//        when
        Product product = productMapper.productDTOToProduct(productDTO);

//        then
        assertEquals(productDTO.getName(), product.getName());
        assertEquals(productDTO.getValue(), product.getValue());
    }
}