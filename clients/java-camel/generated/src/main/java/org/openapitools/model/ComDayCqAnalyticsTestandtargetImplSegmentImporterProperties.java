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
 * ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties
 */

@JsonTypeName("comDayCqAnalyticsTestandtargetImplSegmentImporterProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties {

  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled;

  public ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties cqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
    this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetSegmentimporterEnabled
   * @return cqAnalyticsTestandtargetSegmentimporterEnabled
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.segmentimporter.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.segmentimporter.enabled")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetSegmentimporterEnabled() {
    return cqAnalyticsTestandtargetSegmentimporterEnabled;
  }

  public void setCqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
    this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties comDayCqAnalyticsTestandtargetImplSegmentImporterProperties = (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties) o;
    return Objects.equals(this.cqAnalyticsTestandtargetSegmentimporterEnabled, comDayCqAnalyticsTestandtargetImplSegmentImporterProperties.cqAnalyticsTestandtargetSegmentimporterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetSegmentimporterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties {\n");
    sb.append("    cqAnalyticsTestandtargetSegmentimporterEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetSegmentimporterEnabled)).append("\n");
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

