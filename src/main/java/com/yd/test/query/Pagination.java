/**
 * @(#)Pagination.java 2018年12月20日
 * Copyright 2018 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.yd.test.query;

/**
 * @author <a href="mailto:li-chp@neusoft.com"> li-chp </a>
 * @version $Revision 1.0.0 $ 2018年12月20日 上午9:55:56
 */
public class Pagination {
	
	/**
	 * 当前页数
	 */
	private Long current; 
	
	/**
	 * 每页大小
	 */
	private Long size;

	/**
	 * @return the current
	 */
	public Long getCurrent() {
		return current;
	}

	/**
	 * @param current the current to set
	 */
	public void setCurrent(Long current) {
		this.current = current;
	}

	/**
	 * @return the size
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Long size) {
		this.size = size;
	}
	
}
