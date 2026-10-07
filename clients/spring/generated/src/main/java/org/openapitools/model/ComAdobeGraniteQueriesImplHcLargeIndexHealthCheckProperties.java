package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
 */

@JsonTypeName("comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger largeIndexCriticalThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger largeIndexWarnThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties largeIndexCriticalThreshold(@Nullable ConfigNodePropertyInteger largeIndexCriticalThreshold) {
    this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
    return this;
  }

  /**
   * Get largeIndexCriticalThreshold
   * @return largeIndexCriticalThreshold
   */
  @Valid 
  @Schema(name = "large.index.critical.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("large.index.critical.threshold")
  public @Nullable ConfigNodePropertyInteger getLargeIndexCriticalThreshold() {
    return largeIndexCriticalThreshold;
  }

  @JsonProperty("large.index.critical.threshold")
  public void setLargeIndexCriticalThreshold(@Nullable ConfigNodePropertyInteger largeIndexCriticalThreshold) {
    this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
  }

  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties largeIndexWarnThreshold(@Nullable ConfigNodePropertyInteger largeIndexWarnThreshold) {
    this.largeIndexWarnThreshold = largeIndexWarnThreshold;
    return this;
  }

  /**
   * Get largeIndexWarnThreshold
   * @return largeIndexWarnThreshold
   */
  @Valid 
  @Schema(name = "large.index.warn.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("large.index.warn.threshold")
  public @Nullable ConfigNodePropertyInteger getLargeIndexWarnThreshold() {
    return largeIndexWarnThreshold;
  }

  @JsonProperty("large.index.warn.threshold")
  public void setLargeIndexWarnThreshold(@Nullable ConfigNodePropertyInteger largeIndexWarnThreshold) {
    this.largeIndexWarnThreshold = largeIndexWarnThreshold;
  }

  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public @Nullable ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  @JsonProperty("hc.tags")
  public void setHcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties = (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties) o;
    return Objects.equals(this.largeIndexCriticalThreshold, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.largeIndexCriticalThreshold) &&
        Objects.equals(this.largeIndexWarnThreshold, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.largeIndexWarnThreshold) &&
        Objects.equals(this.hcTags, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.hcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeIndexCriticalThreshold, largeIndexWarnThreshold, hcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {\n");
    sb.append("    largeIndexCriticalThreshold: ").append(toIndentedString(largeIndexCriticalThreshold)).append("\n");
    sb.append("    largeIndexWarnThreshold: ").append(toIndentedString(largeIndexWarnThreshold)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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

