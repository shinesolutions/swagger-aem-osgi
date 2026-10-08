package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteAuthImsProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("configid")
  private ConfigNodePropertyString configid;

  @JsonProperty("scope")
  private ConfigNodePropertyString scope;

  /**
   * 
   * @return configid
   */
  public ConfigNodePropertyString getConfigid() {
    return configid;
  }

  public void setConfigid(ConfigNodePropertyString configid) {
    this.configid = configid;
  }

  /**
   * 
   * @return scope
   */
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
    return Objects.equals(this.configid, comAdobeGraniteAuthImsProperties.configid) &&
        Objects.equals(this.scope, comAdobeGraniteAuthImsProperties.scope);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
