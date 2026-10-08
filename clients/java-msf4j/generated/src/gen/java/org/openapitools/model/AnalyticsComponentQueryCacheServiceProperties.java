package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * AnalyticsComponentQueryCacheServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AnalyticsComponentQueryCacheServiceProperties   {
  @JsonProperty("cq.analytics.component.query.cache.size")
  private ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize;

  public AnalyticsComponentQueryCacheServiceProperties cqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
    this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
    return this;
  }

   /**
   * Get cqAnalyticsComponentQueryCacheSize
   * @return cqAnalyticsComponentQueryCacheSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqAnalyticsComponentQueryCacheSize() {
    return cqAnalyticsComponentQueryCacheSize;
  }

  public void setCqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

