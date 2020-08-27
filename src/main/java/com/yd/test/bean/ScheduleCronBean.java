package com.yd.test.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ScheduleCronModel", description = "定时任务配置表数据模型")
@TableName("schedule_cron_t")
public class ScheduleCronBean extends BaseBean {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "CPU等待百分比")
	@JsonProperty(value = "crontab")
	private String crontab;
	@ApiModelProperty(value = "CPU系统百分比")
	@JsonProperty(value = "task_name")
	private String taskName;
	public String getCrontab() {
		return crontab;
	}
	public void setCrontab(String crontab) {
		this.crontab = crontab;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
