package com.layers.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.layers.Model.Product;
import com.layers.Repository.ProductRepository;

@Service
public class ProductService
{
	@Autowired
	private ProductRepository productrepo;
	
	public List<Product> listAllProductsByImage(String imageUrl)
	{
		return productrepo.findByImageUrl(imageUrl);
	}
	
	public List<Product> listAllProductsByVersion(Integer Version)
	{
		return productrepo.findByVersion(Version);
	}
	public List<Product> listAllProductsByProductId(String ProductId)
	{
		return productrepo.findByProductId(ProductId);
	}
	
	public List<Product> listAllProductsByPrice(BigDecimal Price)
	{
		return productrepo.findByPrice(Price);
	}
	
	public List<Product> listAllProductsByDescription(String category)
	{
		return productrepo.findByDescription(category);
	}
		 
	public List<Product> listAllProducts()
	{
		return productrepo.findAll();
	}
	
	public Product getProductById(Integer id)
	{
		Product product=productrepo.findById(id).orElse(null);
	    return product;
	}

    public Product saveProduct(Product product) 
    {
    	product = productrepo.save(product); 
    	return product;
    }
  
	public void deleteProduct(Integer id) 
	{
		productrepo.deleteById(id);
    }

	public int isZero(Iterable<Product> productList)
	{     
		int counter = 0;
        for (Object i : productList) 
        {
            counter++;
        }
	  return counter;
	}
	
	public Optional<Product> getSingleProductById(Integer id)
	{
		Optional<Product> product=productrepo.findById(id);
	    return product;
	}
}
