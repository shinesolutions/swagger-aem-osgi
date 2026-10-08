package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties properties;

  @ApiModelProperty(value = "")

  private String additionalProperties;

  @ApiModelProperty(value = "")

  private String bundleLocation;

  @ApiModelProperty(value = "")

  private String serviceLocation;
 /**
   * Get pid
   * @return pid
  **/
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties properties) {
    this.properties = properties;
  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo properties(ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties properties) {
    this.properties = properties;
    return this;
  }

 /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @JsonProperty("additionalProperties")
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

 /**
   * Get bundleLocation
   * @return bundleLocation
  **/
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

 /**
   * Get serviceLocation
   * @return serviceLocation
  **/
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
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
    ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo comDayCqWcmCoreImplWCMDeveloperModeFilterInfo = (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo) o;
    return Objects.equals(this.pid, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.pid) &&
        Objects.equals(this.title, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.title) &&
        Objects.equals(this.description, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.description) &&
        Objects.equals(this.properties, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.properties) &&
        Objects.equals(this.additionalProperties, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.additionalProperties) &&
        Objects.equals(this.bundleLocation, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, additionalProperties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
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

