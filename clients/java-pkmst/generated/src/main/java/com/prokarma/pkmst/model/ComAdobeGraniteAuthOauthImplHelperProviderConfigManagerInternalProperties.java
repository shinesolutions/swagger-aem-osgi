package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties   {
  @JsonProperty("oauth.cookie.login.timeout")
  private ConfigNodePropertyString oauthCookieLoginTimeout = null;

  @JsonProperty("oauth.cookie.max.age")
  private ConfigNodePropertyString oauthCookieMaxAge = null;

  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties oauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
    return this;
  }

   /**
   * Get oauthCookieLoginTimeout
   * @return oauthCookieLoginTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthCookieLoginTimeout() {
    return oauthCookieLoginTimeout;
  }

  public void setOauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
  }

  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties oauthCookieMaxAge(ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieMaxAge = oauthCookieMaxAge;
    return this;
  }

   /**
   * Get oauthCookieMaxAge
   * @return oauthCookieMaxAge
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthCookieMaxAge() {
    return oauthCookieMaxAge;
  }

  public void setOauthCookieMaxAge(ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieMaxAge = oauthCookieMaxAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties = (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties) o;
    return Objects.equals(this.oauthCookieLoginTimeout, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.oauthCookieLoginTimeout) &&
        Objects.equals(this.oauthCookieMaxAge, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.oauthCookieMaxAge);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

