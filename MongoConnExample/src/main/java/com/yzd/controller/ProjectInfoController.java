package com.yzd.controller;

import com.yzd.dao.second.ProjectInfoDao;
import com.yzd.entity.second.ProjectInfo;
import com.yzd.repository.second.SecondMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/14.
 */
@RestController
@RequestMapping("/projectInfo/")
public class ProjectInfoController {
    @Autowired
    private ProjectInfoDao projectInfoDao;
    @Autowired
    SecondMongoDB secondMongoDB;
    @RequestMapping("add")
    public ProjectInfo add()
    {
        ProjectInfo model=new ProjectInfo();
        model.setProjectName("project-name");
        projectInfoDao.add(model);
        return model;
    }
    @RequestMapping("dbName")
    public String dbName()
    {
        String dbName= secondMongoDB.getTemplate().getDb().getName();
        return dbName+currentTime();
    }

    private String currentTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
       return df.format(new Date());// new Date()为获取当前系统时间
    }
}
