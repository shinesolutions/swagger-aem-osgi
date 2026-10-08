package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties
 */

@JsonTypeName("comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthCookieLoginTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthCookieMaxAge;

  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties oauthCookieLoginTimeout(@Nullable ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
    return this;
  }

  /**
   * Get oauthCookieLoginTimeout
   * @return oauthCookieLoginTimeout
   */
  @Valid 
  @Schema(name = "oauth.cookie.login.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.cookie.login.timeout")
  public @Nullable ConfigNodePropertyString getOauthCookieLoginTimeout() {
    return oauthCookieLoginTimeout;
  }

  @JsonProperty("oauth.cookie.login.timeout")
  public void setOauthCookieLoginTimeout(@Nullable ConfigNodePropertyString oauthCookieLoginTimeout) {
    this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
  }

  public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties oauthCookieMaxAge(@Nullable ConfigNodePropertyString oauthCookieMaxAge) {
    this.oauthCookieMaxAge = oauthCookieMaxAge;
    return this;
  }

  /**
   * Get oauthCookieMaxAge
   * @return oauthCookieMaxAge
   */
  @Valid 
  @Schema(name = "oauth.cookie.max.age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.cookie.max.age")
  public @Nullable ConfigNodePropertyString getOauthCookieMaxAge() {
    return oauthCookieMaxAge;
  }

  @JsonProperty("oauth.cookie.max.age")
  public void setOauthCookieMaxAge(@Nullable ConfigNodePropertyString oauthCookieMaxAge) {
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
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties = (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties) o;
    return Objects.equals(this.oauthCookieLoginTimeout, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.oauthCookieLoginTimeout) &&
        Objects.equals(this.oauthCookieMaxAge, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.oauthCookieMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthCookieLoginTimeout, oauthCookieMaxAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties {\n");
    sb.append("    oauthCookieLoginTimeout: ").append(toIndentedString(oauthCookieLoginTimeout)).append("\n");
    sb.append("    oauthCookieMaxAge: ").append(toIndentedString(oauthCookieMaxAge)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

