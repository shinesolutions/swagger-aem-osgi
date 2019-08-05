package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties   {
  @JsonProperty("cq.analytics.testandtarget.api.url")
  private ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl = null;

  @JsonProperty("cq.analytics.testandtarget.timeout")
  private ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout = null;

  @JsonProperty("cq.analytics.testandtarget.sockettimeout")
  private ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout = null;

  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace = null;

  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith = null;

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetApiUrl
   * @return cqAnalyticsTestandtargetApiUrl
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCqAnalyticsTestandtargetApiUrl() {
    return cqAnalyticsTestandtargetApiUrl;
  }

  public void setCqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetTimeout
   * @return cqAnalyticsTestandtargetTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqAnalyticsTestandtargetTimeout() {
    return cqAnalyticsTestandtargetTimeout;
  }

  public void setCqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout) {
    this.cqAnalyticsTestandtargetTimeout = cqAnalyticsTestandtargetTimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetSockettimeout
   * @return cqAnalyticsTestandtargetSockettimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqAnalyticsTestandtargetSockettimeout() {
    return cqAnalyticsTestandtargetSockettimeout;
  }

  public void setCqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout) {
    this.cqAnalyticsTestandtargetSockettimeout = cqAnalyticsTestandtargetSockettimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetRecommendationsUrlReplace
   * @return cqAnalyticsTestandtargetRecommendationsUrlReplace
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplace() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }

  public void setCqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplace = cqAnalyticsTestandtargetRecommendationsUrlReplace;
  }

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetRecommendationsUrlReplacewith
   * @return cqAnalyticsTestandtargetRecommendationsUrlReplacewith
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCqAnalyticsTestandtargetRecommendationsUrlReplacewith() {
    return cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
  }

  public void setCqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith) {
    this.cqAnalyticsTestandtargetRecommendationsUrlReplacewith = cqAnalyticsTestandtargetRecommendationsUrlReplacewith;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

