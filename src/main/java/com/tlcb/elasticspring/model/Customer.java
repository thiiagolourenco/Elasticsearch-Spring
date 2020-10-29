package com.tlcb.elasticspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "elasticspring", type = "customer", shards = 2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  @Id
  private String id;
  private String firstName;
  private String lastName;
  private int age;

}
