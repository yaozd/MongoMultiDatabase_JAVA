package com.yzd.entity.second;

import org.springframework.data.annotation.Id;

/**
 * Created by Administrator on 2016/11/14.
 */
public class ProjectInfo {
    @Id
    private String id;
    private String projectName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
