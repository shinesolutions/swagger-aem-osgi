package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString path;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger serviceRanking;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString jaasControlFlag;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString jaasRealmName;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger jaasRanking;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray headers;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray cookies;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray parameters;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray usermap;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString format;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString trustedCredentialsAttribute;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties = (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties) o;
    return Objects.equals(this.path, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.path) &&
        Objects.equals(this.serviceRanking, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.serviceRanking) &&
        Objects.equals(this.jaasControlFlag, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasControlFlag) &&
        Objects.equals(this.jaasRealmName, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasRealmName) &&
        Objects.equals(this.jaasRanking, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.jaasRanking) &&
        Objects.equals(this.headers, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.headers) &&
        Objects.equals(this.cookies, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.cookies) &&
        Objects.equals(this.parameters, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.parameters) &&
        Objects.equals(this.usermap, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.usermap) &&
        Objects.equals(this.format, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.format) &&
        Objects.equals(this.trustedCredentialsAttribute, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.trustedCredentialsAttribute);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

