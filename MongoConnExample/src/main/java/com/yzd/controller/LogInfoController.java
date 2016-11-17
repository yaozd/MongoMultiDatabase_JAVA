package com.yzd.controller;

import com.yzd.dao.first.LogInfoDao;
import com.yzd.entity.first.LogInfo;
import com.yzd.repository.first.FirstMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/14.
 */
@RestController
@RequestMapping("/logInfo/")
public class LogInfoController {
    @Autowired
    private LogInfoDao logInfoDao;
    @Autowired
    FirstMongoDB firstMongoDB;
    @RequestMapping("add")
    public LogInfo add()
    {
        LogInfo model=new LogInfo();
        model.setLoggerName("logger-name");
        logInfoDao.add(model);
        return model;
    }
    @RequestMapping("dbName")
    public String dbName()
    {
        String dbName= firstMongoDB.getTemplate().getDb().getName();
        return dbName+currentTime();
    }

    private String currentTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());// new Date()为获取当前系统时间
    }
}
