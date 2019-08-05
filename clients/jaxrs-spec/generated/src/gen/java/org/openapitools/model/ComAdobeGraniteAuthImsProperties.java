package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthImsProperties   {
  
  private @Valid ConfigNodePropertyString configid = null;
  private @Valid ConfigNodePropertyString scope = null;

  /**
   **/
  public ComAdobeGraniteAuthImsProperties configid(ConfigNodePropertyString configid) {
    this.configid = configid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configid")
  public ConfigNodePropertyString getConfigid() {
    return configid;
  }
  public void setConfigid(ConfigNodePropertyString configid) {
    this.configid = configid;
  }

  /**
   **/
  public ComAdobeGraniteAuthImsProperties scope(ConfigNodePropertyString scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
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

