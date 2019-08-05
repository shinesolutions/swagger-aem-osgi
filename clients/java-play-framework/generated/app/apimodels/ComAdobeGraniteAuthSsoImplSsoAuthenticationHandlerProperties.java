package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("jaas.controlFlag")
  private ConfigNodePropertyString jaasControlFlag = null;

  @JsonProperty("jaas.realmName")
  private ConfigNodePropertyString jaasRealmName = null;

  @JsonProperty("jaas.ranking")
  private ConfigNodePropertyInteger jaasRanking = null;

  @JsonProperty("headers")
  private ConfigNodePropertyArray headers = null;

  @JsonProperty("cookies")
  private ConfigNodePropertyArray cookies = null;

  @JsonProperty("parameters")
  private ConfigNodePropertyArray parameters = null;

  @JsonProperty("usermap")
  private ConfigNodePropertyArray usermap = null;

  @JsonProperty("format")
  private ConfigNodePropertyString format = null;

  @JsonProperty("trustedCredentialsAttribute")
  private ConfigNodePropertyString trustedCredentialsAttribute = null;

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Valid
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

   /**
   * Get jaasControlFlag
   * @return jaasControlFlag
  **/
  @Valid
  public ConfigNodePropertyString getJaasControlFlag() {
    return jaasControlFlag;
  }

  public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

   /**
   * Get jaasRealmName
   * @return jaasRealmName
  **/
  @Valid
  public ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties jaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

   /**
   * Get jaasRanking
   * @return jaasRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties headers(ConfigNodePropertyArray headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @Valid
  public ConfigNodePropertyArray getHeaders() {
    return headers;
  }

  public void setHeaders(ConfigNodePropertyArray headers) {
    this.headers = headers;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties cookies(ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
    return this;
  }

   /**
   * Get cookies
   * @return cookies
  **/
  @Valid
  public ConfigNodePropertyArray getCookies() {
    return cookies;
  }

  public void setCookies(ConfigNodePropertyArray cookies) {
    this.cookies = cookies;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties parameters(ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Valid
  public ConfigNodePropertyArray getParameters() {
    return parameters;
  }

  public void setParameters(ConfigNodePropertyArray parameters) {
    this.parameters = parameters;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties usermap(ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
    return this;
  }

   /**
   * Get usermap
   * @return usermap
  **/
  @Valid
  public ConfigNodePropertyArray getUsermap() {
    return usermap;
  }

  public void setUsermap(ConfigNodePropertyArray usermap) {
    this.usermap = usermap;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties format(ConfigNodePropertyString format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Valid
  public ConfigNodePropertyString getFormat() {
    return format;
  }

  public void setFormat(ConfigNodePropertyString format) {
    this.format = format;
  }

  public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties trustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute) {
    this.trustedCredentialsAttribute = trustedCredentialsAttribute;
    return this;
  }

   /**
   * Get trustedCredentialsAttribute
   * @return trustedCredentialsAttribute
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

