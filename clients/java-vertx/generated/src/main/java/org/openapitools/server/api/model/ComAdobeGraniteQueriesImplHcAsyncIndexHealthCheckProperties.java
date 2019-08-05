package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties   {
  
  private ConfigNodePropertyInteger indexingCriticalThreshold = null;
  private ConfigNodePropertyInteger indexingWarnThreshold = null;
  private ConfigNodePropertyArray hcTags = null;

  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties () {

  }

  public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties (ConfigNodePropertyInteger indexingCriticalThreshold, ConfigNodePropertyInteger indexingWarnThreshold, ConfigNodePropertyArray hcTags) {
    this.indexingCriticalThreshold = indexingCriticalThreshold;
    this.indexingWarnThreshold = indexingWarnThreshold;
    this.hcTags = hcTags;
  }

    
  @JsonProperty("indexing.critical.threshold")
  public ConfigNodePropertyInteger getIndexingCriticalThreshold() {
    return indexingCriticalThreshold;
  }
  public void setIndexingCriticalThreshold(ConfigNodePropertyInteger indexingCriticalThreshold) {
    this.indexingCriticalThreshold = indexingCriticalThreshold;
  }

    
  @JsonProperty("indexing.warn.threshold")
  public ConfigNodePropertyInteger getIndexingWarnThreshold() {
    return indexingWarnThreshold;
  }
  public void setIndexingWarnThreshold(ConfigNodePropertyInteger indexingWarnThreshold) {
    this.indexingWarnThreshold = indexingWarnThreshold;
  }

    
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
