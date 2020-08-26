/**
 * @(#)Criteria.java 2018年12月19日
 * Copyright 2018 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.yd.test.query;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
继承Criteria，放一些其他查询的条件
 */
public class CriteriaSub extends Criteria {

	@ApiModelProperty(value="额外查询条件")
	@JsonProperty
    private String beanName;

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}
