package com.kloc.test.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.kloc.test.entities.OrderDetails;

public interface ODRepository extends MongoRepository<OrderDetails,Integer>
{

}
