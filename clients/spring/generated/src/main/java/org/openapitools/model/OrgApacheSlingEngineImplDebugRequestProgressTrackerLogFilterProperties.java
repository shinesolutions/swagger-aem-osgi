package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
 */

@JsonTypeName("orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray extensions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minDurationMs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxDurationMs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean compactLogFormat;

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties extensions(@Nullable ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
    return this;
  }

  /**
   * Get extensions
   * @return extensions
   */
  @Valid 
  @Schema(name = "extensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extensions")
  public @Nullable ConfigNodePropertyArray getExtensions() {
    return extensions;
  }

  @JsonProperty("extensions")
  public void setExtensions(@Nullable ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties minDurationMs(@Nullable ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
    return this;
  }

  /**
   * Get minDurationMs
   * @return minDurationMs
   */
  @Valid 
  @Schema(name = "minDurationMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minDurationMs")
  public @Nullable ConfigNodePropertyInteger getMinDurationMs() {
    return minDurationMs;
  }

  @JsonProperty("minDurationMs")
  public void setMinDurationMs(@Nullable ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties maxDurationMs(@Nullable ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
    return this;
  }

  /**
   * Get maxDurationMs
   * @return maxDurationMs
   */
  @Valid 
  @Schema(name = "maxDurationMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxDurationMs")
  public @Nullable ConfigNodePropertyInteger getMaxDurationMs() {
    return maxDurationMs;
  }

  @JsonProperty("maxDurationMs")
  public void setMaxDurationMs(@Nullable ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties compactLogFormat(@Nullable ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
    return this;
  }

  /**
   * Get compactLogFormat
   * @return compactLogFormat
   */
  @Valid 
  @Schema(name = "compactLogFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compactLogFormat")
  public @Nullable ConfigNodePropertyBoolean getCompactLogFormat() {
    return compactLogFormat;
  }

  @JsonProperty("compactLogFormat")
  public void setCompactLogFormat(@Nullable ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties = (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties) o;
    return Objects.equals(this.extensions, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.extensions) &&
        Objects.equals(this.minDurationMs, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.minDurationMs) &&
        Objects.equals(this.maxDurationMs, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.maxDurationMs) &&
        Objects.equals(this.compactLogFormat, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.compactLogFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions, minDurationMs, maxDurationMs, compactLogFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    minDurationMs: ").append(toIndentedString(minDurationMs)).append("\n");
    sb.append("    maxDurationMs: ").append(toIndentedString(maxDurationMs)).append("\n");
    sb.append("    compactLogFormat: ").append(toIndentedString(compactLogFormat)).append("\n");
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

