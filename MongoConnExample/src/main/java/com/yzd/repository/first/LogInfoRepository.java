package com.yzd.repository.first;

import com.yzd.entity.first.LogInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface LogInfoRepository extends MongoRepository<LogInfo, String>
{

}
