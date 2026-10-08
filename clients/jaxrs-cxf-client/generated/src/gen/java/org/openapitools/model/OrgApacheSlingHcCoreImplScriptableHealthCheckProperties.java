package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString hcName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString hcMbeanName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString expression;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString languageExtension;
 /**
   * Get hcName
   * @return hcName
  **/
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

 /**
   * Get hcTags
   * @return hcTags
  **/
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

 /**
   * Get expression
   * @return expression
  **/
  @JsonProperty("expression")
  public ConfigNodePropertyString getExpression() {
    return expression;
  }

  public void setExpression(ConfigNodePropertyString expression) {
    this.expression = expression;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties expression(ConfigNodePropertyString expression) {
    this.expression = expression;
    return this;
  }

 /**
   * Get languageExtension
   * @return languageExtension
  **/
  @JsonProperty("language.extension")
  public ConfigNodePropertyString getLanguageExtension() {
    return languageExtension;
  }

  public void setLanguageExtension(ConfigNodePropertyString languageExtension) {
    this.languageExtension = languageExtension;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties languageExtension(ConfigNodePropertyString languageExtension) {
    this.languageExtension = languageExtension;
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
    OrgApacheSlingHcCoreImplScriptableHealthCheckProperties orgApacheSlingHcCoreImplScriptableHealthCheckProperties = (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties) o;
    return Objects.equals(this.hcName, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.hcName) &&
        Objects.equals(this.hcTags, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.hcMbeanName) &&
        Objects.equals(this.expression, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.expression) &&
        Objects.equals(this.languageExtension, orgApacheSlingHcCoreImplScriptableHealthCheckProperties.languageExtension);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

