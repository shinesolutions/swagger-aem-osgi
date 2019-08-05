package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties   {
  
  private @Valid ConfigNodePropertyString path = null;
  private @Valid ConfigNodePropertyInteger serviceRanking = null;
  private @Valid ConfigNodePropertyString jaasControlFlag = null;
  private @Valid ConfigNodePropertyString jaasRealmName = null;
  private @Valid ConfigNodePropertyInteger jaasRanking = null;
  private @Valid ConfigNodePropertyArray headers = null;
  private @Valid ConfigNodePropertyArray cookies = null;
  private @Valid ConfigNodePropertyArray parameters = null;
  private @Valid ConfigNodePropertyArray usermap = null;
  private @Valid ConfigNodePropertyString format = null;
  private @Valid ConfigNodePropertyString trustedCredentialsAttribute = null;

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }
  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }
  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }
  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties headers(ConfigNodePropertyArray headers) {
    this.headers = headers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("headers")
  public ConfigNodePropertyArray getHeaders() {
    return headers;
  }
  public void setHeaders(ConfigNodePropertyArray headers) {
    this.headers = headers;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties cookies(ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cookies")
  public ConfigNodePropertyArray getCookies() {
    return cookies;
  }
  public void setCookies(ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties parameters(ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parameters")
  public ConfigNodePropertyArray getParameters() {
    return parameters;
  }
  public void setParameters(ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties usermap(ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usermap")
  public ConfigNodePropertyArray getUsermap() {
    return usermap;
  }
  public void setUsermap(ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties format(ConfigNodePropertyString format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("format")
  public ConfigNodePropertyString getFormat() {
    return format;
  }
  public void setFormat(ConfigNodePropertyString format) {
    this.format = format;
  }

  /**
   **/
  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties trustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("trustedCredentialsAttribute")
  public ConfigNodePropertyString getTrustedCredentialsAttribute() {
    return trustedCredentialsAttribute;
  }
  public void setTrustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties = (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties) o;
    return Objects.equals(path, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.path) &&
        Objects.equals(serviceRanking, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.serviceRanking) &&
        Objects.equals(jaasControlFlag, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasControlFlag) &&
        Objects.equals(jaasRealmName, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasRealmName) &&
        Objects.equals(jaasRanking, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasRanking) &&
        Objects.equals(headers, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.headers) &&
        Objects.equals(cookies, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.cookies) &&
        Objects.equals(parameters, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.parameters) &&
        Objects.equals(usermap, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.usermap) &&
        Objects.equals(format, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.format) &&
        Objects.equals(trustedCredentialsAttribute, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.trustedCredentialsAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, jaasControlFlag, jaasRealmName, jaasRanking, headers, cookies, parameters, usermap, format, trustedCredentialsAttribute);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

