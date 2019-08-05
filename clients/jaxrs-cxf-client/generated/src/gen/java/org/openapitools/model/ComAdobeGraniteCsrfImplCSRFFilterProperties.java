package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteCsrfImplCSRFFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray filterMethods = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean filterEnableSafeUserAgents = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray filterSafeUserAgents = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray filterExcludedPaths = null;
 /**
   * Get filterMethods
   * @return filterMethods
  **/
  @JsonProperty("filter.methods")
  public ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }

  public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
    return this;
  }

 /**
   * Get filterEnableSafeUserAgents
   * @return filterEnableSafeUserAgents
  **/
  @JsonProperty("filter.enable.safe.user.agents")
  public ConfigNodePropertyBoolean getFilterEnableSafeUserAgents() {
    return filterEnableSafeUserAgents;
  }

  public void setFilterEnableSafeUserAgents(ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterEnableSafeUserAgents(ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
    return this;
  }

 /**
   * Get filterSafeUserAgents
   * @return filterSafeUserAgents
  **/
  @JsonProperty("filter.safe.user.agents")
  public ConfigNodePropertyArray getFilterSafeUserAgents() {
    return filterSafeUserAgents;
  }

  public void setFilterSafeUserAgents(ConfigNodePropertyArray filterSafeUserAgents) {
    this.filterSafeUserAgents = filterSafeUserAgents;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterSafeUserAgents(ConfigNodePropertyArray filterSafeUserAgents) {
    this.filterSafeUserAgents = filterSafeUserAgents;
    return this;
  }

 /**
   * Get filterExcludedPaths
   * @return filterExcludedPaths
  **/
  @JsonProperty("filter.excluded.paths")
  public ConfigNodePropertyArray getFilterExcludedPaths() {
    return filterExcludedPaths;
  }

  public void setFilterExcludedPaths(ConfigNodePropertyArray filterExcludedPaths) {
    this.filterExcludedPaths = filterExcludedPaths;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterExcludedPaths(ConfigNodePropertyArray filterExcludedPaths) {
    this.filterExcludedPaths = filterExcludedPaths;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

