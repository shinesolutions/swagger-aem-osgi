package org.openapitools.model;

import org.openapitools.model.ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo   {
  
  private @Valid String pid = null;
  private @Valid String title = null;
  private @Valid String description = null;
  private @Valid ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties properties = null;
  private @Valid String bundleLocation = null;
  private @Valid String serviceLocation = null;

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo pid(String pid) {
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
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo title(String title) {
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
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo description(String description) {
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
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo properties(ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo bundleLocation(String bundleLocation) {
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
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo serviceLocation(String serviceLocation) {
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
    ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo = (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo) o;
    return Objects.equals(pid, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.pid) &&
        Objects.equals(title, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.title) &&
        Objects.equals(description, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.description) &&
        Objects.equals(properties, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.properties) &&
        Objects.equals(bundleLocation, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo {\n");
    
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

