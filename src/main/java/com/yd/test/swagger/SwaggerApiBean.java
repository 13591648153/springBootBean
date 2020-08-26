package com.yd.test.swagger;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SwaggerApiBean
 * @author <a href="mailto:he.jf@neusoft.com">he.jf</a>
 * @version $Revision 1.0 $ 2019年1月22日 下午4:55:40
 */
@ApiModel(value = "SwaggerApiBean", description = "SwaggerApi模型")
@TableName("swagger_api_t")
public class SwaggerApiBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "服务模块名称")
    @JsonProperty(value = "serviceModelName")
    private String serviceModelName;

    @ApiModelProperty(value = "服务URI")
    @JsonProperty(value = "serviceUri")
    private String serviceUri;
    
    @ApiModelProperty(value = "服务URI正则表达式")
    @JsonProperty(value = "serviceUriRegex")
    private String serviceUriRegex;

    @ApiModelProperty(value = "服务HTTP方法")
    @JsonProperty(value = "serviceMethod")
    private String serviceMethod;

    @ApiModelProperty(value = "服务描述")
    @JsonProperty(value = "description")
    private String description;

    public String getServiceModelName() {
        return serviceModelName;
    }

    public void setServiceModelName(String serviceModelName) {
        this.serviceModelName = serviceModelName;
    }

    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
    }

    public String getServiceUriRegex() {
        return serviceUriRegex;
    }

    public void setServiceUriRegex(String serviceUriRegex) {
        this.serviceUriRegex = serviceUriRegex;
    }

    public String getServiceMethod() {
        return serviceMethod;
    }

    public void setServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  

}
