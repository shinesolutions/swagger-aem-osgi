package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeOctopusNcommBootstrapProperties
 */

@JsonTypeName("comAdobeOctopusNcommBootstrapProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeOctopusNcommBootstrapProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxConnections;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxRequests;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger requestTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger requestRetries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger launchTimeout;

  public ComAdobeOctopusNcommBootstrapProperties maxConnections(@Nullable ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

  /**
   * Get maxConnections
   * @return maxConnections
   */
  @Valid 
  @Schema(name = "maxConnections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxConnections")
  public @Nullable ConfigNodePropertyInteger getMaxConnections() {
    return maxConnections;
  }

  @JsonProperty("maxConnections")
  public void setMaxConnections(@Nullable ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
  }

  public ComAdobeOctopusNcommBootstrapProperties maxRequests(@Nullable ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

  /**
   * Get maxRequests
   * @return maxRequests
   */
  @Valid 
  @Schema(name = "maxRequests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxRequests")
  public @Nullable ConfigNodePropertyInteger getMaxRequests() {
    return maxRequests;
  }

  @JsonProperty("maxRequests")
  public void setMaxRequests(@Nullable ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
  }

  public ComAdobeOctopusNcommBootstrapProperties requestTimeout(@Nullable ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

  /**
   * Get requestTimeout
   * @return requestTimeout
   */
  @Valid 
  @Schema(name = "requestTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestTimeout")
  public @Nullable ConfigNodePropertyInteger getRequestTimeout() {
    return requestTimeout;
  }

  @JsonProperty("requestTimeout")
  public void setRequestTimeout(@Nullable ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public ComAdobeOctopusNcommBootstrapProperties requestRetries(@Nullable ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
    return this;
  }

  /**
   * Get requestRetries
   * @return requestRetries
   */
  @Valid 
  @Schema(name = "requestRetries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestRetries")
  public @Nullable ConfigNodePropertyInteger getRequestRetries() {
    return requestRetries;
  }

  @JsonProperty("requestRetries")
  public void setRequestRetries(@Nullable ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
  }

  public ComAdobeOctopusNcommBootstrapProperties launchTimeout(@Nullable ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
    return this;
  }

  /**
   * Get launchTimeout
   * @return launchTimeout
   */
  @Valid 
  @Schema(name = "launchTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("launchTimeout")
  public @Nullable ConfigNodePropertyInteger getLaunchTimeout() {
    return launchTimeout;
  }

  @JsonProperty("launchTimeout")
  public void setLaunchTimeout(@Nullable ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeOctopusNcommBootstrapProperties comAdobeOctopusNcommBootstrapProperties = (ComAdobeOctopusNcommBootstrapProperties) o;
    return Objects.equals(this.maxConnections, comAdobeOctopusNcommBootstrapProperties.maxConnections) &&
        Objects.equals(this.maxRequests, comAdobeOctopusNcommBootstrapProperties.maxRequests) &&
        Objects.equals(this.requestTimeout, comAdobeOctopusNcommBootstrapProperties.requestTimeout) &&
        Objects.equals(this.requestRetries, comAdobeOctopusNcommBootstrapProperties.requestRetries) &&
        Objects.equals(this.launchTimeout, comAdobeOctopusNcommBootstrapProperties.launchTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConnections, maxRequests, requestTimeout, requestRetries, launchTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeOctopusNcommBootstrapProperties {\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    maxRequests: ").append(toIndentedString(maxRequests)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    requestRetries: ").append(toIndentedString(requestRetries)).append("\n");
    sb.append("    launchTimeout: ").append(toIndentedString(launchTimeout)).append("\n");
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

