package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqAuthImplCugCugSupportImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqAuthImplCugCugSupportImplProperties   {
  @JsonProperty("cug.exempted.principals")
  private ConfigNodePropertyArray cugExemptedPrincipals = null;

  @JsonProperty("cug.enabled")
  private ConfigNodePropertyBoolean cugEnabled = null;

  @JsonProperty("cug.principals.regex")
  private ConfigNodePropertyString cugPrincipalsRegex = null;

  @JsonProperty("cug.principals.replacement")
  private ConfigNodePropertyString cugPrincipalsReplacement = null;

  public ComDayCqAuthImplCugCugSupportImplProperties cugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
    return this;
  }

  /**
   * Get cugExemptedPrincipals
   * @return cugExemptedPrincipals
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getCugExemptedPrincipals() {
    return cugExemptedPrincipals;
  }

  public void setCugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
    return this;
  }

  /**
   * Get cugEnabled
   * @return cugEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }

  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
    return this;
  }

  /**
   * Get cugPrincipalsRegex
   * @return cugPrincipalsRegex
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCugPrincipalsRegex() {
    return cugPrincipalsRegex;
  }

  public void setCugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugPrincipalsReplacement(ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
    return this;
  }

  /**
   * Get cugPrincipalsReplacement
   * @return cugPrincipalsReplacement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCugPrincipalsReplacement() {
    return cugPrincipalsReplacement;
  }

  public void setCugPrincipalsReplacement(ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAuthImplCugCugSupportImplProperties comDayCqAuthImplCugCugSupportImplProperties = (ComDayCqAuthImplCugCugSupportImplProperties) o;
    return Objects.equals(this.cugExemptedPrincipals, comDayCqAuthImplCugCugSupportImplProperties.cugExemptedPrincipals) &&
        Objects.equals(this.cugEnabled, comDayCqAuthImplCugCugSupportImplProperties.cugEnabled) &&
        Objects.equals(this.cugPrincipalsRegex, comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsRegex) &&
        Objects.equals(this.cugPrincipalsReplacement, comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsReplacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cugExemptedPrincipals, cugEnabled, cugPrincipalsRegex, cugPrincipalsReplacement);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

