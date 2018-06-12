package com.yaluzb.guns.modular.flowable.model;

import lombok.Data;

import java.util.Date;

/**
 * 任务列表vo
 *
 * @author yaluzb
 * @date 2017-12-04 23:18
 */
@Data
public class TaskVo {

    private String id;

    private String name;

    private Date createTime;

    private String assignee;

    private Object money;

    private Boolean selfFlag;

    public TaskVo() {
    }

    public TaskVo(String id, String name, Date createTime, String assignee, Object money, Boolean flag) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.assignee = assignee;
        this.money = money;
        this.selfFlag = flag;
    }

}
