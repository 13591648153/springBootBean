/**
 * @(#)Criteria.java 2018年12月19日
 * Copyright 2018 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.yd.test.query;

import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author <a href="mailto:li-chp@neusoft.com"> li-chp </a>
 * @version $Revision 1.0.0 $ 2018年12月19日 下午4:08:42
 */
public class Criteria {

	@ApiModelProperty(value="查询条件")
	@JsonProperty
	@Valid
    private List<Condition> conditons;
    
	@ApiModelProperty(value="分页")
	@JsonProperty
    private Pagination pagination;
	
	/**
	 * @return the conditons
	 */
	public List<Condition> getConditons() {
		return conditons;
	}

	/**
	 * @param conditons the conditons to set
	 */
	public void setConditons(List<Condition> conditons) {
		this.conditons = conditons;
	}

	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * @param pagination the pagination to set
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
}
