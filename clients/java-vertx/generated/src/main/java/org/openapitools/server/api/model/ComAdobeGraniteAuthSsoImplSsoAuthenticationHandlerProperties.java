package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties   {
  
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyString jaasControlFlag = null;
  private ConfigNodePropertyString jaasRealmName = null;
  private ConfigNodePropertyInteger jaasRanking = null;
  private ConfigNodePropertyArray headers = null;
  private ConfigNodePropertyArray cookies = null;
  private ConfigNodePropertyArray parameters = null;
  private ConfigNodePropertyArray usermap = null;
  private ConfigNodePropertyString format = null;
  private ConfigNodePropertyString trustedCredentialsAttribute = null;

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties () {

  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties (ConfigNodePropertyString path, ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyString jaasControlFlag, ConfigNodePropertyString jaasRealmName, ConfigNodePropertyInteger jaasRanking, ConfigNodePropertyArray headers, ConfigNodePropertyArray cookies, ConfigNodePropertyArray parameters, ConfigNodePropertyArray usermap, ConfigNodePropertyString format, ConfigNodePropertyString trustedCredentialsAttribute) {
    this.path = path;
    this.serviceRanking = serviceRanking;
    this.jaasControlFlag = jaasControlFlag;
    this.jaasRealmName = jaasRealmName;
    this.jaasRanking = jaasRanking;
    this.headers = headers;
    this.cookies = cookies;
    this.parameters = parameters;
    this.usermap = usermap;
    this.format = format;
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("jaas.controlFlag")
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }
  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

    
  @JsonProperty("jaas.realmName")
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }
  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

    
  @JsonProperty("jaas.ranking")
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }
  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

    
  @JsonProperty("headers")
  public ConfigNodePropertyArray getHeaders() {
    return headers;
  }
  public void setHeaders(ConfigNodePropertyArray headers) {
    this.headers = headers;
  }

    
  @JsonProperty("cookies")
  public ConfigNodePropertyArray getCookies() {
    return cookies;
  }
  public void setCookies(ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
  }

    
  @JsonProperty("parameters")
  public ConfigNodePropertyArray getParameters() {
    return parameters;
  }
  public void setParameters(ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
  }

    
  @JsonProperty("usermap")
  public ConfigNodePropertyArray getUsermap() {
    return usermap;
  }
  public void setUsermap(ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
  }

    
  @JsonProperty("format")
  public ConfigNodePropertyString getFormat() {
    return format;
  }
  public void setFormat(ConfigNodePropertyString format) {
    this.format = format;
  }

    
  @JsonProperty("trustedCredentialsAttribute")
  public ConfigNodePropertyString getTrustedCredentialsAttribute() {
    return trustedCredentialsAttribute;
  }
  public void setTrustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
