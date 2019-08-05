package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AnalyticsComponentQueryCacheServiceProperties   {
  
  private @Valid ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize = null;

  /**
   **/
  public AnalyticsComponentQueryCacheServiceProperties cqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
    this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.component.query.cache.size")
  public ConfigNodePropertyInteger getCqAnalyticsComponentQueryCacheSize() {
    return cqAnalyticsComponentQueryCacheSize;
  }
  public void setCqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
    this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsComponentQueryCacheServiceProperties analyticsComponentQueryCacheServiceProperties = (AnalyticsComponentQueryCacheServiceProperties) o;
    return Objects.equals(cqAnalyticsComponentQueryCacheSize, analyticsComponentQueryCacheServiceProperties.cqAnalyticsComponentQueryCacheSize);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

