package org.openapitools.model;

import org.openapitools.model.OrgApacheSlingScriptingCoreImplScriptCacheImplProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingScriptingCoreImplScriptCacheImplInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid OrgApacheSlingScriptingCoreImplScriptCacheImplProperties properties = null;
  private @Valid String bundleLocation = null;
  private @Valid String serviceLocation = null;

  /**
   **/
  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   **/
  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo properties(OrgApacheSlingScriptingCoreImplScriptCacheImplProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties getProperties() {
    return properties;
  }
  public void setProperties(OrgApacheSlingScriptingCoreImplScriptCacheImplProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }
  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  /**
   **/
  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }
  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingCoreImplScriptCacheImplInfo orgApacheSlingScriptingCoreImplScriptCacheImplInfo = (OrgApacheSlingScriptingCoreImplScriptCacheImplInfo) o;
    return Objects.equals(pid, orgApacheSlingScriptingCoreImplScriptCacheImplInfo.pid) &&
        Objects.equals(title, orgApacheSlingScriptingCoreImplScriptCacheImplInfo.title) &&
        Objects.equals(description, orgApacheSlingScriptingCoreImplScriptCacheImplInfo.description) &&
        Objects.equals(properties, orgApacheSlingScriptingCoreImplScriptCacheImplInfo.properties) &&
        Objects.equals(bundleLocation, orgApacheSlingScriptingCoreImplScriptCacheImplInfo.bundleLocation) &&
        Objects.equals(serviceLocation, orgApacheSlingScriptingCoreImplScriptCacheImplInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingCoreImplScriptCacheImplInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
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

