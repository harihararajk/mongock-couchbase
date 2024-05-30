package com.tw.mongock.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "spring.couchbase")
public class CouchbaseProperties {

    private String bucketName;
    private String username;
    private String password;
    private String connectionString;

}
