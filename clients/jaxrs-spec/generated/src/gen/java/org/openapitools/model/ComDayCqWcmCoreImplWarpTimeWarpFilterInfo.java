package org.openapitools.model;

import org.openapitools.model.ComDayCqWcmCoreImplWarpTimeWarpFilterProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplWarpTimeWarpFilterInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComDayCqWcmCoreImplWarpTimeWarpFilterProperties properties = null;
  private @Valid String bundleLocation = null;
  private @Valid String serviceLocation = null;

  /**
   **/
  public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo pid(String pid) {
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
  public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo title(String title) {
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
  public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo description(String description) {
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
  public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo properties(ComDayCqWcmCoreImplWarpTimeWarpFilterProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqWcmCoreImplWarpTimeWarpFilterProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo bundleLocation(String bundleLocation) {
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
  public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo serviceLocation(String serviceLocation) {
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
    ComDayCqWcmCoreImplWarpTimeWarpFilterInfo comDayCqWcmCoreImplWarpTimeWarpFilterInfo = (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo) o;
    return Objects.equals(pid, comDayCqWcmCoreImplWarpTimeWarpFilterInfo.pid) &&
        Objects.equals(title, comDayCqWcmCoreImplWarpTimeWarpFilterInfo.title) &&
        Objects.equals(description, comDayCqWcmCoreImplWarpTimeWarpFilterInfo.description) &&
        Objects.equals(properties, comDayCqWcmCoreImplWarpTimeWarpFilterInfo.properties) &&
        Objects.equals(bundleLocation, comDayCqWcmCoreImplWarpTimeWarpFilterInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comDayCqWcmCoreImplWarpTimeWarpFilterInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWarpTimeWarpFilterInfo {\n");
    
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

