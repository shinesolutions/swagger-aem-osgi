package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

