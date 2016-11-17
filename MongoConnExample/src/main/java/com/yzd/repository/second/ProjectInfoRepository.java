package com.yzd.repository.second;

import com.yzd.entity.second.ProjectInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface ProjectInfoRepository extends MongoRepository<ProjectInfo, String>
{

}
