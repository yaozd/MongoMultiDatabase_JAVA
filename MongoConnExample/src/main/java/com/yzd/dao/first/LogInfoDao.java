package com.yzd.dao.first;

import com.yzd.entity.first.LogInfo;
import com.yzd.repository.first.LogInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/14.
 */
@Component
public class LogInfoDao {
    @Autowired
    private LogInfoRepository repository;
    public LogInfo add(LogInfo model)
    {
        repository.save(model);
        return model;
    }
}
