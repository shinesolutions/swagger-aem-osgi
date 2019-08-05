package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
    return Objects.equals(oauthCookieLoginTimeout, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.oauthCookieLoginTimeout) &&
        Objects.equals(oauthCookieMaxAge, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.oauthCookieMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthCookieLoginTimeout, oauthCookieMaxAge);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

