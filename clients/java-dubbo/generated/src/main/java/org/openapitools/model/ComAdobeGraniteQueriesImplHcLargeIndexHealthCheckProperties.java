package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("large.index.critical.threshold")
  private ConfigNodePropertyInteger largeIndexCriticalThreshold;

  @JsonProperty("large.index.warn.threshold")
  private ConfigNodePropertyInteger largeIndexWarnThreshold;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags;

  /**
   * 
   * @return largeIndexCriticalThreshold
   */
  public ConfigNodePropertyInteger getLargeIndexCriticalThreshold() {
    return largeIndexCriticalThreshold;
  }

  public void setLargeIndexCriticalThreshold(ConfigNodePropertyInteger largeIndexCriticalThreshold) {
    this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
  }

  /**
   * 
   * @return largeIndexWarnThreshold
   */
  public ConfigNodePropertyInteger getLargeIndexWarnThreshold() {
    return largeIndexWarnThreshold;
  }

  public void setLargeIndexWarnThreshold(ConfigNodePropertyInteger largeIndexWarnThreshold) {
    this.largeIndexWarnThreshold = largeIndexWarnThreshold;
  }

  /**
   * 
   * @return hcTags
   */
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
    return Objects.equals(this.largeIndexCriticalThreshold, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.largeIndexCriticalThreshold) &&
        Objects.equals(this.largeIndexWarnThreshold, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.largeIndexWarnThreshold) &&
        Objects.equals(this.hcTags, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.hcTags);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
