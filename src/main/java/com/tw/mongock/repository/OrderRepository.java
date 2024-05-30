package com.tw.mongock.repository;

import com.tw.mongock.domain.Order;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CouchbaseRepository<Order, String> {
}
