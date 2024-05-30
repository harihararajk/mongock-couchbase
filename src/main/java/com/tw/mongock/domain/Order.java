package com.tw.mongock.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Getter
public class Order {
    @Id
    private String id;
    private String name;
    private Integer quantity;
    private Double cost;

}
