package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
 */

@JsonTypeName("comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString maxConnections;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString maxRequests;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString requestTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString logDir;

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxConnections(@Nullable ConfigNodePropertyString maxConnections) {
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
  public @Nullable ConfigNodePropertyString getMaxConnections() {
    return maxConnections;
  }

  @JsonProperty("maxConnections")
  public void setMaxConnections(@Nullable ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxRequests(@Nullable ConfigNodePropertyString maxRequests) {
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
  public @Nullable ConfigNodePropertyString getMaxRequests() {
    return maxRequests;
  }

  @JsonProperty("maxRequests")
  public void setMaxRequests(@Nullable ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties requestTimeout(@Nullable ConfigNodePropertyString requestTimeout) {
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
  public @Nullable ConfigNodePropertyString getRequestTimeout() {
    return requestTimeout;
  }

  @JsonProperty("requestTimeout")
  public void setRequestTimeout(@Nullable ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties logDir(@Nullable ConfigNodePropertyString logDir) {
    this.logDir = logDir;
    return this;
  }

  /**
   * Get logDir
   * @return logDir
   */
  @Valid 
  @Schema(name = "logDir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logDir")
  public @Nullable ConfigNodePropertyString getLogDir() {
    return logDir;
  }

  @JsonProperty("logDir")
  public void setLogDir(@Nullable ConfigNodePropertyString logDir) {
    this.logDir = logDir;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties = (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties) o;
    return Objects.equals(this.maxConnections, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.maxConnections) &&
        Objects.equals(this.maxRequests, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.maxRequests) &&
        Objects.equals(this.requestTimeout, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.requestTimeout) &&
        Objects.equals(this.logDir, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.logDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConnections, maxRequests, requestTimeout, logDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    maxRequests: ").append(toIndentedString(maxRequests)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    logDir: ").append(toIndentedString(logDir)).append("\n");
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

