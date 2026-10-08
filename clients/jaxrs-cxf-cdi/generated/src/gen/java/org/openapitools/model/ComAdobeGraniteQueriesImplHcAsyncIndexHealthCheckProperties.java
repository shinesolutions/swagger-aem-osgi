package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties   {
  
  private ConfigNodePropertyInteger indexingCriticalThreshold;

  private ConfigNodePropertyInteger indexingWarnThreshold;

  private ConfigNodePropertyArray hcTags;

  /**
   **/
  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties indexingCriticalThreshold(ConfigNodePropertyInteger indexingCriticalThreshold) {
    this.indexingCriticalThreshold = indexingCriticalThreshold;
    return this;
  }

  
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
  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties indexingWarnThreshold(ConfigNodePropertyInteger indexingWarnThreshold) {
    this.indexingWarnThreshold = indexingWarnThreshold;
    return this;
  }

  
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
  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties = (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties) o;
    return Objects.equals(this.indexingCriticalThreshold, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.indexingCriticalThreshold) &&
        Objects.equals(this.indexingWarnThreshold, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.indexingWarnThreshold) &&
        Objects.equals(this.hcTags, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.hcTags);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

