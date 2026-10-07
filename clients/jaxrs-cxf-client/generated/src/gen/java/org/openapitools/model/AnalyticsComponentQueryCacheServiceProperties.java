package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AnalyticsComponentQueryCacheServiceProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize;
 /**
   * Get cqAnalyticsComponentQueryCacheSize
   * @return cqAnalyticsComponentQueryCacheSize
  **/
  @JsonProperty("cq.analytics.component.query.cache.size")
  public ConfigNodePropertyInteger getCqAnalyticsComponentQueryCacheSize() {
    return cqAnalyticsComponentQueryCacheSize;
  }

  public void setCqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
    this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
  }

  public AnalyticsComponentQueryCacheServiceProperties cqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
    this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

