/**
 * @(#)Condition.java 2018年12月20日
 * Copyright 2018 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.yd.test.query;

import java.util.Map;

import com.yd.test.validation.ValidMapStringValue;


/**
 * @author <a href="mailto:li-chp@neusoft.com"> li-chp </a>
 * @version $Revision 1.0.0 $ 2018年12月20日 上午9:55:11
 */
public class Condition {
		
	/**
	 * 操作类型，如eq,like,ge,gt等
	 */
	private OpEnum opEnum;
	
	/**
	 * 查询的参数
	 */
	@ValidMapStringValue(message = "查询条件包含特殊非法字符")
	private Map<String, Object> kwargs;


	/**
	 * @return the opEnum
	 */
	public OpEnum getOpEnum() {
		return opEnum;
	}

	/**
	 * @param opEnum the opEnum to set
	 */
	public void setOpEnum(OpEnum opEnum) {
		this.opEnum = opEnum;
	}

	/**
	 * @return the kwargs
	 */
	public Map<String, Object> getKwargs() {
		return kwargs;
	}

	/**
	 * @param kwargs the kwargs to set
	 */
	public void setKwargs(Map<String, Object> kwargs) {
		this.kwargs = kwargs;
	}

}
