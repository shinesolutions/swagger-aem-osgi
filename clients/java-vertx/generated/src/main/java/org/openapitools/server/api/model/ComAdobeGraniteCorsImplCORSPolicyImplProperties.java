package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteCorsImplCORSPolicyImplProperties   {
  
  private ConfigNodePropertyArray alloworigin = null;
  private ConfigNodePropertyArray alloworiginregexp = null;
  private ConfigNodePropertyArray allowedpaths = null;
  private ConfigNodePropertyArray exposedheaders = null;
  private ConfigNodePropertyInteger maxage = null;
  private ConfigNodePropertyArray supportedheaders = null;
  private ConfigNodePropertyArray supportedmethods = null;
  private ConfigNodePropertyBoolean supportscredentials = null;

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties () {

  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties (ConfigNodePropertyArray alloworigin, ConfigNodePropertyArray alloworiginregexp, ConfigNodePropertyArray allowedpaths, ConfigNodePropertyArray exposedheaders, ConfigNodePropertyInteger maxage, ConfigNodePropertyArray supportedheaders, ConfigNodePropertyArray supportedmethods, ConfigNodePropertyBoolean supportscredentials) {
    this.alloworigin = alloworigin;
    this.alloworiginregexp = alloworiginregexp;
    this.allowedpaths = allowedpaths;
    this.exposedheaders = exposedheaders;
    this.maxage = maxage;
    this.supportedheaders = supportedheaders;
    this.supportedmethods = supportedmethods;
    this.supportscredentials = supportscredentials;
  }

    
  @JsonProperty("alloworigin")
  public ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }
  public void setAlloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
  }

    
  @JsonProperty("alloworiginregexp")
  public ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }
  public void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
  }

    
  @JsonProperty("allowedpaths")
  public ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }
  public void setAllowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
  }

    
  @JsonProperty("exposedheaders")
  public ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }
  public void setExposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
  }

    
  @JsonProperty("maxage")
  public ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }
  public void setMaxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
  }

    
  @JsonProperty("supportedheaders")
  public ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }
  public void setSupportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
  }

    
  @JsonProperty("supportedmethods")
  public ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }
  public void setSupportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
  }

    
  @JsonProperty("supportscredentials")
  public ConfigNodePropertyBoolean getSupportscredentials() {
    return supportscredentials;
  }
  public void setSupportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCorsImplCORSPolicyImplProperties comAdobeGraniteCorsImplCORSPolicyImplProperties = (ComAdobeGraniteCorsImplCORSPolicyImplProperties) o;
    return Objects.equals(alloworigin, comAdobeGraniteCorsImplCORSPolicyImplProperties.alloworigin) &&
        Objects.equals(alloworiginregexp, comAdobeGraniteCorsImplCORSPolicyImplProperties.alloworiginregexp) &&
        Objects.equals(allowedpaths, comAdobeGraniteCorsImplCORSPolicyImplProperties.allowedpaths) &&
        Objects.equals(exposedheaders, comAdobeGraniteCorsImplCORSPolicyImplProperties.exposedheaders) &&
        Objects.equals(maxage, comAdobeGraniteCorsImplCORSPolicyImplProperties.maxage) &&
        Objects.equals(supportedheaders, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportedheaders) &&
        Objects.equals(supportedmethods, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportedmethods) &&
        Objects.equals(supportscredentials, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportscredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloworigin, alloworiginregexp, allowedpaths, exposedheaders, maxage, supportedheaders, supportedmethods, supportscredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCorsImplCORSPolicyImplProperties {\n");
    
    sb.append("    alloworigin: ").append(toIndentedString(alloworigin)).append("\n");
    sb.append("    alloworiginregexp: ").append(toIndentedString(alloworiginregexp)).append("\n");
    sb.append("    allowedpaths: ").append(toIndentedString(allowedpaths)).append("\n");
    sb.append("    exposedheaders: ").append(toIndentedString(exposedheaders)).append("\n");
    sb.append("    maxage: ").append(toIndentedString(maxage)).append("\n");
    sb.append("    supportedheaders: ").append(toIndentedString(supportedheaders)).append("\n");
    sb.append("    supportedmethods: ").append(toIndentedString(supportedmethods)).append("\n");
    sb.append("    supportscredentials: ").append(toIndentedString(supportscredentials)).append("\n");
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
