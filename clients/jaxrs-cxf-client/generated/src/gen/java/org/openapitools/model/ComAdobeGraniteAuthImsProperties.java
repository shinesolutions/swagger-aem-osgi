package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAuthImsProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString configid = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scope = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

