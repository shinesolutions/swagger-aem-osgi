package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthImsProperties   {
  
  private ConfigNodePropertyString configid = null;
  private ConfigNodePropertyString scope = null;

  public ComAdobeGraniteAuthImsProperties () {

  }

  public ComAdobeGraniteAuthImsProperties (ConfigNodePropertyString configid, ConfigNodePropertyString scope) {
    this.configid = configid;
    this.scope = scope;
  }

    
  @JsonProperty("configid")
  public ConfigNodePropertyString getConfigid() {
    return configid;
  }
  public void setConfigid(ConfigNodePropertyString configid) {
    this.configid = configid;
  }

    
  @JsonProperty("scope")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
