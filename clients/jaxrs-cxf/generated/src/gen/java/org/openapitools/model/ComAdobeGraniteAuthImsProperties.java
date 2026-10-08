package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthImsProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString configid;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString scope;
 /**
   * Get configid
   * @return configid
  **/
  @JsonProperty("configid")
  public ConfigNodePropertyString getConfigid() {
    return configid;
  }

  public void setConfigid(ConfigNodePropertyString configid) {
    this.configid = configid;
  }

  public ComAdobeGraniteAuthImsProperties configid(ConfigNodePropertyString configid) {
    this.configid = configid;
    return this;
  }

 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  public ConfigNodePropertyString getScope() {
    return scope;
  }

  public void setScope(ConfigNodePropertyString scope) {
    this.scope = scope;
  }

  public ComAdobeGraniteAuthImsProperties scope(ConfigNodePropertyString scope) {
    this.scope = scope;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

