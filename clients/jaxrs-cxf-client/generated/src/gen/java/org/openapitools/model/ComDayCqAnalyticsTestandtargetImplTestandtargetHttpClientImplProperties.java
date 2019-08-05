package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

