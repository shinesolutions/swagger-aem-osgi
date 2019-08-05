package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties properties = null;

  @JsonProperty("bundle_location")
  private String bundleLocation = null;

  @JsonProperty("service_location")
  private String serviceLocation = null;

  /**
   **/
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo pid(String pid) {
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
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo title(String title) {
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
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo description(String description) {
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
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo properties(ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo bundleLocation(String bundleLocation) {
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
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo serviceLocation(String serviceLocation) {
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
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo = (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo) o;
    return Objects.equals(pid, comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.pid) &&
        Objects.equals(title, comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.title) &&
        Objects.equals(description, comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.description) &&
        Objects.equals(properties, comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.properties) &&
        Objects.equals(bundleLocation, comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo {\n");
    
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

