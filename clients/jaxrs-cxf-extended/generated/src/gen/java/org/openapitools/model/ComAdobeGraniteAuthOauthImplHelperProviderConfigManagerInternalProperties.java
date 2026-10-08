package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthCookieLoginTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthCookieMaxAge;
 /**
  * Get oauthCookieLoginTimeout
  * @return oauthCookieLoginTimeout
  */
  @JsonProperty("oauth.cookie.login.timeout")
  public ConfigNodePropertyString getOauthCookieLoginTimeout() {
    return oauthCookieLoginTimeout;
  }

  /**
   * Sets the <code>oauthCookieLoginTimeout</code> property.
   */
 public void setOauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
  }

  /**
   * Sets the <code>oauthCookieLoginTimeout</code> property.
   */
  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties oauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
    return this;
  }

 /**
  * Get oauthCookieMaxAge
  * @return oauthCookieMaxAge
  */
  @JsonProperty("oauth.cookie.max.age")
  public ConfigNodePropertyString getOauthCookieMaxAge() {
    return oauthCookieMaxAge;
  }

  /**
   * Sets the <code>oauthCookieMaxAge</code> property.
   */
 public void setOauthCookieMaxAge(ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieMaxAge = oauthCookieMaxAge;
  }

  /**
   * Sets the <code>oauthCookieMaxAge</code> property.
   */
  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties oauthCookieMaxAge(ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieMaxAge = oauthCookieMaxAge;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

