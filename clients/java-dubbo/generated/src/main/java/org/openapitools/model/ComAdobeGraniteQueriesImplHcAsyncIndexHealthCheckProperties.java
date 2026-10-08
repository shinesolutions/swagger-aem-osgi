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

public class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("indexing.critical.threshold")
  private ConfigNodePropertyInteger indexingCriticalThreshold;

  @JsonProperty("indexing.warn.threshold")
  private ConfigNodePropertyInteger indexingWarnThreshold;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags;

  /**
   * 
   * @return indexingCriticalThreshold
   */
  public ConfigNodePropertyInteger getIndexingCriticalThreshold() {
    return indexingCriticalThreshold;
  }

  public void setIndexingCriticalThreshold(ConfigNodePropertyInteger indexingCriticalThreshold) {
    this.indexingCriticalThreshold = indexingCriticalThreshold;
  }

  /**
   * 
   * @return indexingWarnThreshold
   */
  public ConfigNodePropertyInteger getIndexingWarnThreshold() {
    return indexingWarnThreshold;
  }

  public void setIndexingWarnThreshold(ConfigNodePropertyInteger indexingWarnThreshold) {
    this.indexingWarnThreshold = indexingWarnThreshold;
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
