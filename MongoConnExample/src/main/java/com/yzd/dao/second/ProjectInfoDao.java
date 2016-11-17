package com.yzd.dao.second;

import com.yzd.entity.second.ProjectInfo;
import com.yzd.repository.second.ProjectInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/14.
 */
@Component
public class ProjectInfoDao {
    @Autowired
    private ProjectInfoRepository repository;
    public ProjectInfo add(ProjectInfo model)
    {
        repository.save(model);
        return model;
    }
}
