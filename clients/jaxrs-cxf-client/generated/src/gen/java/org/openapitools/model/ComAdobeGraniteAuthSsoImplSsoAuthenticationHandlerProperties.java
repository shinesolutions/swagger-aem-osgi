package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger serviceRanking = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString jaasControlFlag = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString jaasRealmName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger jaasRanking = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray headers = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray cookies = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray parameters = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray usermap = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString format = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString trustedCredentialsAttribute = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get jaasControlFlag
   * @return jaasControlFlag
  **/
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

 /**
   * Get jaasRealmName
   * @return jaasRealmName
  **/
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

 /**
   * Get jaasRanking
   * @return jaasRanking
  **/
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

 /**
   * Get headers
   * @return headers
  **/
  @JsonProperty("headers")
  public ConfigNodePropertyArray getHeaders() {
    return headers;
  }

  public void setHeaders(ConfigNodePropertyArray headers) {
    this.headers = headers;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties headers(ConfigNodePropertyArray headers) {
    this.headers = headers;
    return this;
  }

 /**
   * Get cookies
   * @return cookies
  **/
  @JsonProperty("cookies")
  public ConfigNodePropertyArray getCookies() {
    return cookies;
  }

  public void setCookies(ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties cookies(ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
    return this;
  }

 /**
   * Get parameters
   * @return parameters
  **/
  @JsonProperty("parameters")
  public ConfigNodePropertyArray getParameters() {
    return parameters;
  }

  public void setParameters(ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties parameters(ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
    return this;
  }

 /**
   * Get usermap
   * @return usermap
  **/
  @JsonProperty("usermap")
  public ConfigNodePropertyArray getUsermap() {
    return usermap;
  }

  public void setUsermap(ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties usermap(ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
    return this;
  }

 /**
   * Get format
   * @return format
  **/
  @JsonProperty("format")
  public ConfigNodePropertyString getFormat() {
    return format;
  }

  public void setFormat(ConfigNodePropertyString format) {
    this.format = format;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties format(ConfigNodePropertyString format) {
    this.format = format;
    return this;
  }

 /**
   * Get trustedCredentialsAttribute
   * @return trustedCredentialsAttribute
  **/
  @JsonProperty("trustedCredentialsAttribute")
  public ConfigNodePropertyString getTrustedCredentialsAttribute() {
    return trustedCredentialsAttribute;
  }

  public void setTrustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties trustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
    sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
    sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    usermap: ").append(toIndentedString(usermap)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    trustedCredentialsAttribute: ").append(toIndentedString(trustedCredentialsAttribute)).append("\n");
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

