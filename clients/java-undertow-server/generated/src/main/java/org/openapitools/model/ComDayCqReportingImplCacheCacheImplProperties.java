package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqReportingImplCacheCacheImplProperties   {
  
  private ConfigNodePropertyBoolean repcacheEnable = null;
  private ConfigNodePropertyInteger repcacheTtl = null;
  private ConfigNodePropertyInteger repcacheMax = null;

  /**
   **/
  public ComDayCqReportingImplCacheCacheImplProperties repcacheEnable(ConfigNodePropertyBoolean repcacheEnable) {
    this.repcacheEnable = repcacheEnable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repcache.enable")
  public ConfigNodePropertyBoolean getRepcacheEnable() {
    return repcacheEnable;
  }
  public void setRepcacheEnable(ConfigNodePropertyBoolean repcacheEnable) {
    this.repcacheEnable = repcacheEnable;
  }

  /**
   **/
  public ComDayCqReportingImplCacheCacheImplProperties repcacheTtl(ConfigNodePropertyInteger repcacheTtl) {
    this.repcacheTtl = repcacheTtl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repcache.ttl")
  public ConfigNodePropertyInteger getRepcacheTtl() {
    return repcacheTtl;
  }
  public void setRepcacheTtl(ConfigNodePropertyInteger repcacheTtl) {
    this.repcacheTtl = repcacheTtl;
  }

  /**
   **/
  public ComDayCqReportingImplCacheCacheImplProperties repcacheMax(ConfigNodePropertyInteger repcacheMax) {
    this.repcacheMax = repcacheMax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repcache.max")
  public ConfigNodePropertyInteger getRepcacheMax() {
    return repcacheMax;
  }
  public void setRepcacheMax(ConfigNodePropertyInteger repcacheMax) {
    this.repcacheMax = repcacheMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReportingImplCacheCacheImplProperties comDayCqReportingImplCacheCacheImplProperties = (ComDayCqReportingImplCacheCacheImplProperties) o;
    return Objects.equals(repcacheEnable, comDayCqReportingImplCacheCacheImplProperties.repcacheEnable) &&
        Objects.equals(repcacheTtl, comDayCqReportingImplCacheCacheImplProperties.repcacheTtl) &&
        Objects.equals(repcacheMax, comDayCqReportingImplCacheCacheImplProperties.repcacheMax);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

