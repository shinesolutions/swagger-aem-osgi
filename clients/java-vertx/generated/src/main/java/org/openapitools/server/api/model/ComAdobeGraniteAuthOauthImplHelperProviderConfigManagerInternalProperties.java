package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties   {
  
  private ConfigNodePropertyString oauthCookieLoginTimeout = null;
  private ConfigNodePropertyString oauthCookieMaxAge = null;

  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties () {

  }

  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties (ConfigNodePropertyString oauthCookieLoginTimeout, ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
    this.oauthCookieMaxAge = oauthCookieMaxAge;
  }

    
  @JsonProperty("oauth.cookie.login.timeout")
  public ConfigNodePropertyString getOauthCookieLoginTimeout() {
    return oauthCookieLoginTimeout;
  }
  public void setOauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
  }

    
  @JsonProperty("oauth.cookie.max.age")
  public ConfigNodePropertyString getOauthCookieMaxAge() {
    return oauthCookieMaxAge;
  }
  public void setOauthCookieMaxAge(ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieMaxAge = oauthCookieMaxAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties = (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties) o;
    return Objects.equals(oauthCookieLoginTimeout, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.oauthCookieLoginTimeout) &&
        Objects.equals(oauthCookieMaxAge, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.oauthCookieMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthCookieLoginTimeout, oauthCookieMaxAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties {\n");
    
    sb.append("    oauthCookieLoginTimeout: ").append(toIndentedString(oauthCookieLoginTimeout)).append("\n");
    sb.append("    oauthCookieMaxAge: ").append(toIndentedString(oauthCookieMaxAge)).append("\n");
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
