package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo
 */

@JsonTypeName("comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String pid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String title;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties properties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String additionalProperties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String bundleLocation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String serviceLocation;

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo pid(@Nullable String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pid")
  public @Nullable String getPid() {
    return pid;
  }

  @JsonProperty("pid")
  public void setPid(@Nullable String pid) {
    this.pid = pid;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo properties(@Nullable ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties properties) {
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
  public @Nullable ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(@Nullable ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties properties) {
    this.properties = properties;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo additionalProperties(@Nullable String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Get additionalProperties
   * @return additionalProperties
   */
  
  @Schema(name = "additionalProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalProperties")
  public @Nullable String getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonProperty("additionalProperties")
  public void setAdditionalProperties(@Nullable String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo bundleLocation(@Nullable String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  /**
   * Get bundleLocation
   * @return bundleLocation
   */
  
  @Schema(name = "bundle_location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundle_location")
  public @Nullable String getBundleLocation() {
    return bundleLocation;
  }

  @JsonProperty("bundle_location")
  public void setBundleLocation(@Nullable String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo serviceLocation(@Nullable String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  /**
   * Get serviceLocation
   * @return serviceLocation
   */
  
  @Schema(name = "service_location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_location")
  public @Nullable String getServiceLocation() {
    return serviceLocation;
  }

  @JsonProperty("service_location")
  public void setServiceLocation(@Nullable String serviceLocation) {
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
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo = (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo) o;
    return Objects.equals(this.pid, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.pid) &&
        Objects.equals(this.title, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.title) &&
        Objects.equals(this.description, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.description) &&
        Objects.equals(this.properties, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.properties) &&
        Objects.equals(this.additionalProperties, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.additionalProperties) &&
        Objects.equals(this.bundleLocation, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, additionalProperties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

