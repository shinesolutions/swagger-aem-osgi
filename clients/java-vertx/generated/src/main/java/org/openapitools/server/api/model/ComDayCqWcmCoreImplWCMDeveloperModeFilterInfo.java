package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties properties = null;
  private String additionalProperties = null;
  private String bundleLocation = null;
  private String serviceLocation = null;

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo () {

  }

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo (String pid, String title, String description, ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties properties, String additionalProperties, String bundleLocation, String serviceLocation) {
    this.pid = pid;
    this.title = title;
    this.description = description;
    this.properties = properties;
    this.additionalProperties = additionalProperties;
    this.bundleLocation = bundleLocation;
    this.serviceLocation = serviceLocation;
  }

    
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("properties")
  public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties properties) {
    this.properties = properties;
  }

    
  @JsonProperty("additionalProperties")
  public String getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

    
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }
  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

    
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }
  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
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
    return Objects.equals(pid, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.pid) &&
        Objects.equals(title, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.title) &&
        Objects.equals(description, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.description) &&
        Objects.equals(properties, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.properties) &&
        Objects.equals(additionalProperties, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.additionalProperties) &&
        Objects.equals(bundleLocation, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comDayCqWcmCoreImplWCMDeveloperModeFilterInfo.serviceLocation);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
