package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties   {
  @JsonProperty("hc.name")
  private ConfigNodePropertyString hcName = null;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("hc.mbean.name")
  private ConfigNodePropertyString hcMbeanName = null;

  @JsonProperty("expression")
  private ConfigNodePropertyString expression = null;

  @JsonProperty("language.extension")
  private ConfigNodePropertyString languageExtension = null;

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

   /**
   * Get hcName
   * @return hcName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

   /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties expression(ConfigNodePropertyString expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getExpression() {
    return expression;
  }

  public void setExpression(ConfigNodePropertyString expression) {
    this.expression = expression;
  }

  public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties languageExtension(ConfigNodePropertyString languageExtension) {
    this.languageExtension = languageExtension;
    return this;
  }

   /**
   * Get languageExtension
   * @return languageExtension
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

