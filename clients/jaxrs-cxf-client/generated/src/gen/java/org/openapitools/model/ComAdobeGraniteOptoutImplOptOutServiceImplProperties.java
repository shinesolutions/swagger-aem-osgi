package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteOptoutImplOptOutServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray optoutCookies = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray optoutHeaders = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray optoutWhitelistCookies = null;
 /**
   * Get optoutCookies
   * @return optoutCookies
  **/
  @JsonProperty("optout.cookies")
  public ConfigNodePropertyArray getOptoutCookies() {
    return optoutCookies;
  }

  public void setOptoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
    return this;
  }

 /**
   * Get optoutHeaders
   * @return optoutHeaders
  **/
  @JsonProperty("optout.headers")
  public ConfigNodePropertyArray getOptoutHeaders() {
    return optoutHeaders;
  }

  public void setOptoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
    return this;
  }

 /**
   * Get optoutWhitelistCookies
   * @return optoutWhitelistCookies
  **/
  @JsonProperty("optout.whitelist.cookies")
  public ConfigNodePropertyArray getOptoutWhitelistCookies() {
    return optoutWhitelistCookies;
  }

  public void setOptoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {\n");
    
    sb.append("    optoutCookies: ").append(toIndentedString(optoutCookies)).append("\n");
    sb.append("    optoutHeaders: ").append(toIndentedString(optoutHeaders)).append("\n");
    sb.append("    optoutWhitelistCookies: ").append(toIndentedString(optoutWhitelistCookies)).append("\n");
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

