package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties   {
  
  private ConfigNodePropertyInteger largeIndexCriticalThreshold = null;
  private ConfigNodePropertyInteger largeIndexWarnThreshold = null;
  private ConfigNodePropertyArray hcTags = null;

  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties () {

  }

  public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties (ConfigNodePropertyInteger largeIndexCriticalThreshold, ConfigNodePropertyInteger largeIndexWarnThreshold, ConfigNodePropertyArray hcTags) {
    this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
    this.largeIndexWarnThreshold = largeIndexWarnThreshold;
    this.hcTags = hcTags;
  }

    
  @JsonProperty("large.index.critical.threshold")
  public ConfigNodePropertyInteger getLargeIndexCriticalThreshold() {
    return largeIndexCriticalThreshold;
  }
  public void setLargeIndexCriticalThreshold(ConfigNodePropertyInteger largeIndexCriticalThreshold) {
    this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
  }

    
  @JsonProperty("large.index.warn.threshold")
  public ConfigNodePropertyInteger getLargeIndexWarnThreshold() {
    return largeIndexWarnThreshold;
  }
  public void setLargeIndexWarnThreshold(ConfigNodePropertyInteger largeIndexWarnThreshold) {
    this.largeIndexWarnThreshold = largeIndexWarnThreshold;
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
