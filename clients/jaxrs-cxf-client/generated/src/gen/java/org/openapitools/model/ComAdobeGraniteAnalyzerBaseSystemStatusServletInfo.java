package org.openapitools.model;

import org.openapitools.model.ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties properties;

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

  public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo pid(String pid) {
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

  public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo title(String title) {
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

  public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties properties) {
    this.properties = properties;
  }

  public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo properties(ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties properties) {
    this.properties = properties;
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

  public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo bundleLocation(String bundleLocation) {
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

  public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo serviceLocation(String serviceLocation) {
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
    ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo comAdobeGraniteAnalyzerBaseSystemStatusServletInfo = (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo) o;
    return Objects.equals(this.pid, comAdobeGraniteAnalyzerBaseSystemStatusServletInfo.pid) &&
        Objects.equals(this.title, comAdobeGraniteAnalyzerBaseSystemStatusServletInfo.title) &&
        Objects.equals(this.description, comAdobeGraniteAnalyzerBaseSystemStatusServletInfo.description) &&
        Objects.equals(this.properties, comAdobeGraniteAnalyzerBaseSystemStatusServletInfo.properties) &&
        Objects.equals(this.bundleLocation, comAdobeGraniteAnalyzerBaseSystemStatusServletInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comAdobeGraniteAnalyzerBaseSystemStatusServletInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

