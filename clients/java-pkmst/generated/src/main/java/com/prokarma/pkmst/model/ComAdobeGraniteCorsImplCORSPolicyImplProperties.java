package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteCorsImplCORSPolicyImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteCorsImplCORSPolicyImplProperties   {
  @JsonProperty("alloworigin")
  private ConfigNodePropertyArray alloworigin = null;

  @JsonProperty("alloworiginregexp")
  private ConfigNodePropertyArray alloworiginregexp = null;

  @JsonProperty("allowedpaths")
  private ConfigNodePropertyArray allowedpaths = null;

  @JsonProperty("exposedheaders")
  private ConfigNodePropertyArray exposedheaders = null;

  @JsonProperty("maxage")
  private ConfigNodePropertyInteger maxage = null;

  @JsonProperty("supportedheaders")
  private ConfigNodePropertyArray supportedheaders = null;

  @JsonProperty("supportedmethods")
  private ConfigNodePropertyArray supportedmethods = null;

  @JsonProperty("supportscredentials")
  private ConfigNodePropertyBoolean supportscredentials = null;

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
    return this;
  }

   /**
   * Get alloworigin
   * @return alloworigin
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }

  public void setAlloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
    return this;
  }

   /**
   * Get alloworiginregexp
   * @return alloworiginregexp
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }

  public void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties allowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
    return this;
  }

   /**
   * Get allowedpaths
   * @return allowedpaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }

  public void setAllowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties exposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
    return this;
  }

   /**
   * Get exposedheaders
   * @return exposedheaders
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }

  public void setExposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties maxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
    return this;
  }

   /**
   * Get maxage
   * @return maxage
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }

  public void setMaxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
    return this;
  }

   /**
   * Get supportedheaders
   * @return supportedheaders
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }

  public void setSupportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
    return this;
  }

   /**
   * Get supportedmethods
   * @return supportedmethods
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }

  public void setSupportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
    return this;
  }

   /**
   * Get supportscredentials
   * @return supportscredentials
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

