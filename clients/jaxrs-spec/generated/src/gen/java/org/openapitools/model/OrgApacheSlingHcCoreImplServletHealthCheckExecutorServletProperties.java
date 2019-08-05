package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties   {
  
  private @Valid ConfigNodePropertyString servletPath = null;
  private @Valid ConfigNodePropertyBoolean disabled = null;
  private @Valid ConfigNodePropertyString corsAccessControlAllowOrigin = null;

  /**
   **/
  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties servletPath(ConfigNodePropertyString servletPath) {
    this.servletPath = servletPath;
    return this;
  }

  
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
  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties disabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
    return this;
  }

  
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
  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties corsAccessControlAllowOrigin(ConfigNodePropertyString corsAccessControlAllowOrigin) {
    this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cors.accessControlAllowOrigin")
  public ConfigNodePropertyString getCorsAccessControlAllowOrigin() {
    return corsAccessControlAllowOrigin;
  }
  public void setCorsAccessControlAllowOrigin(ConfigNodePropertyString corsAccessControlAllowOrigin) {
    this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

