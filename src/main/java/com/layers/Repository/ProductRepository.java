package com.layers.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.layers.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	 List<Product> findByVersion(Integer Version);
	 List<Product> findByProductId(String ProductId);
	 List<Product> findByDescription(String Description);
	 List<Product> findByPrice(BigDecimal Price);
	 List<Product> findByImageUrl(String imageUrl);
}
