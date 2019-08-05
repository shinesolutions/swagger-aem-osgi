package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqAuthImplCugCugSupportImplProperties   {
  
  private ConfigNodePropertyArray cugExemptedPrincipals = null;
  private ConfigNodePropertyBoolean cugEnabled = null;
  private ConfigNodePropertyString cugPrincipalsRegex = null;
  private ConfigNodePropertyString cugPrincipalsReplacement = null;

  public ComDayCqAuthImplCugCugSupportImplProperties () {

  }

  public ComDayCqAuthImplCugCugSupportImplProperties (ConfigNodePropertyArray cugExemptedPrincipals, ConfigNodePropertyBoolean cugEnabled, ConfigNodePropertyString cugPrincipalsRegex, ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
    this.cugEnabled = cugEnabled;
    this.cugPrincipalsRegex = cugPrincipalsRegex;
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
  }

    
  @JsonProperty("cug.exempted.principals")
  public ConfigNodePropertyArray getCugExemptedPrincipals() {
    return cugExemptedPrincipals;
  }
  public void setCugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
  }

    
  @JsonProperty("cug.enabled")
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }
  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

    
  @JsonProperty("cug.principals.regex")
  public ConfigNodePropertyString getCugPrincipalsRegex() {
    return cugPrincipalsRegex;
  }
  public void setCugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
  }

    
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
    return Objects.equals(cugExemptedPrincipals, comDayCqAuthImplCugCugSupportImplProperties.cugExemptedPrincipals) &&
        Objects.equals(cugEnabled, comDayCqAuthImplCugCugSupportImplProperties.cugEnabled) &&
        Objects.equals(cugPrincipalsRegex, comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsRegex) &&
        Objects.equals(cugPrincipalsReplacement, comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsReplacement);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
