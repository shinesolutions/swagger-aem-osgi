package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqReportingImplCacheCacheImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean repcacheEnable;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger repcacheTtl;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger repcacheMax;
 /**
   * Get repcacheEnable
   * @return repcacheEnable
  **/
  @JsonProperty("repcache.enable")
  public ConfigNodePropertyBoolean getRepcacheEnable() {
    return repcacheEnable;
  }

  public void setRepcacheEnable(ConfigNodePropertyBoolean repcacheEnable) {
    this.repcacheEnable = repcacheEnable;
  }

  public ComDayCqReportingImplCacheCacheImplProperties repcacheEnable(ConfigNodePropertyBoolean repcacheEnable) {
    this.repcacheEnable = repcacheEnable;
    return this;
  }

 /**
   * Get repcacheTtl
   * @return repcacheTtl
  **/
  @JsonProperty("repcache.ttl")
  public ConfigNodePropertyInteger getRepcacheTtl() {
    return repcacheTtl;
  }

  public void setRepcacheTtl(ConfigNodePropertyInteger repcacheTtl) {
    this.repcacheTtl = repcacheTtl;
  }

  public ComDayCqReportingImplCacheCacheImplProperties repcacheTtl(ConfigNodePropertyInteger repcacheTtl) {
    this.repcacheTtl = repcacheTtl;
    return this;
  }

 /**
   * Get repcacheMax
   * @return repcacheMax
  **/
  @JsonProperty("repcache.max")
  public ConfigNodePropertyInteger getRepcacheMax() {
    return repcacheMax;
  }

  public void setRepcacheMax(ConfigNodePropertyInteger repcacheMax) {
    this.repcacheMax = repcacheMax;
  }

  public ComDayCqReportingImplCacheCacheImplProperties repcacheMax(ConfigNodePropertyInteger repcacheMax) {
    this.repcacheMax = repcacheMax;
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
    ComDayCqReportingImplCacheCacheImplProperties comDayCqReportingImplCacheCacheImplProperties = (ComDayCqReportingImplCacheCacheImplProperties) o;
    return Objects.equals(this.repcacheEnable, comDayCqReportingImplCacheCacheImplProperties.repcacheEnable) &&
        Objects.equals(this.repcacheTtl, comDayCqReportingImplCacheCacheImplProperties.repcacheTtl) &&
        Objects.equals(this.repcacheMax, comDayCqReportingImplCacheCacheImplProperties.repcacheMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repcacheEnable, repcacheTtl, repcacheMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReportingImplCacheCacheImplProperties {\n");
    
    sb.append("    repcacheEnable: ").append(toIndentedString(repcacheEnable)).append("\n");
    sb.append("    repcacheTtl: ").append(toIndentedString(repcacheTtl)).append("\n");
    sb.append("    repcacheMax: ").append(toIndentedString(repcacheMax)).append("\n");
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

