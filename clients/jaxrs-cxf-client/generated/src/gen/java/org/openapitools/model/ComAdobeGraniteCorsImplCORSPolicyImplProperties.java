package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteCorsImplCORSPolicyImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray alloworigin = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray alloworiginregexp = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray allowedpaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray exposedheaders = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray supportedheaders = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray supportedmethods = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean supportscredentials = null;
 /**
   * Get alloworigin
   * @return alloworigin
  **/
  @JsonProperty("alloworigin")
  public ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }

  public void setAlloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
    return this;
  }

 /**
   * Get alloworiginregexp
   * @return alloworiginregexp
  **/
  @JsonProperty("alloworiginregexp")
  public ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }

  public void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
    return this;
  }

 /**
   * Get allowedpaths
   * @return allowedpaths
  **/
  @JsonProperty("allowedpaths")
  public ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }

  public void setAllowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties allowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
    return this;
  }

 /**
   * Get exposedheaders
   * @return exposedheaders
  **/
  @JsonProperty("exposedheaders")
  public ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }

  public void setExposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties exposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
    return this;
  }

 /**
   * Get maxage
   * @return maxage
  **/
  @JsonProperty("maxage")
  public ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }

  public void setMaxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties maxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
    return this;
  }

 /**
   * Get supportedheaders
   * @return supportedheaders
  **/
  @JsonProperty("supportedheaders")
  public ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }

  public void setSupportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
    return this;
  }

 /**
   * Get supportedmethods
   * @return supportedmethods
  **/
  @JsonProperty("supportedmethods")
  public ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }

  public void setSupportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
    return this;
  }

 /**
   * Get supportscredentials
   * @return supportscredentials
  **/
  @JsonProperty("supportscredentials")
  public ConfigNodePropertyBoolean getSupportscredentials() {
    return supportscredentials;
  }

  public void setSupportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

