package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteAuthImsProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteAuthImsProperties   {
  @JsonProperty("configid")
  private ConfigNodePropertyString configid = null;

  @JsonProperty("scope")
  private ConfigNodePropertyString scope = null;

  public ComAdobeGraniteAuthImsProperties configid(ConfigNodePropertyString configid) {
    this.configid = configid;
    return this;
  }

   /**
   * Get configid
   * @return configid
  **/
  @Valid
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
  @Valid
  public ConfigNodePropertyString getScope() {
    return scope;
  }

  public void setScope(ConfigNodePropertyString scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

