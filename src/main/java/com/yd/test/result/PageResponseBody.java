package com.yd.test.result;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/***
 * 
 * 系统分页查询统一返回Body体模型
 * @author <a href="mailto:he.jf@neusoft.com">he.jf</a>
 * @version $Revision 1.0 $ 2018年12月14日 上午9:09:03
 */
@ApiModel(value = "ResPageResult", description = "系统分页查询统一返回Body体模型")
public class PageResponseBody<T>  {

	@ApiModelProperty(value="返回数据",required=false)
	@JsonProperty(value = "records")
	private  List<T> records;
	
	@ApiModelProperty(value = "记录总条数", required = true)
	@JsonProperty(value = "total")
	private long total = 0;

	@ApiModelProperty(value = "总页数", required = true)
	@JsonProperty(value = "pages")
	private long pages = 0;

	@ApiModelProperty(value = "当前页数", required = true)
	@JsonProperty(value = "current")
	private long current = 1;

	@ApiModelProperty(value = " 每页条数", required = true)
	@JsonProperty(value = "size")
	private long size = 1000;
	
	
	public PageResponseBody(){
		super();
	}

	public PageResponseBody(List<T> records){
		this.records=records;
	}
	
	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}

	public long getCurrent() {
		return current;
	}

	public void setCurrent(long current) {
		this.current = current;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

}
