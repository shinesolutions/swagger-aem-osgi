package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties   {
  @JsonProperty("cq.analytics.testandtarget.api.url")
  @Valid

  private ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl;

  @JsonProperty("cq.analytics.testandtarget.timeout")
  @Valid

  private ConfigNodePropertyInteger cqAnalyticsTestandtargetTimeout;

  @JsonProperty("cq.analytics.testandtarget.sockettimeout")
  @Valid

  private ConfigNodePropertyInteger cqAnalyticsTestandtargetSockettimeout;

  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
  @Valid

  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplace;

  @JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
  @Valid

  private ConfigNodePropertyString cqAnalyticsTestandtargetRecommendationsUrlReplacewith;

  public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties cqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString cqAnalyticsTestandtargetApiUrl) {
    this.cqAnalyticsTestandtargetApiUrl = cqAnalyticsTestandtargetApiUrl;
    return this;
  }

   /**
   * Get cqAnalyticsTestandtargetApiUrl
   * @return cqAnalyticsTestandtargetApiUrl
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

