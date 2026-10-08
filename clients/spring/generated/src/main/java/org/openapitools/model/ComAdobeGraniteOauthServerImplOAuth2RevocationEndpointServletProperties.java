package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
 */

@JsonTypeName("comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthRevocationActive;

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties slingServletPaths(@Nullable ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

  /**
   * Get slingServletPaths
   * @return slingServletPaths
   */
  @Valid 
  @Schema(name = "sling.servlet.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.paths")
  public @Nullable ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  @JsonProperty("sling.servlet.paths")
  public void setSlingServletPaths(@Nullable ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties oauthRevocationActive(@Nullable ConfigNodePropertyBoolean oauthRevocationActive) {
    this.oauthRevocationActive = oauthRevocationActive;
    return this;
  }

  /**
   * Get oauthRevocationActive
   * @return oauthRevocationActive
   */
  @Valid 
  @Schema(name = "oauth.revocation.active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.revocation.active")
  public @Nullable ConfigNodePropertyBoolean getOauthRevocationActive() {
    return oauthRevocationActive;
  }

  @JsonProperty("oauth.revocation.active")
  public void setOauthRevocationActive(@Nullable ConfigNodePropertyBoolean oauthRevocationActive) {
    this.oauthRevocationActive = oauthRevocationActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties = (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties) o;
    return Objects.equals(this.slingServletPaths, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.slingServletPaths) &&
        Objects.equals(this.oauthRevocationActive, comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.oauthRevocationActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, oauthRevocationActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {\n");
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    oauthRevocationActive: ").append(toIndentedString(oauthRevocationActive)).append("\n");
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

