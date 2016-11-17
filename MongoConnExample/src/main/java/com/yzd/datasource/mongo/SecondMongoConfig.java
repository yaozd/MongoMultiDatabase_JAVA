package com.yzd.datasource.mongo;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@EnableMongoRepositories(mongoTemplateRef = "secondMongoTemplate", basePackages = "com.yzd.repository.second")
public class SecondMongoConfig {

    @Bean
    public MongoDbFactory secondMongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient("127.0.0.1"), "ProjectDb");
    }
    @Bean
    public MongoTemplate secondMongoTemplate() throws Exception {
        MappingMongoConverter converter = new MappingMongoConverter(secondMongoDbFactory(), new MongoMappingContext());
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return new MongoTemplate(secondMongoDbFactory(),converter);
    }
}
