package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqAuthImplCugCugSupportImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cugExemptedPrincipals = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cugEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cugPrincipalsRegex = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cugPrincipalsReplacement = null;
 /**
   * Get cugExemptedPrincipals
   * @return cugExemptedPrincipals
  **/
  @JsonProperty("cug.exempted.principals")
  public ConfigNodePropertyArray getCugExemptedPrincipals() {
    return cugExemptedPrincipals;
  }

  public void setCugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
    return this;
  }

 /**
   * Get cugEnabled
   * @return cugEnabled
  **/
  @JsonProperty("cug.enabled")
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }

  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
    return this;
  }

 /**
   * Get cugPrincipalsRegex
   * @return cugPrincipalsRegex
  **/
  @JsonProperty("cug.principals.regex")
  public ConfigNodePropertyString getCugPrincipalsRegex() {
    return cugPrincipalsRegex;
  }

  public void setCugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
    return this;
  }

 /**
   * Get cugPrincipalsReplacement
   * @return cugPrincipalsReplacement
  **/
  @JsonProperty("cug.principals.replacement")
  public ConfigNodePropertyString getCugPrincipalsReplacement() {
    return cugPrincipalsReplacement;
  }

  public void setCugPrincipalsReplacement(ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugPrincipalsReplacement(ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAuthImplCugCugSupportImplProperties {\n");
    
    sb.append("    cugExemptedPrincipals: ").append(toIndentedString(cugExemptedPrincipals)).append("\n");
    sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
    sb.append("    cugPrincipalsRegex: ").append(toIndentedString(cugPrincipalsRegex)).append("\n");
    sb.append("    cugPrincipalsReplacement: ").append(toIndentedString(cugPrincipalsReplacement)).append("\n");
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

