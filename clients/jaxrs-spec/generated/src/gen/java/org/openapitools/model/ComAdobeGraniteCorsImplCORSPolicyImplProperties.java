package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteCorsImplCORSPolicyImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCorsImplCORSPolicyImplProperties   {
  private ConfigNodePropertyArray alloworigin;
  private ConfigNodePropertyArray alloworiginregexp;
  private ConfigNodePropertyArray allowedpaths;
  private ConfigNodePropertyArray exposedheaders;
  private ConfigNodePropertyInteger maxage;
  private ConfigNodePropertyArray supportedheaders;
  private ConfigNodePropertyArray supportedmethods;
  private ConfigNodePropertyBoolean supportscredentials;

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties() {
  }

  /**
   **/
  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworigin(ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alloworigin")
  @Valid public ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }

  @JsonProperty("alloworigin")
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
  @Valid public ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }

  @JsonProperty("alloworiginregexp")
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
  @Valid public ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }

  @JsonProperty("allowedpaths")
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
  @Valid public ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }

  @JsonProperty("exposedheaders")
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
  @Valid public ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }

  @JsonProperty("maxage")
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
  @Valid public ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }

  @JsonProperty("supportedheaders")
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
  @Valid public ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }

  @JsonProperty("supportedmethods")
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
  @Valid public ConfigNodePropertyBoolean getSupportscredentials() {
    return supportscredentials;
  }

  @JsonProperty("supportscredentials")
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
