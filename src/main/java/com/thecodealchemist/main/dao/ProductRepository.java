package com.thecodealchemist.main.dao;

import com.thecodealchemist.main.entity.Product;
import com.thecodealchemist.main.model.ProductDTO;
import com.thecodealchemist.main.projections.ThinProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    List<Product> findAll();

//    List<ThinProduct> findAllByVendor(@Param("vendor") String vendor);

    @Query("select new com.thecodealchemist.main.model.ProductDTO(p.name, p.code, p.category, p.amount) from Product p where p.vendor=:vendor")
    List<ProductDTO> findAllByVendor(@Param("vendor") String vendor);
}
