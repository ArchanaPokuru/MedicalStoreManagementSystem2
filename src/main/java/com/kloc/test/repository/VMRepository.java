package com.kloc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kloc.test.entities.VendorModule;

public interface VMRepository extends MongoRepository<VendorModule,Integer> 
{
	public VendorModule findByVname(String vname);
	// if mongodb we will use then this method will be in use otherwise comment out
//	public VendorModule findByVId(int id);
}
