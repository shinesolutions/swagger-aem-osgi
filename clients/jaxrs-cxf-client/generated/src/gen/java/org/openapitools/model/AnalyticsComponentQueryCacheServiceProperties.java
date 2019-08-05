package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalyticsComponentQueryCacheServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

