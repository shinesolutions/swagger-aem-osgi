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
 * AnalyticsComponentQueryCacheServiceProperties
 */

@JsonTypeName("analyticsComponentQueryCacheServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AnalyticsComponentQueryCacheServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize;

  public AnalyticsComponentQueryCacheServiceProperties cqAnalyticsComponentQueryCacheSize(@Nullable ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
    this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
    return this;
  }

  /**
   * Get cqAnalyticsComponentQueryCacheSize
   * @return cqAnalyticsComponentQueryCacheSize
   */
  @Valid 
  @Schema(name = "cq.analytics.component.query.cache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.component.query.cache.size")
  public @Nullable ConfigNodePropertyInteger getCqAnalyticsComponentQueryCacheSize() {
    return cqAnalyticsComponentQueryCacheSize;
  }

  @JsonProperty("cq.analytics.component.query.cache.size")
  public void setCqAnalyticsComponentQueryCacheSize(@Nullable ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
    this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsComponentQueryCacheServiceProperties analyticsComponentQueryCacheServiceProperties = (AnalyticsComponentQueryCacheServiceProperties) o;
    return Objects.equals(this.cqAnalyticsComponentQueryCacheSize, analyticsComponentQueryCacheServiceProperties.cqAnalyticsComponentQueryCacheSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsComponentQueryCacheSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsComponentQueryCacheServiceProperties {\n");
    sb.append("    cqAnalyticsComponentQueryCacheSize: ").append(toIndentedString(cqAnalyticsComponentQueryCacheSize)).append("\n");
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

