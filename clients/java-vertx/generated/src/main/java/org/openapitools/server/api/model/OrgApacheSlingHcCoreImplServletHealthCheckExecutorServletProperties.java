package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties   {
  
  private ConfigNodePropertyString servletPath = null;
  private ConfigNodePropertyBoolean disabled = null;
  private ConfigNodePropertyString corsAccessControlAllowOrigin = null;

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties () {

  }

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties (ConfigNodePropertyString servletPath, ConfigNodePropertyBoolean disabled, ConfigNodePropertyString corsAccessControlAllowOrigin) {
    this.servletPath = servletPath;
    this.disabled = disabled;
    this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
  }

    
  @JsonProperty("servletPath")
  public ConfigNodePropertyString getServletPath() {
    return servletPath;
  }
  public void setServletPath(ConfigNodePropertyString servletPath) {
    this.servletPath = servletPath;
  }

    
  @JsonProperty("disabled")
  public ConfigNodePropertyBoolean getDisabled() {
    return disabled;
  }
  public void setDisabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }

    
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
