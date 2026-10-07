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
 * ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
 */

@JsonTypeName("comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith;

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetApiUrl(@Nullable ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetApiUrl
   * @return cqAnalyticsTestandtargetApiUrl
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.api.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.api.url")
  public @Nullable ConfigNodePropertyString getCqAnalyticsTestandtargetApiUrl() {
    return cqAnalyticsTestandtargetApiUrl;
  }

  @JsonProperty("cq.analytics.testandtarget.api.url")
  public void setCqAnalyticsTestandtargetApiUrl(@Nullable ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetTimeout(@Nullable ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetTimeout
   * @return cqAnalyticsTestandtargetTimeout
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.timeout")
  public @Nullable ConfigNodePropertyInteger getCqAnalyticsTestandtargetTimeout() {
    return cqAnalyticsTestandtargetTimeout;
  }

  @JsonProperty("cq.analytics.testandtarget.timeout")
  public void setCqAnalyticsTestandtargetTimeout(@Nullable ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetSockettimeout(@Nullable ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetSockettimeout
   * @return cqAnalyticsTestandtargetSockettimeout
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.sockettimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.sockettimeout")
  public @Nullable ConfigNodePropertyInteger getCqAnalyticsTestandtargetSockettimeout() {
    return cqAnalyticsTestandtargetSockettimeout;
  }

  @JsonProperty("cq.analytics.testandtarget.sockettimeout")
  public void setCqAnalyticsTestandtargetSockettimeout(@Nullable ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplace(@Nullable ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetRecommendationsUrlReplace
   * @return cqAnalyticsTestandtargetRecommendationsUrlReplace
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.recommendations.url.replace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
  public @Nullable ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplace() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }

  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
  public void setCqAnalyticsTestandtargetRecommendationsUrlReplace(@Nullable ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplacewith(@Nullable ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetRecommendationsUrlReplacewith
   * @return cqAnalyticsTestandtargetRecommendationsUrlReplacewith
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.recommendations.url.replacewith", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
  public @Nullable ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplacewith() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
  }

  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
  public void setCqAnalyticsTestandtargetRecommendationsUrlReplacewith(@Nullable ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties = (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties) o;
    return Objects.equals(this.cqAnalyticsTestandtargetApiUrl, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetApiUrl) &&
        Objects.equals(this.cqAnalyticsTestandtargetTimeout, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetTimeout) &&
        Objects.equals(this.cqAnalyticsTestandtargetSockettimeout, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetSockettimeout) &&
        Objects.equals(this.cqAnalyticsTestandtargetRecommendationsUrlReplace, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetRecommendationsUrlReplace) &&
        Objects.equals(this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetRecommendationsUrlReplacewith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetApiUrl, cqAnalyticsTestandtargetTimeout, cqAnalyticsTestandtargetSockettimeout, cqAnalyticsTestandtargetRecommendationsUrlReplace, cqAnalyticsTestandtargetRecommendationsUrlReplacewith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {\n");
    sb.append("    cqAnalyticsTestandtargetApiUrl: ").append(toIndentedString(cqAnalyticsTestandtargetApiUrl)).append("\n");
    sb.append("    cqAnalyticsTestandtargetTimeout: ").append(toIndentedString(cqAnalyticsTestandtargetTimeout)).append("\n");
    sb.append("    cqAnalyticsTestandtargetSockettimeout: ").append(toIndentedString(cqAnalyticsTestandtargetSockettimeout)).append("\n");
    sb.append("    cqAnalyticsTestandtargetRecommendationsUrlReplace: ").append(toIndentedString(cqAnalyticsTestandtargetRecommendationsUrlReplace)).append("\n");
    sb.append("    cqAnalyticsTestandtargetRecommendationsUrlReplacewith: ").append(toIndentedString(cqAnalyticsTestandtargetRecommendationsUrlReplacewith)).append("\n");
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

