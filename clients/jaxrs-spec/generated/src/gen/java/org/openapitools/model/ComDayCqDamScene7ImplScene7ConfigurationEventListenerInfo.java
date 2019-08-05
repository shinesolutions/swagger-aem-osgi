package org.openapitools.model;

import org.openapitools.model.ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties properties = null;
  private @Valid String bundleLocation = null;
  private @Valid String serviceLocation = null;

  /**
   **/
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo pid(String pid) {
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
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo title(String title) {
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
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo description(String description) {
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
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo properties(ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo bundleLocation(String bundleLocation) {
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
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo serviceLocation(String serviceLocation) {
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
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo = (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo) o;
    return Objects.equals(pid, comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.pid) &&
        Objects.equals(title, comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.title) &&
        Objects.equals(description, comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.description) &&
        Objects.equals(properties, comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.properties) &&
        Objects.equals(bundleLocation, comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo {\n");
    
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

