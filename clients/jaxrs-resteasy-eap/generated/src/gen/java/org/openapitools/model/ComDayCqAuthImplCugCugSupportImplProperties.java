package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAuthImplCugCugSupportImplProperties   {
  
  private ConfigNodePropertyArray cugExemptedPrincipals;
  private ConfigNodePropertyBoolean cugEnabled;
  private ConfigNodePropertyString cugPrincipalsRegex;
  private ConfigNodePropertyString cugPrincipalsReplacement;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cug.exempted.principals")
  public ConfigNodePropertyArray getCugExemptedPrincipals() {
    return cugExemptedPrincipals;
  }
  public void setCugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cug.enabled")
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }
  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cug.principals.regex")
  public ConfigNodePropertyString getCugPrincipalsRegex() {
    return cugPrincipalsRegex;
  }
  public void setCugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cug.principals.replacement")
  public ConfigNodePropertyString getCugPrincipalsReplacement() {
    return cugPrincipalsReplacement;
  }
  public void setCugPrincipalsReplacement(ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

