package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqReportingImplCacheCacheImplProperties
 */

@JsonTypeName("comDayCqReportingImplCacheCacheImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReportingImplCacheCacheImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean repcacheEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger repcacheTtl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger repcacheMax;

  public ComDayCqReportingImplCacheCacheImplProperties repcacheEnable(@Nullable ConfigNodePropertyBoolean repcacheEnable) {
    this.repcacheEnable = repcacheEnable;
    return this;
  }

  /**
   * Get repcacheEnable
   * @return repcacheEnable
   */
  @Valid 
  @Schema(name = "repcache.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repcache.enable")
  public @Nullable ConfigNodePropertyBoolean getRepcacheEnable() {
    return repcacheEnable;
  }

  @JsonProperty("repcache.enable")
  public void setRepcacheEnable(@Nullable ConfigNodePropertyBoolean repcacheEnable) {
    this.repcacheEnable = repcacheEnable;
  }

  public ComDayCqReportingImplCacheCacheImplProperties repcacheTtl(@Nullable ConfigNodePropertyInteger repcacheTtl) {
    this.repcacheTtl = repcacheTtl;
    return this;
  }

  /**
   * Get repcacheTtl
   * @return repcacheTtl
   */
  @Valid 
  @Schema(name = "repcache.ttl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repcache.ttl")
  public @Nullable ConfigNodePropertyInteger getRepcacheTtl() {
    return repcacheTtl;
  }

  @JsonProperty("repcache.ttl")
  public void setRepcacheTtl(@Nullable ConfigNodePropertyInteger repcacheTtl) {
    this.repcacheTtl = repcacheTtl;
  }

  public ComDayCqReportingImplCacheCacheImplProperties repcacheMax(@Nullable ConfigNodePropertyInteger repcacheMax) {
    this.repcacheMax = repcacheMax;
    return this;
  }

  /**
   * Get repcacheMax
   * @return repcacheMax
   */
  @Valid 
  @Schema(name = "repcache.max", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repcache.max")
  public @Nullable ConfigNodePropertyInteger getRepcacheMax() {
    return repcacheMax;
  }

  @JsonProperty("repcache.max")
  public void setRepcacheMax(@Nullable ConfigNodePropertyInteger repcacheMax) {
    this.repcacheMax = repcacheMax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReportingImplCacheCacheImplProperties comDayCqReportingImplCacheCacheImplProperties = (ComDayCqReportingImplCacheCacheImplProperties) o;
    return Objects.equals(this.repcacheEnable, comDayCqReportingImplCacheCacheImplProperties.repcacheEnable) &&
        Objects.equals(this.repcacheTtl, comDayCqReportingImplCacheCacheImplProperties.repcacheTtl) &&
        Objects.equals(this.repcacheMax, comDayCqReportingImplCacheCacheImplProperties.repcacheMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repcacheEnable, repcacheTtl, repcacheMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReportingImplCacheCacheImplProperties {\n");
    sb.append("    repcacheEnable: ").append(toIndentedString(repcacheEnable)).append("\n");
    sb.append("    repcacheTtl: ").append(toIndentedString(repcacheTtl)).append("\n");
    sb.append("    repcacheMax: ").append(toIndentedString(repcacheMax)).append("\n");
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

