package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ComAdobeCqHistoryImplHistoryRequestFilterProperties;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqHistoryImplHistoryRequestFilterInfo   {
  
  private String pid = null;

  private String title = null;

  private String description = null;

  private ComAdobeCqHistoryImplHistoryRequestFilterProperties properties = null;

  private String bundleLocation = null;

  private String serviceLocation = null;


  /**
   **/
  public ComAdobeCqHistoryImplHistoryRequestFilterInfo pid(String pid) {
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
  public ComAdobeCqHistoryImplHistoryRequestFilterInfo title(String title) {
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
  public ComAdobeCqHistoryImplHistoryRequestFilterInfo description(String description) {
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
  public ComAdobeCqHistoryImplHistoryRequestFilterInfo properties(ComAdobeCqHistoryImplHistoryRequestFilterProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeCqHistoryImplHistoryRequestFilterProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqHistoryImplHistoryRequestFilterProperties properties) {
    this.properties = properties;
  }


  /**
   **/
  public ComAdobeCqHistoryImplHistoryRequestFilterInfo bundleLocation(String bundleLocation) {
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
  public ComAdobeCqHistoryImplHistoryRequestFilterInfo serviceLocation(String serviceLocation) {
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
    ComAdobeCqHistoryImplHistoryRequestFilterInfo comAdobeCqHistoryImplHistoryRequestFilterInfo = (ComAdobeCqHistoryImplHistoryRequestFilterInfo) o;
    return Objects.equals(pid, comAdobeCqHistoryImplHistoryRequestFilterInfo.pid) &&
        Objects.equals(title, comAdobeCqHistoryImplHistoryRequestFilterInfo.title) &&
        Objects.equals(description, comAdobeCqHistoryImplHistoryRequestFilterInfo.description) &&
        Objects.equals(properties, comAdobeCqHistoryImplHistoryRequestFilterInfo.properties) &&
        Objects.equals(bundleLocation, comAdobeCqHistoryImplHistoryRequestFilterInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comAdobeCqHistoryImplHistoryRequestFilterInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqHistoryImplHistoryRequestFilterInfo {\n");
    
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

