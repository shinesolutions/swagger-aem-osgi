package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties   {
  
  private @Valid ConfigNodePropertyInteger largeIndexCriticalThreshold = null;
  private @Valid ConfigNodePropertyInteger largeIndexWarnThreshold = null;
  private @Valid ConfigNodePropertyArray hcTags = null;

  /**
   **/
  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties largeIndexCriticalThreshold(ConfigNodePropertyInteger largeIndexCriticalThreshold) {
    this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("large.index.critical.threshold")
  public ConfigNodePropertyInteger getLargeIndexCriticalThreshold() {
    return largeIndexCriticalThreshold;
  }
  public void setLargeIndexCriticalThreshold(ConfigNodePropertyInteger largeIndexCriticalThreshold) {
    this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
  }

  /**
   **/
  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties largeIndexWarnThreshold(ConfigNodePropertyInteger largeIndexWarnThreshold) {
    this.largeIndexWarnThreshold = largeIndexWarnThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("large.index.warn.threshold")
  public ConfigNodePropertyInteger getLargeIndexWarnThreshold() {
    return largeIndexWarnThreshold;
  }
  public void setLargeIndexWarnThreshold(ConfigNodePropertyInteger largeIndexWarnThreshold) {
    this.largeIndexWarnThreshold = largeIndexWarnThreshold;
  }

  /**
   **/
  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties = (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties) o;
    return Objects.equals(largeIndexCriticalThreshold, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.largeIndexCriticalThreshold) &&
        Objects.equals(largeIndexWarnThreshold, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.largeIndexWarnThreshold) &&
        Objects.equals(hcTags, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.hcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeIndexCriticalThreshold, largeIndexWarnThreshold, hcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {\n");
    
    sb.append("    largeIndexCriticalThreshold: ").append(toIndentedString(largeIndexCriticalThreshold)).append("\n");
    sb.append("    largeIndexWarnThreshold: ").append(toIndentedString(largeIndexWarnThreshold)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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

