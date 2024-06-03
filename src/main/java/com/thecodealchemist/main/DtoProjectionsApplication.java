package com.thecodealchemist.main;

import com.thecodealchemist.main.dao.ProductRepository;
import com.thecodealchemist.main.entity.Product;
import com.thecodealchemist.main.model.ProductDTO;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DtoProjectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtoProjectionsApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(ProductRepository productRepository) {
		return args -> {

//			List<ProductDTO> products = productRepository.findAll() //fetching data from DB using JPA repository
//														.stream().map(product -> {
//															//converting entity -> DTO
//															ProductDTO dto = new ProductDTO();
//															dto.setName(product.getName());
//															dto.setCode(product.getCode());
//															dto.setAmount(product.getAmount());
//															dto.setCategory(product.getCategory());
//															return dto;
//														}).toList();

			productRepository.findAllByVendor("ABC Inc.").forEach(p -> {
				System.out.println(p.getName() + ", " + p.getCategory());
			});

//			System.out.println(products);
		};
	}

}
