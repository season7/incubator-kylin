package com.kylinolap.job.dao;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.kylinolap.common.persistence.RootPersistentEntity;

/**
 * Created by qianzhou on 12/15/14.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class ExecutablePO extends RootPersistentEntity {

    @JsonProperty("name")
    private String name;

    @JsonProperty("tasks")
    private List<ExecutablePO> tasks;

    @JsonProperty("type")
    private String type;

    @JsonProperty("params")
    private Map<String, String> params = Maps.newHashMap();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExecutablePO> getTasks() {
        return tasks;
    }

    public void setTasks(List<ExecutablePO> tasks) {
        this.tasks = tasks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

}