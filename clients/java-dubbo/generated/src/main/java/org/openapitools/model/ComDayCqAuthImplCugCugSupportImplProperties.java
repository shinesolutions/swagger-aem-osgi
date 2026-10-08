package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqAuthImplCugCugSupportImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cug.exempted.principals")
  private ConfigNodePropertyArray cugExemptedPrincipals;

  @JsonProperty("cug.enabled")
  private ConfigNodePropertyBoolean cugEnabled;

  @JsonProperty("cug.principals.regex")
  private ConfigNodePropertyString cugPrincipalsRegex;

  @JsonProperty("cug.principals.replacement")
  private ConfigNodePropertyString cugPrincipalsReplacement;

  /**
   * 
   * @return cugExemptedPrincipals
   */
  public ConfigNodePropertyArray getCugExemptedPrincipals() {
    return cugExemptedPrincipals;
  }

  public void setCugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
  }

  /**
   * 
   * @return cugEnabled
   */
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }

  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  /**
   * 
   * @return cugPrincipalsRegex
   */
  public ConfigNodePropertyString getCugPrincipalsRegex() {
    return cugPrincipalsRegex;
  }

  public void setCugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
  }

  /**
   * 
   * @return cugPrincipalsReplacement
   */
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
