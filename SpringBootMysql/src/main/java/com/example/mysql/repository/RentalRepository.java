package com.example.mysql.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.mysql.model.Rental;

public interface RentalRepository extends CrudRepository<Rental, Integer> {
	
	<T> T findByRentalId(@Param("id") Integer rentalId, Class<T> type);
	
	/*
	 * @Query(
	 * value="select c.* from Rental r join customer c on c.customer_id =r.customer_id where r.rental_id=:id"
	 * , nativeQuery=true) <T> T findByRentalIdNativeQuery(@Param("id") Integer
	 * rentalId, Class<T> type);
	 */
	
	
	//Object findByRentalIdNativeQuery1(@Param("id") Integer rentalId);
	@Query(value="select r.* from Rental r join customer c on c.customer_id =r.customer_id where r.rental_id=:id", nativeQuery=true)
	Rental  getRentalByIdNativeQuery2(@Param("id") Integer rentalId);

}
