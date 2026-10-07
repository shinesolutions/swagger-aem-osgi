package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
 */

@JsonTypeName("comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthClientRevocationActive;

  public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties oauthClientRevocationActive(@Nullable ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
    return this;
  }

  /**
   * Get oauthClientRevocationActive
   * @return oauthClientRevocationActive
   */
  @Valid 
  @Schema(name = "oauth.client.revocation.active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.client.revocation.active")
  public @Nullable ConfigNodePropertyBoolean getOauthClientRevocationActive() {
    return oauthClientRevocationActive;
  }

  @JsonProperty("oauth.client.revocation.active")
  public void setOauthClientRevocationActive(@Nullable ConfigNodePropertyBoolean oauthClientRevocationActive) {
    this.oauthClientRevocationActive = oauthClientRevocationActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties = (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties) o;
    return Objects.equals(this.oauthClientRevocationActive, comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.oauthClientRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthClientRevocationActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {\n");
    sb.append("    oauthClientRevocationActive: ").append(toIndentedString(oauthClientRevocationActive)).append("\n");
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

