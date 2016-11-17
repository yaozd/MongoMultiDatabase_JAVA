package com.yzd.repository.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/16.
 */
@Component
public class FirstMongoDB  {
    @Autowired
    @Qualifier("firstMongoTemplate")
    private MongoTemplate template;

    public MongoTemplate getTemplate() {
        return template;
    }

    public void setTemplate(MongoTemplate template) {
        this.template = template;
    }
}
