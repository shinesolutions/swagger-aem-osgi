package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComAdobeGraniteMonitoringImplScriptConfigImplProperties
 */

@JsonTypeName("comAdobeGraniteMonitoringImplScriptConfigImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString scriptFilename;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString scriptDisplay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString scriptPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray scriptPlatform;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger interval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jmxdomain;

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptFilename(@Nullable ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
    return this;
  }

  /**
   * Get scriptFilename
   * @return scriptFilename
   */
  @Valid 
  @Schema(name = "script.filename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("script.filename")
  public @Nullable ConfigNodePropertyString getScriptFilename() {
    return scriptFilename;
  }

  @JsonProperty("script.filename")
  public void setScriptFilename(@Nullable ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptDisplay(@Nullable ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
    return this;
  }

  /**
   * Get scriptDisplay
   * @return scriptDisplay
   */
  @Valid 
  @Schema(name = "script.display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("script.display")
  public @Nullable ConfigNodePropertyString getScriptDisplay() {
    return scriptDisplay;
  }

  @JsonProperty("script.display")
  public void setScriptDisplay(@Nullable ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPath(@Nullable ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
    return this;
  }

  /**
   * Get scriptPath
   * @return scriptPath
   */
  @Valid 
  @Schema(name = "script.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("script.path")
  public @Nullable ConfigNodePropertyString getScriptPath() {
    return scriptPath;
  }

  @JsonProperty("script.path")
  public void setScriptPath(@Nullable ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPlatform(@Nullable ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
    return this;
  }

  /**
   * Get scriptPlatform
   * @return scriptPlatform
   */
  @Valid 
  @Schema(name = "script.platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("script.platform")
  public @Nullable ConfigNodePropertyArray getScriptPlatform() {
    return scriptPlatform;
  }

  @JsonProperty("script.platform")
  public void setScriptPlatform(@Nullable ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties interval(@Nullable ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @Valid 
  @Schema(name = "interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interval")
  public @Nullable ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  @JsonProperty("interval")
  public void setInterval(@Nullable ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties jmxdomain(@Nullable ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
    return this;
  }

  /**
   * Get jmxdomain
   * @return jmxdomain
   */
  @Valid 
  @Schema(name = "jmxdomain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jmxdomain")
  public @Nullable ConfigNodePropertyString getJmxdomain() {
    return jmxdomain;
  }

  @JsonProperty("jmxdomain")
  public void setJmxdomain(@Nullable ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteMonitoringImplScriptConfigImplProperties comAdobeGraniteMonitoringImplScriptConfigImplProperties = (ComAdobeGraniteMonitoringImplScriptConfigImplProperties) o;
    return Objects.equals(this.scriptFilename, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptFilename) &&
        Objects.equals(this.scriptDisplay, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptDisplay) &&
        Objects.equals(this.scriptPath, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptPath) &&
        Objects.equals(this.scriptPlatform, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptPlatform) &&
        Objects.equals(this.interval, comAdobeGraniteMonitoringImplScriptConfigImplProperties.interval) &&
        Objects.equals(this.jmxdomain, comAdobeGraniteMonitoringImplScriptConfigImplProperties.jmxdomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptFilename, scriptDisplay, scriptPath, scriptPlatform, interval, jmxdomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {\n");
    sb.append("    scriptFilename: ").append(toIndentedString(scriptFilename)).append("\n");
    sb.append("    scriptDisplay: ").append(toIndentedString(scriptDisplay)).append("\n");
    sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
    sb.append("    scriptPlatform: ").append(toIndentedString(scriptPlatform)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    jmxdomain: ").append(toIndentedString(jmxdomain)).append("\n");
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

