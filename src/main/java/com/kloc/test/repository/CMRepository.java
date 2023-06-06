package com.kloc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.kloc.test.entities.CustomerModule;
import com.kloc.test.entities.VendorModule;

public interface CMRepository extends MongoRepository<CustomerModule, Integer> {
	public CustomerModule findByCname(String cname);
}
