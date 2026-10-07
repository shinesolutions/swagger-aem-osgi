package org.openapitools.model;

import org.openapitools.model.ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties properties;

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

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo pid(String pid) {
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

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo title(String title) {
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

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties properties) {
    this.properties = properties;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo properties(ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties properties) {
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

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo bundleLocation(String bundleLocation) {
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

  public ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo serviceLocation(String serviceLocation) {
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
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo = (ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo) o;
    return Objects.equals(this.pid, comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo.pid) &&
        Objects.equals(this.title, comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo.title) &&
        Objects.equals(this.description, comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo.description) &&
        Objects.equals(this.properties, comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo.properties) &&
        Objects.equals(this.bundleLocation, comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo {\n");
    
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

