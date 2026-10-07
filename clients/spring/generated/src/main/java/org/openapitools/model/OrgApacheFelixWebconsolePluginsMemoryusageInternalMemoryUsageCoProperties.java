package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
 */

@JsonTypeName("orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger felixMemoryusageDumpThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger felixMemoryusageDumpInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString felixMemoryusageDumpLocation;

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpThreshold(@Nullable ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
    return this;
  }

  /**
   * Get felixMemoryusageDumpThreshold
   * @return felixMemoryusageDumpThreshold
   */
  @Valid 
  @Schema(name = "felix.memoryusage.dump.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("felix.memoryusage.dump.threshold")
  public @Nullable ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
    return felixMemoryusageDumpThreshold;
  }

  @JsonProperty("felix.memoryusage.dump.threshold")
  public void setFelixMemoryusageDumpThreshold(@Nullable ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpInterval(@Nullable ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
    return this;
  }

  /**
   * Get felixMemoryusageDumpInterval
   * @return felixMemoryusageDumpInterval
   */
  @Valid 
  @Schema(name = "felix.memoryusage.dump.interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("felix.memoryusage.dump.interval")
  public @Nullable ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
    return felixMemoryusageDumpInterval;
  }

  @JsonProperty("felix.memoryusage.dump.interval")
  public void setFelixMemoryusageDumpInterval(@Nullable ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpLocation(@Nullable ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
    return this;
  }

  /**
   * Get felixMemoryusageDumpLocation
   * @return felixMemoryusageDumpLocation
   */
  @Valid 
  @Schema(name = "felix.memoryusage.dump.location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("felix.memoryusage.dump.location")
  public @Nullable ConfigNodePropertyString getFelixMemoryusageDumpLocation() {
    return felixMemoryusageDumpLocation;
  }

  @JsonProperty("felix.memoryusage.dump.location")
  public void setFelixMemoryusageDumpLocation(@Nullable ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties = (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties) o;
    return Objects.equals(this.felixMemoryusageDumpThreshold, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpThreshold) &&
        Objects.equals(this.felixMemoryusageDumpInterval, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpInterval) &&
        Objects.equals(this.felixMemoryusageDumpLocation, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(felixMemoryusageDumpThreshold, felixMemoryusageDumpInterval, felixMemoryusageDumpLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {\n");
    sb.append("    felixMemoryusageDumpThreshold: ").append(toIndentedString(felixMemoryusageDumpThreshold)).append("\n");
    sb.append("    felixMemoryusageDumpInterval: ").append(toIndentedString(felixMemoryusageDumpInterval)).append("\n");
    sb.append("    felixMemoryusageDumpLocation: ").append(toIndentedString(felixMemoryusageDumpLocation)).append("\n");
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

