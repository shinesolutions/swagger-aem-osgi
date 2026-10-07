/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties   {
  
  private ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl;
  private ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout;
  private ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout;
  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace;
  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith;

  /**
   */
  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.api.url")
  public ConfigNodePropertyString getCqAnalyticsTestandtargetApiUrl() {
    return cqAnalyticsTestandtargetApiUrl;
  }
  public void setCqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
  }

  /**
   */
  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.timeout")
  public ConfigNodePropertyInteger getCqAnalyticsTestandtargetTimeout() {
    return cqAnalyticsTestandtargetTimeout;
  }
  public void setCqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
  }

  /**
   */
  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.sockettimeout")
  public ConfigNodePropertyInteger getCqAnalyticsTestandtargetSockettimeout() {
    return cqAnalyticsTestandtargetSockettimeout;
  }
  public void setCqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
  }

  /**
   */
  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
  public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplace() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }
  public void setCqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }

  /**
   */
  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
  public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplacewith() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
  }
  public void setCqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
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
    return Objects.equals(cqAnalyticsTestandtargetApiUrl, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetApiUrl) &&
        Objects.equals(cqAnalyticsTestandtargetTimeout, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetTimeout) &&
        Objects.equals(cqAnalyticsTestandtargetSockettimeout, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetSockettimeout) &&
        Objects.equals(cqAnalyticsTestandtargetRecommendationsUrlReplace, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetRecommendationsUrlReplace) &&
        Objects.equals(cqAnalyticsTestandtargetRecommendationsUrlReplacewith, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.cqAnalyticsTestandtargetRecommendationsUrlReplacewith);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

