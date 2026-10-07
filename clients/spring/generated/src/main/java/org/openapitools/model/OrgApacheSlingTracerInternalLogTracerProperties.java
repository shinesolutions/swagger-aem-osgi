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
 * OrgApacheSlingTracerInternalLogTracerProperties
 */

@JsonTypeName("orgApacheSlingTracerInternalLogTracerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingTracerInternalLogTracerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray tracerSets;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean servletEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger recordingCacheSizeInMB;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger recordingCacheDurationInSecs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean recordingCompressionEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean gzipResponse;

  public OrgApacheSlingTracerInternalLogTracerProperties tracerSets(@Nullable ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
    return this;
  }

  /**
   * Get tracerSets
   * @return tracerSets
   */
  @Valid 
  @Schema(name = "tracerSets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracerSets")
  public @Nullable ConfigNodePropertyArray getTracerSets() {
    return tracerSets;
  }

  @JsonProperty("tracerSets")
  public void setTracerSets(@Nullable ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties servletEnabled(@Nullable ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
    return this;
  }

  /**
   * Get servletEnabled
   * @return servletEnabled
   */
  @Valid 
  @Schema(name = "servletEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servletEnabled")
  public @Nullable ConfigNodePropertyBoolean getServletEnabled() {
    return servletEnabled;
  }

  @JsonProperty("servletEnabled")
  public void setServletEnabled(@Nullable ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheSizeInMB(@Nullable ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
    return this;
  }

  /**
   * Get recordingCacheSizeInMB
   * @return recordingCacheSizeInMB
   */
  @Valid 
  @Schema(name = "recordingCacheSizeInMB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordingCacheSizeInMB")
  public @Nullable ConfigNodePropertyInteger getRecordingCacheSizeInMB() {
    return recordingCacheSizeInMB;
  }

  @JsonProperty("recordingCacheSizeInMB")
  public void setRecordingCacheSizeInMB(@Nullable ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheDurationInSecs(@Nullable ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
    return this;
  }

  /**
   * Get recordingCacheDurationInSecs
   * @return recordingCacheDurationInSecs
   */
  @Valid 
  @Schema(name = "recordingCacheDurationInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordingCacheDurationInSecs")
  public @Nullable ConfigNodePropertyInteger getRecordingCacheDurationInSecs() {
    return recordingCacheDurationInSecs;
  }

  @JsonProperty("recordingCacheDurationInSecs")
  public void setRecordingCacheDurationInSecs(@Nullable ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCompressionEnabled(@Nullable ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
    return this;
  }

  /**
   * Get recordingCompressionEnabled
   * @return recordingCompressionEnabled
   */
  @Valid 
  @Schema(name = "recordingCompressionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordingCompressionEnabled")
  public @Nullable ConfigNodePropertyBoolean getRecordingCompressionEnabled() {
    return recordingCompressionEnabled;
  }

  @JsonProperty("recordingCompressionEnabled")
  public void setRecordingCompressionEnabled(@Nullable ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties gzipResponse(@Nullable ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
    return this;
  }

  /**
   * Get gzipResponse
   * @return gzipResponse
   */
  @Valid 
  @Schema(name = "gzipResponse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gzipResponse")
  public @Nullable ConfigNodePropertyBoolean getGzipResponse() {
    return gzipResponse;
  }

  @JsonProperty("gzipResponse")
  public void setGzipResponse(@Nullable ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingTracerInternalLogTracerProperties orgApacheSlingTracerInternalLogTracerProperties = (OrgApacheSlingTracerInternalLogTracerProperties) o;
    return Objects.equals(this.tracerSets, orgApacheSlingTracerInternalLogTracerProperties.tracerSets) &&
        Objects.equals(this.enabled, orgApacheSlingTracerInternalLogTracerProperties.enabled) &&
        Objects.equals(this.servletEnabled, orgApacheSlingTracerInternalLogTracerProperties.servletEnabled) &&
        Objects.equals(this.recordingCacheSizeInMB, orgApacheSlingTracerInternalLogTracerProperties.recordingCacheSizeInMB) &&
        Objects.equals(this.recordingCacheDurationInSecs, orgApacheSlingTracerInternalLogTracerProperties.recordingCacheDurationInSecs) &&
        Objects.equals(this.recordingCompressionEnabled, orgApacheSlingTracerInternalLogTracerProperties.recordingCompressionEnabled) &&
        Objects.equals(this.gzipResponse, orgApacheSlingTracerInternalLogTracerProperties.gzipResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracerSets, enabled, servletEnabled, recordingCacheSizeInMB, recordingCacheDurationInSecs, recordingCompressionEnabled, gzipResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingTracerInternalLogTracerProperties {\n");
    sb.append("    tracerSets: ").append(toIndentedString(tracerSets)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    servletEnabled: ").append(toIndentedString(servletEnabled)).append("\n");
    sb.append("    recordingCacheSizeInMB: ").append(toIndentedString(recordingCacheSizeInMB)).append("\n");
    sb.append("    recordingCacheDurationInSecs: ").append(toIndentedString(recordingCacheDurationInSecs)).append("\n");
    sb.append("    recordingCompressionEnabled: ").append(toIndentedString(recordingCompressionEnabled)).append("\n");
    sb.append("    gzipResponse: ").append(toIndentedString(gzipResponse)).append("\n");
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

