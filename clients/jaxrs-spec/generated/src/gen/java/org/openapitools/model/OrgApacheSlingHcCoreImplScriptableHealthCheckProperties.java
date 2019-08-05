package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties   {
  
  private @Valid ConfigNodePropertyString hcName = null;
  private @Valid ConfigNodePropertyArray hcTags = null;
  private @Valid ConfigNodePropertyString hcMbeanName = null;
  private @Valid ConfigNodePropertyString expression = null;
  private @Valid ConfigNodePropertyString languageExtension = null;

  /**
   **/
  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }
  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }
  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties expression(ConfigNodePropertyString expression) {
    this.expression = expression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("expression")
  public ConfigNodePropertyString getExpression() {
    return expression;
  }
  public void setExpression(ConfigNodePropertyString expression) {
    this.expression = expression;
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties languageExtension(ConfigNodePropertyString languageExtension) {
    this.languageExtension = languageExtension;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("language.extension")
  public ConfigNodePropertyString getLanguageExtension() {
    return languageExtension;
  }
  public void setLanguageExtension(ConfigNodePropertyString languageExtension) {
    this.languageExtension = languageExtension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplScriptableHealthCheckProperties orgApacheSlingHcCoreImplScriptableHealthCheckProperties = (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties) o;
    return Objects.equals(hcName, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.hcName) &&
        Objects.equals(hcTags, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.hcTags) &&
        Objects.equals(hcMbeanName, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.hcMbeanName) &&
        Objects.equals(expression, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.expression) &&
        Objects.equals(languageExtension, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.languageExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, expression, languageExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    languageExtension: ").append(toIndentedString(languageExtension)).append("\n");
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

