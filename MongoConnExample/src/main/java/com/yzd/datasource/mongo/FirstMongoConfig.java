package com.yzd.datasource.mongo;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Administrator on 2016/11/14.
 */
@Configuration
@EnableMongoRepositories(mongoTemplateRef = "firstMongoTemplate", basePackages = "com.yzd.repository.first")
public class FirstMongoConfig  {

    @Bean
    @Primary
    public MongoDbFactory firstMongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient("127.0.0.1"), "EvenLogDb");
    }

    @Bean
    @Primary
    public MongoTemplate firstMongoTemplate() throws Exception {
        MappingMongoConverter converter = new MappingMongoConverter(firstMongoDbFactory(), new MongoMappingContext());
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return new MongoTemplate(firstMongoDbFactory(),converter);
    }
}