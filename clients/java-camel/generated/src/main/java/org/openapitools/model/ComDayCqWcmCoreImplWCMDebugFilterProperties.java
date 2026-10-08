package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmCoreImplWCMDebugFilterProperties
 */

@JsonTypeName("comDayCqWcmCoreImplWCMDebugFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplWCMDebugFilterProperties {

  private ConfigNodePropertyBoolean wcmdbgfilterEnabled;

  private ConfigNodePropertyBoolean wcmdbgfilterJspDebug;

  public ComDayCqWcmCoreImplWCMDebugFilterProperties wcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
    this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
    return this;
  }

  /**
   * Get wcmdbgfilterEnabled
   * @return wcmdbgfilterEnabled
   */
  @Valid 
  @Schema(name = "wcmdbgfilter.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wcmdbgfilter.enabled")
  public ConfigNodePropertyBoolean getWcmdbgfilterEnabled() {
    return wcmdbgfilterEnabled;
  }

  public void setWcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
    this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
  }

  public ComDayCqWcmCoreImplWCMDebugFilterProperties wcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
    this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
    return this;
  }

  /**
   * Get wcmdbgfilterJspDebug
   * @return wcmdbgfilterJspDebug
   */
  @Valid 
  @Schema(name = "wcmdbgfilter.jspDebug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wcmdbgfilter.jspDebug")
  public ConfigNodePropertyBoolean getWcmdbgfilterJspDebug() {
    return wcmdbgfilterJspDebug;
  }

  public void setWcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
    this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWCMDebugFilterProperties comDayCqWcmCoreImplWCMDebugFilterProperties = (ComDayCqWcmCoreImplWCMDebugFilterProperties) o;
    return Objects.equals(this.wcmdbgfilterEnabled, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterEnabled) &&
        Objects.equals(this.wcmdbgfilterJspDebug, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterJspDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmdbgfilterEnabled, wcmdbgfilterJspDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDebugFilterProperties {\n");
    sb.append("    wcmdbgfilterEnabled: ").append(toIndentedString(wcmdbgfilterEnabled)).append("\n");
    sb.append("    wcmdbgfilterJspDebug: ").append(toIndentedString(wcmdbgfilterJspDebug)).append("\n");
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

