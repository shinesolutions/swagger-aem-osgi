package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
 /**
   * Get cqAnalyticsTestandtargetApiUrl
   * @return cqAnalyticsTestandtargetApiUrl
  **/
  @JsonProperty("cq.analytics.testandtarget.api.url")
  public ConfigNodePropertyString getCqAnalyticsTestandtargetApiUrl() {
    return cqAnalyticsTestandtargetApiUrl;
  }

  public void setCqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
    return this;
  }

 /**
   * Get cqAnalyticsTestandtargetTimeout
   * @return cqAnalyticsTestandtargetTimeout
  **/
  @JsonProperty("cq.analytics.testandtarget.timeout")
  public ConfigNodePropertyInteger getCqAnalyticsTestandtargetTimeout() {
    return cqAnalyticsTestandtargetTimeout;
  }

  public void setCqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
    return this;
  }

 /**
   * Get cqAnalyticsTestandtargetSockettimeout
   * @return cqAnalyticsTestandtargetSockettimeout
  **/
  @JsonProperty("cq.analytics.testandtarget.sockettimeout")
  public ConfigNodePropertyInteger getCqAnalyticsTestandtargetSockettimeout() {
    return cqAnalyticsTestandtargetSockettimeout;
  }

  public void setCqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
    return this;
  }

 /**
   * Get cqAnalyticsTestandtargetRecommendationsUrlReplace
   * @return cqAnalyticsTestandtargetRecommendationsUrlReplace
  **/
  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
  public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplace() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }

  public void setCqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
    return this;
  }

 /**
   * Get cqAnalyticsTestandtargetRecommendationsUrlReplacewith
   * @return cqAnalyticsTestandtargetRecommendationsUrlReplacewith
  **/
  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
  public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplacewith() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
  }

  public void setCqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

