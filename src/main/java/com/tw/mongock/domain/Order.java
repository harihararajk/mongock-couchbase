package com.tw.mongock.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.List;

@Document
@Getter
public class Order {
    @Id
    private String id;
    private String customerName;
    private List<OrderItem> items;

}
