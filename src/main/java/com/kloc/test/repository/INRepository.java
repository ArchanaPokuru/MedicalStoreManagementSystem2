package com.kloc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.kloc.test.entities.Inventory;

public interface INRepository extends MongoRepository<Inventory, Integer>
{

}
