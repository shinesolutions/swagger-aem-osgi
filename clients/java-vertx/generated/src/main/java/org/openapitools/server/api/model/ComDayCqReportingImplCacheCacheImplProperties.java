package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqReportingImplCacheCacheImplProperties   {
  
  private ConfigNodePropertyBoolean repcacheEnable = null;
  private ConfigNodePropertyInteger repcacheTtl = null;
  private ConfigNodePropertyInteger repcacheMax = null;

  public ComDayCqReportingImplCacheCacheImplProperties () {

  }

  public ComDayCqReportingImplCacheCacheImplProperties (ConfigNodePropertyBoolean repcacheEnable, ConfigNodePropertyInteger repcacheTtl, ConfigNodePropertyInteger repcacheMax) {
    this.repcacheEnable = repcacheEnable;
    this.repcacheTtl = repcacheTtl;
    this.repcacheMax = repcacheMax;
  }

    
  @JsonProperty("repcache.enable")
  public ConfigNodePropertyBoolean getRepcacheEnable() {
    return repcacheEnable;
  }
  public void setRepcacheEnable(ConfigNodePropertyBoolean repcacheEnable) {
    this.repcacheEnable = repcacheEnable;
  }

    
  @JsonProperty("repcache.ttl")
  public ConfigNodePropertyInteger getRepcacheTtl() {
    return repcacheTtl;
  }
  public void setRepcacheTtl(ConfigNodePropertyInteger repcacheTtl) {
    this.repcacheTtl = repcacheTtl;
  }

    
  @JsonProperty("repcache.max")
  public ConfigNodePropertyInteger getRepcacheMax() {
    return repcacheMax;
  }
  public void setRepcacheMax(ConfigNodePropertyInteger repcacheMax) {
    this.repcacheMax = repcacheMax;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
