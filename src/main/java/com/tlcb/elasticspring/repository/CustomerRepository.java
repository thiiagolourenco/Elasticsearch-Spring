package com.tlcb.elasticspring.repository;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.tlcb.elasticspring.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

  List<Customer> findByFirstname(String firstName);

}
