package com.yd.test.bean;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class BaseBean implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "ID不能为空")
	@ApiModelProperty(value = "资源ID")
	@JsonProperty(value = "id")
	@TableId(type = IdType.INPUT)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
