package com.cache.ehcache.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cache.ehcache.model.Product;

@Service
public class ProductService {
	
	Map<Long, Product> prepo = new HashMap<Long, Product>();
	
	@PostConstruct
	public void init() {
		Product product = new Product();
		product.setId(1L);
		product.setName("Iphone");
		product.setPrice(new BigDecimal(1000000));
		prepo.put(1L, product);
		product = new Product();
		product.setId(2L);
		product.setName("Samsung Galaxy");
		product.setPrice(new BigDecimal(50000));
		prepo.put(2L, product);
		product = new Product();
		product.setId(3L);
		product.setName("Laptop");
		product.setPrice(new BigDecimal(200000));
		prepo.put(3L, product);
	}
 
    /**
     * Method to fetch product details on the basis of product id.
     * @param productId
     * @return
     */
    // @Cacheable annotation adds the caching behaviour. 
    // If multiple requests are received, then the method won't be repeatedly executed, instead, the results are shared from cached storage.	
    @Cacheable(value="productsCache")
    public Optional<Product> getProductById(Long productId) {
        return Optional.of(prepo.get(productId));
    }
 
    /**
     * Method to update product on the basis of product id.
     * @param product
     * @param productName
     * @return
     */
    // @CachePut annotation updates the cached value.    
    @CachePut(value = "productsCache")
    public Product updateProductById(Product product, String productName) {
    	Long id = product.getId();
    	product.setId(id);
        product.setName(productName);        
        prepo.put(id, product); 
        return product;
    }
 
    /**
     * Method to delete product on the basis of product id.
     * @param productId
     */
    // @CacheEvict annotation removes one or all entries from cached storage.
    // <code>allEntries=true</code> attribute allows developers to purge all entries from the cache.
    @CacheEvict(value="productsCache", allEntries = true)
    public void deleteProductById(Long productId) {
        prepo.remove(productId);
    }
}