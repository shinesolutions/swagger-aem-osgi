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
public class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties   {
  

  private ConfigNodePropertyInteger indexingCriticalThreshold = null;

  private ConfigNodePropertyInteger indexingWarnThreshold = null;

  private ConfigNodePropertyArray hcTags = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indexing.critical.threshold")
  public ConfigNodePropertyInteger getIndexingCriticalThreshold() {
    return indexingCriticalThreshold;
  }
  public void setIndexingCriticalThreshold(ConfigNodePropertyInteger indexingCriticalThreshold) {
    this.indexingCriticalThreshold = indexingCriticalThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indexing.warn.threshold")
  public ConfigNodePropertyInteger getIndexingWarnThreshold() {
    return indexingWarnThreshold;
  }
  public void setIndexingWarnThreshold(ConfigNodePropertyInteger indexingWarnThreshold) {
    this.indexingWarnThreshold = indexingWarnThreshold;
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
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties = (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties) o;
    return Objects.equals(indexingCriticalThreshold, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.indexingCriticalThreshold) &&
        Objects.equals(indexingWarnThreshold, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.indexingWarnThreshold) &&
        Objects.equals(hcTags, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.hcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexingCriticalThreshold, indexingWarnThreshold, hcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {\n");
    
    sb.append("    indexingCriticalThreshold: ").append(toIndentedString(indexingCriticalThreshold)).append("\n");
    sb.append("    indexingWarnThreshold: ").append(toIndentedString(indexingWarnThreshold)).append("\n");
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

