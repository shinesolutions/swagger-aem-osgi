package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteCorsImplCORSPolicyImplProperties   {
  
  private ConfigNodePropertyArray alloworigin = null;

  private ConfigNodePropertyArray alloworiginregexp = null;

  private ConfigNodePropertyArray allowedpaths = null;

  private ConfigNodePropertyArray exposedheaders = null;

  private ConfigNodePropertyInteger maxage = null;

  private ConfigNodePropertyArray supportedheaders = null;

  private ConfigNodePropertyArray supportedmethods = null;

  private ConfigNodePropertyBoolean supportscredentials = null;


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alloworigin")
  public ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }
  public void setAlloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
  }


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alloworiginregexp")
  public ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }
  public void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
  }


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties allowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedpaths")
  public ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }
  public void setAllowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
  }


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties exposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exposedheaders")
  public ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }
  public void setExposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
  }


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties maxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxage")
  public ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }
  public void setMaxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
  }


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("supportedheaders")
  public ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }
  public void setSupportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
  }


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("supportedmethods")
  public ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }
  public void setSupportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
  }


  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("supportscredentials")
  public ConfigNodePropertyBoolean getSupportscredentials() {
    return supportscredentials;
  }
  public void setSupportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

