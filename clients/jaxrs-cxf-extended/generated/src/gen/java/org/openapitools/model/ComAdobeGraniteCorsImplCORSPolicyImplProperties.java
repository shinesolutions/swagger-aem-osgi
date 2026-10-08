package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteCorsImplCORSPolicyImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray alloworigin;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray alloworiginregexp;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray allowedpaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray exposedheaders;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxage;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray supportedheaders;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray supportedmethods;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean supportscredentials;
 /**
  * Get alloworigin
  * @return alloworigin
  */
  @JsonProperty("alloworigin")
  public ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }

  /**
   * Sets the <code>alloworigin</code> property.
   */
 public void setAlloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
  }

  /**
   * Sets the <code>alloworigin</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
    return this;
  }

 /**
  * Get alloworiginregexp
  * @return alloworiginregexp
  */
  @JsonProperty("alloworiginregexp")
  public ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }

  /**
   * Sets the <code>alloworiginregexp</code> property.
   */
 public void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
  }

  /**
   * Sets the <code>alloworiginregexp</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
    return this;
  }

 /**
  * Get allowedpaths
  * @return allowedpaths
  */
  @JsonProperty("allowedpaths")
  public ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }

  /**
   * Sets the <code>allowedpaths</code> property.
   */
 public void setAllowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
  }

  /**
   * Sets the <code>allowedpaths</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties allowedpaths(ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
    return this;
  }

 /**
  * Get exposedheaders
  * @return exposedheaders
  */
  @JsonProperty("exposedheaders")
  public ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }

  /**
   * Sets the <code>exposedheaders</code> property.
   */
 public void setExposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
  }

  /**
   * Sets the <code>exposedheaders</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties exposedheaders(ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
    return this;
  }

 /**
  * Get maxage
  * @return maxage
  */
  @JsonProperty("maxage")
  public ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }

  /**
   * Sets the <code>maxage</code> property.
   */
 public void setMaxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
  }

  /**
   * Sets the <code>maxage</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties maxage(ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
    return this;
  }

 /**
  * Get supportedheaders
  * @return supportedheaders
  */
  @JsonProperty("supportedheaders")
  public ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }

  /**
   * Sets the <code>supportedheaders</code> property.
   */
 public void setSupportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
  }

  /**
   * Sets the <code>supportedheaders</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedheaders(ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
    return this;
  }

 /**
  * Get supportedmethods
  * @return supportedmethods
  */
  @JsonProperty("supportedmethods")
  public ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }

  /**
   * Sets the <code>supportedmethods</code> property.
   */
 public void setSupportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
  }

  /**
   * Sets the <code>supportedmethods</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedmethods(ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
    return this;
  }

 /**
  * Get supportscredentials
  * @return supportscredentials
  */
  @JsonProperty("supportscredentials")
  public ConfigNodePropertyBoolean getSupportscredentials() {
    return supportscredentials;
  }

  /**
   * Sets the <code>supportscredentials</code> property.
   */
 public void setSupportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
  }

  /**
   * Sets the <code>supportscredentials</code> property.
   */
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportscredentials(ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

