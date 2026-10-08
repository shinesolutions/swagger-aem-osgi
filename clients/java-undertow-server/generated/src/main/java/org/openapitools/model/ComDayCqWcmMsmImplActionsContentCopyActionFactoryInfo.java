/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo   {
  
  private String pid;
  private String title;
  private String description;
  private ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties properties;
  private String bundleLocation;
  private String serviceLocation;

  /**
   */
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo pid(String pid) {
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
   */
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo title(String title) {
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
   */
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo description(String description) {
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
   */
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo properties(ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties properties) {
    this.properties = properties;
  }

  /**
   */
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo bundleLocation(String bundleLocation) {
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
   */
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo serviceLocation(String serviceLocation) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo = (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo) o;
    return Objects.equals(pid, comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.pid) &&
        Objects.equals(title, comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.title) &&
        Objects.equals(description, comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.description) &&
        Objects.equals(properties, comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.properties) &&
        Objects.equals(bundleLocation, comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

