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
 * ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties
 */

@JsonTypeName("comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenValidatorType;

  public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties authTokenValidatorType(@Nullable ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
    return this;
  }

  /**
   * Get authTokenValidatorType
   * @return authTokenValidatorType
   */
  @Valid 
  @Schema(name = "auth.token.validator.type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.validator.type")
  public @Nullable ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }

  @JsonProperty("auth.token.validator.type")
  public void setAuthTokenValidatorType(@Nullable ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties = (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties) o;
    return Objects.equals(this.authTokenValidatorType, comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.authTokenValidatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authTokenValidatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {\n");
    sb.append("    authTokenValidatorType: ").append(toIndentedString(authTokenValidatorType)).append("\n");
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

