package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComDayCqWidgetImplWidgetExtensionProviderImplProperties;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWidgetImplWidgetExtensionProviderImplInfo
 */

@JsonTypeName("comDayCqWidgetImplWidgetExtensionProviderImplInfo")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWidgetImplWidgetExtensionProviderImplInfo {

  private String pid;

  private String title;

  private String description;

  private ComDayCqWidgetImplWidgetExtensionProviderImplProperties properties;

  private String bundleLocation;

  private String serviceLocation;

  public ComDayCqWidgetImplWidgetExtensionProviderImplInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplInfo properties(ComDayCqWidgetImplWidgetExtensionProviderImplProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @Valid 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqWidgetImplWidgetExtensionProviderImplProperties properties) {
    this.properties = properties;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  /**
   * Get bundleLocation
   * @return bundleLocation
   */
  
  @Schema(name = "bundle_location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  /**
   * Get serviceLocation
   * @return serviceLocation
   */
  
  @Schema(name = "service_location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ComDayCqWidgetImplWidgetExtensionProviderImplInfo comDayCqWidgetImplWidgetExtensionProviderImplInfo = (ComDayCqWidgetImplWidgetExtensionProviderImplInfo) o;
    return Objects.equals(this.pid, comDayCqWidgetImplWidgetExtensionProviderImplInfo.pid) &&
        Objects.equals(this.title, comDayCqWidgetImplWidgetExtensionProviderImplInfo.title) &&
        Objects.equals(this.description, comDayCqWidgetImplWidgetExtensionProviderImplInfo.description) &&
        Objects.equals(this.properties, comDayCqWidgetImplWidgetExtensionProviderImplInfo.properties) &&
        Objects.equals(this.bundleLocation, comDayCqWidgetImplWidgetExtensionProviderImplInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comDayCqWidgetImplWidgetExtensionProviderImplInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWidgetImplWidgetExtensionProviderImplInfo {\n");
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

