package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteCsrfImplCSRFFilterProperties   {
  
  private ConfigNodePropertyArray filterMethods = null;
  private ConfigNodePropertyBoolean filterEnableSafeUserAgents = null;
  private ConfigNodePropertyArray filterSafeUserAgents = null;
  private ConfigNodePropertyArray filterExcludedPaths = null;

  public ComAdobeGraniteCsrfImplCSRFFilterProperties () {

  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties (ConfigNodePropertyArray filterMethods, ConfigNodePropertyBoolean filterEnableSafeUserAgents, ConfigNodePropertyArray filterSafeUserAgents, ConfigNodePropertyArray filterExcludedPaths) {
    this.filterMethods = filterMethods;
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
    this.filterSafeUserAgents = filterSafeUserAgents;
    this.filterExcludedPaths = filterExcludedPaths;
  }

    
  @JsonProperty("filter.methods")
  public ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }
  public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

    
  @JsonProperty("filter.enable.safe.user.agents")
  public ConfigNodePropertyBoolean getFilterEnableSafeUserAgents() {
    return filterEnableSafeUserAgents;
  }
  public void setFilterEnableSafeUserAgents(ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
  }

    
  @JsonProperty("filter.safe.user.agents")
  public ConfigNodePropertyArray getFilterSafeUserAgents() {
    return filterSafeUserAgents;
  }
  public void setFilterSafeUserAgents(ConfigNodePropertyArray filterSafeUserAgents) {
    this.filterSafeUserAgents = filterSafeUserAgents;
  }

    
  @JsonProperty("filter.excluded.paths")
  public ConfigNodePropertyArray getFilterExcludedPaths() {
    return filterExcludedPaths;
  }
  public void setFilterExcludedPaths(ConfigNodePropertyArray filterExcludedPaths) {
    this.filterExcludedPaths = filterExcludedPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCsrfImplCSRFFilterProperties comAdobeGraniteCsrfImplCSRFFilterProperties = (ComAdobeGraniteCsrfImplCSRFFilterProperties) o;
    return Objects.equals(filterMethods, comAdobeGraniteCsrfImplCSRFFilterProperties.filterMethods) &&
        Objects.equals(filterEnableSafeUserAgents, comAdobeGraniteCsrfImplCSRFFilterProperties.filterEnableSafeUserAgents) &&
        Objects.equals(filterSafeUserAgents, comAdobeGraniteCsrfImplCSRFFilterProperties.filterSafeUserAgents) &&
        Objects.equals(filterExcludedPaths, comAdobeGraniteCsrfImplCSRFFilterProperties.filterExcludedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterMethods, filterEnableSafeUserAgents, filterSafeUserAgents, filterExcludedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCsrfImplCSRFFilterProperties {\n");
    
    sb.append("    filterMethods: ").append(toIndentedString(filterMethods)).append("\n");
    sb.append("    filterEnableSafeUserAgents: ").append(toIndentedString(filterEnableSafeUserAgents)).append("\n");
    sb.append("    filterSafeUserAgents: ").append(toIndentedString(filterSafeUserAgents)).append("\n");
    sb.append("    filterExcludedPaths: ").append(toIndentedString(filterExcludedPaths)).append("\n");
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
