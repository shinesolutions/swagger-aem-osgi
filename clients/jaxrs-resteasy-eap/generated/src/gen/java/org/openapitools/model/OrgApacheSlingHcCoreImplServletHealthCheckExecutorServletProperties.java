package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties   {
  

  private ConfigNodePropertyString servletPath = null;

  private ConfigNodePropertyBoolean disabled = null;

  private ConfigNodePropertyString corsAccessControlAllowOrigin = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servletPath")
  public ConfigNodePropertyString getServletPath() {
    return servletPath;
  }
  public void setServletPath(ConfigNodePropertyString servletPath) {
    this.servletPath = servletPath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disabled")
  public ConfigNodePropertyBoolean getDisabled() {
    return disabled;
  }
  public void setDisabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cors.accessControlAllowOrigin")
  public ConfigNodePropertyString getCorsAccessControlAllowOrigin() {
    return corsAccessControlAllowOrigin;
  }
  public void setCorsAccessControlAllowOrigin(ConfigNodePropertyString corsAccessControlAllowOrigin) {
    this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties = (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties) o;
    return Objects.equals(servletPath, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.servletPath) &&
        Objects.equals(disabled, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.disabled) &&
        Objects.equals(corsAccessControlAllowOrigin, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.corsAccessControlAllowOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servletPath, disabled, corsAccessControlAllowOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {\n");
    
    sb.append("    servletPath: ").append(toIndentedString(servletPath)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    corsAccessControlAllowOrigin: ").append(toIndentedString(corsAccessControlAllowOrigin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

