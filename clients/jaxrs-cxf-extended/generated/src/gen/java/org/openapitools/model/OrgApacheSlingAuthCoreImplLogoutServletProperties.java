package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingAuthCoreImplLogoutServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletMethods;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletPaths;
 /**
  * Get slingServletMethods
  * @return slingServletMethods
  */
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
 public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
  public OrgApacheSlingAuthCoreImplLogoutServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

 /**
  * Get slingServletPaths
  * @return slingServletPaths
  */
  @JsonProperty("sling.servlet.paths")
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  /**
   * Sets the <code>slingServletPaths</code> property.
   */
 public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  /**
   * Sets the <code>slingServletPaths</code> property.
   */
  public OrgApacheSlingAuthCoreImplLogoutServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingAuthCoreImplLogoutServletProperties orgApacheSlingAuthCoreImplLogoutServletProperties = (OrgApacheSlingAuthCoreImplLogoutServletProperties) o;
    return Objects.equals(this.slingServletMethods, orgApacheSlingAuthCoreImplLogoutServletProperties.slingServletMethods) &&
        Objects.equals(this.slingServletPaths, orgApacheSlingAuthCoreImplLogoutServletProperties.slingServletPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletMethods, slingServletPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingAuthCoreImplLogoutServletProperties {\n");
    
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

