package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties   {
  

  private ConfigNodePropertyInteger largeIndexCriticalThreshold = null;

  private ConfigNodePropertyInteger largeIndexWarnThreshold = null;

  private ConfigNodePropertyArray hcTags = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

