package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;

  public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties () {

  }

  public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties (ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
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
    ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties = (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties) o;
    return Objects.equals(hcTags, comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.hcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties {\n");
    
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
