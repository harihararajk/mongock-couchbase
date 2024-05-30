package com.tw.mongock.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
@RequiredArgsConstructor
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    private final CouchbaseProperties couchbaseProperties;

    @Override
    public String getConnectionString() {
        return couchbaseProperties.getConnectionString();
    }

    @Override
    public String getUserName() {
        return couchbaseProperties.getUsername();
    }

    @Override
    public String getPassword() {
        return couchbaseProperties.getPassword();
    }

    @Override
    public String getBucketName() {
        return couchbaseProperties.getBucketName();
    }

}
