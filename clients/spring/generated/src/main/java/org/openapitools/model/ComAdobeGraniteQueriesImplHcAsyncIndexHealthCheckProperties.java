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
 * ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties
 */

@JsonTypeName("comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger indexingCriticalThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger indexingWarnThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties indexingCriticalThreshold(@Nullable ConfigNodePropertyInteger indexingCriticalThreshold) {
    this.indexingCriticalThreshold = indexingCriticalThreshold;
    return this;
  }

  /**
   * Get indexingCriticalThreshold
   * @return indexingCriticalThreshold
   */
  @Valid 
  @Schema(name = "indexing.critical.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indexing.critical.threshold")
  public @Nullable ConfigNodePropertyInteger getIndexingCriticalThreshold() {
    return indexingCriticalThreshold;
  }

  @JsonProperty("indexing.critical.threshold")
  public void setIndexingCriticalThreshold(@Nullable ConfigNodePropertyInteger indexingCriticalThreshold) {
    this.indexingCriticalThreshold = indexingCriticalThreshold;
  }

  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties indexingWarnThreshold(@Nullable ConfigNodePropertyInteger indexingWarnThreshold) {
    this.indexingWarnThreshold = indexingWarnThreshold;
    return this;
  }

  /**
   * Get indexingWarnThreshold
   * @return indexingWarnThreshold
   */
  @Valid 
  @Schema(name = "indexing.warn.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indexing.warn.threshold")
  public @Nullable ConfigNodePropertyInteger getIndexingWarnThreshold() {
    return indexingWarnThreshold;
  }

  @JsonProperty("indexing.warn.threshold")
  public void setIndexingWarnThreshold(@Nullable ConfigNodePropertyInteger indexingWarnThreshold) {
    this.indexingWarnThreshold = indexingWarnThreshold;
  }

  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
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
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties = (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties) o;
    return Objects.equals(this.indexingCriticalThreshold, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.indexingCriticalThreshold) &&
        Objects.equals(this.indexingWarnThreshold, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.indexingWarnThreshold) &&
        Objects.equals(this.hcTags, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.hcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexingCriticalThreshold, indexingWarnThreshold, hcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {\n");
    sb.append("    indexingCriticalThreshold: ").append(toIndentedString(indexingCriticalThreshold)).append("\n");
    sb.append("    indexingWarnThreshold: ").append(toIndentedString(indexingWarnThreshold)).append("\n");
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

