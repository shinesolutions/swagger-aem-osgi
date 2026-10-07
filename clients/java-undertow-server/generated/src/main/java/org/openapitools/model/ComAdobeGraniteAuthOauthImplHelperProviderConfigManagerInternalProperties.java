/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties   {
  
  private ConfigNodePropertyString oauthCookieLoginTimeout;
  private ConfigNodePropertyString oauthCookieMaxAge;

  /**
   */
  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties oauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.cookie.login.timeout")
  public ConfigNodePropertyString getOauthCookieLoginTimeout() {
    return oauthCookieLoginTimeout;
  }
  public void setOauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
  }

  /**
   */
  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties oauthCookieMaxAge(ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieMaxAge = oauthCookieMaxAge;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

