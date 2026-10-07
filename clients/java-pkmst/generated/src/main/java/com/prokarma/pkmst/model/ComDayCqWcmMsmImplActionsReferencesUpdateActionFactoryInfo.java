package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties properties;

  @JsonProperty("bundle_location")
  private String bundleLocation;

  @JsonProperty("service_location")
  private String serviceLocation;

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @ApiModelProperty(value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo properties(ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @ApiModelProperty(value = "")
  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties properties) {
    this.properties = properties;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  /**
   * Get bundleLocation
   * @return bundleLocation
   */
  @ApiModelProperty(value = "")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  /**
   * Get serviceLocation
   * @return serviceLocation
   */
  @ApiModelProperty(value = "")
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
    ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo = (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo) o;
    return Objects.equals(this.pid, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo.pid) &&
        Objects.equals(this.title, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo.title) &&
        Objects.equals(this.description, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo.description) &&
        Objects.equals(this.properties, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo.properties) &&
        Objects.equals(this.bundleLocation, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo {\n");
    
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

