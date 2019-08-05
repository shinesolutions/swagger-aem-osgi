package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo   {
  
  private String pid = null;

  private String title = null;

  private String description = null;

  private ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties properties = null;

  private String bundleLocation = null;

  private String serviceLocation = null;


  /**
   **/
  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo pid(String pid) {
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
  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo title(String title) {
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
  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo description(String description) {
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
  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo properties(ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties properties) {
    this.properties = properties;
  }


  /**
   **/
  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo bundleLocation(String bundleLocation) {
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
  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo serviceLocation(String serviceLocation) {
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
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo = (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo) o;
    return Objects.equals(pid, comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.pid) &&
        Objects.equals(title, comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.title) &&
        Objects.equals(description, comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.description) &&
        Objects.equals(properties, comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.properties) &&
        Objects.equals(bundleLocation, comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo {\n");
    
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

