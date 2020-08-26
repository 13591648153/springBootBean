/**
 * @(#)Op.java 2018年12月20日
 * Copyright 2018 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.yd.test.query;

/**
 * @author <a href="mailto:li-chp@neusoft.com"> li-chp </a>
 * @version $Revision 1.0.0 $ 2018年12月20日 下午2:07:51
 */
public enum OpEnum {

	eq("eq", "等于"),
	ne("ne", "不等于"),
	like("like", "包含"),
	likeLeft("likeLeft", "开始以"),
	likeRight("likeRight", "结束以"),
	notLike("notLike", "不包含"),
	ge("ge", "大于等于"),
	gt("gt", "等于"),
	le("le", "小于等于"),
	lt("lt", "小于"),
	in("in", "在列表中"),
	notIn("notIn", "不在列表中"),
	between("between", "在范围中"),
	notBetween("notBetween", "不在范围中"),
	orderByAsc("orderByAsc", "升序排序"),
	orderByDesc("orderByDesc", "降序排序"),
	isNull("isNull", "为空"),
	isNotNull("isNotNull", "不为空");

	private String op;

	private String desc;

	private OpEnum(String op, String desc) {
		this.op = op;
		this.desc = desc;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
