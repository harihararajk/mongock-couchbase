package com.tw.mongock.config;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.env.ClusterEnvironment;
import io.mongock.driver.api.driver.ConnectionDriver;
import io.mongock.driver.couchbase.driver.CouchbaseDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongockConfiguration {

    @Bean
    public Bucket couchbaseBucket(Cluster couchbaseCluster) {
        return couchbaseCluster.bucket("orders");
    }


    @Bean
    public ConnectionDriver connectionDriver(Cluster couchbaseCluster, Bucket couchbaseBucket) {
      return  CouchbaseDriver.withDefaultLock(couchbaseCluster, couchbaseBucket.defaultCollection());
    }
}