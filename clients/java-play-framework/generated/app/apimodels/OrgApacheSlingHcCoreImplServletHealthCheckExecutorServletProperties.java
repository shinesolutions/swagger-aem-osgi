package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties   {
  @JsonProperty("servletPath")
  private ConfigNodePropertyString servletPath = null;

  @JsonProperty("disabled")
  private ConfigNodePropertyBoolean disabled = null;

  @JsonProperty("cors.accessControlAllowOrigin")
  private ConfigNodePropertyString corsAccessControlAllowOrigin = null;

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties servletPath(ConfigNodePropertyString servletPath) {
    this.servletPath = servletPath;
    return this;
  }

   /**
   * Get servletPath
   * @return servletPath
  **/
  @Valid
  public ConfigNodePropertyString getServletPath() {
    return servletPath;
  }

  public void setServletPath(ConfigNodePropertyString servletPath) {
    this.servletPath = servletPath;
  }

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties disabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getDisabled() {
    return disabled;
  }

  public void setDisabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }

  public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties corsAccessControlAllowOrigin(ConfigNodePropertyString corsAccessControlAllowOrigin) {
    this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
    return this;
  }

   /**
   * Get corsAccessControlAllowOrigin
   * @return corsAccessControlAllowOrigin
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

