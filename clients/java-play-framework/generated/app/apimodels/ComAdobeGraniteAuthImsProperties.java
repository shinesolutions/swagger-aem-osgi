package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteAuthImsProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteAuthImsProperties   {
  @JsonProperty("configid")
  @Valid

  private ConfigNodePropertyString configid;

  @JsonProperty("scope")
  @Valid

  private ConfigNodePropertyString scope;

  public ComAdobeGraniteAuthImsProperties configid(ConfigNodePropertyString configid) {
    this.configid = configid;
    return this;
  }

   /**
   * Get configid
   * @return configid
  **/
  public ConfigNodePropertyString getConfigid() {
    return configid;
  }

  public void setConfigid(ConfigNodePropertyString configid) {
    this.configid = configid;
  }

  public ComAdobeGraniteAuthImsProperties scope(ConfigNodePropertyString scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  public ConfigNodePropertyString getScope() {
    return scope;
  }

  public void setScope(ConfigNodePropertyString scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties = (ComAdobeGraniteAuthImsProperties) o;
    return Objects.equals(configid, comAdobeGraniteAuthImsProperties.configid) &&
        Objects.equals(scope, comAdobeGraniteAuthImsProperties.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configid, scope);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsProperties {\n");
    
    sb.append("    configid: ").append(toIndentedString(configid)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

