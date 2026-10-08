package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteCorsImplCORSPolicyImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("alloworigin")
  private ConfigNodePropertyArray alloworigin;

  @JsonProperty("alloworiginregexp")
  private ConfigNodePropertyArray alloworiginregexp;

  @JsonProperty("allowedpaths")
  private ConfigNodePropertyArray allowedpaths;

  @JsonProperty("exposedheaders")
  private ConfigNodePropertyArray exposedheaders;

  @JsonProperty("maxage")
  private ConfigNodePropertyInteger maxage;

  @JsonProperty("supportedheaders")
  private ConfigNodePropertyArray supportedheaders;

  @JsonProperty("supportedmethods")
  private ConfigNodePropertyArray supportedmethods;

  @JsonProperty("supportscredentials")
  private ConfigNodePropertyBoolean supportscredentials;

  /**
   * 
   * @return alloworigin
   */
  public ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }

  public void setAlloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
  }

  /**
   * 
   * @return alloworiginregexp
   */
  public ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }

  public void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
  }

  /**
   * 
   * @return allowedpaths
   */
  public ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }

  public void setAllowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
  }

  /**
   * 
   * @return exposedheaders
   */
  public ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }

  public void setExposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
  }

  /**
   * 
   * @return maxage
   */
  public ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }

  public void setMaxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
  }

  /**
   * 
   * @return supportedheaders
   */
  public ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }

  public void setSupportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
  }

  /**
   * 
   * @return supportedmethods
   */
  public ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }

  public void setSupportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
  }

  /**
   * 
   * @return supportscredentials
   */
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
    return Objects.equals(this.alloworigin, comAdobeGraniteCorsImplCORSPolicyImplProperties.alloworigin) &&
        Objects.equals(this.alloworiginregexp, comAdobeGraniteCorsImplCORSPolicyImplProperties.alloworiginregexp) &&
        Objects.equals(this.allowedpaths, comAdobeGraniteCorsImplCORSPolicyImplProperties.allowedpaths) &&
        Objects.equals(this.exposedheaders, comAdobeGraniteCorsImplCORSPolicyImplProperties.exposedheaders) &&
        Objects.equals(this.maxage, comAdobeGraniteCorsImplCORSPolicyImplProperties.maxage) &&
        Objects.equals(this.supportedheaders, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportedheaders) &&
        Objects.equals(this.supportedmethods, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportedmethods) &&
        Objects.equals(this.supportscredentials, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportscredentials);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
