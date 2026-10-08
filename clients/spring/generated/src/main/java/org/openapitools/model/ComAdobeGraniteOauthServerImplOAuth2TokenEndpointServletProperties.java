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
 * ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
 */

@JsonTypeName("comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthIssuer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthAccessTokenExpiresIn;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString osgiHttpWhiteboardServletPattern;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString osgiHttpWhiteboardContextSelect;

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthIssuer(@Nullable ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
    return this;
  }

  /**
   * Get oauthIssuer
   * @return oauthIssuer
   */
  @Valid 
  @Schema(name = "oauth.issuer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.issuer")
  public @Nullable ConfigNodePropertyString getOauthIssuer() {
    return oauthIssuer;
  }

  @JsonProperty("oauth.issuer")
  public void setOauthIssuer(@Nullable ConfigNodePropertyString oauthIssuer) {
    this.oauthIssuer = oauthIssuer;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties oauthAccessTokenExpiresIn(@Nullable ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
    return this;
  }

  /**
   * Get oauthAccessTokenExpiresIn
   * @return oauthAccessTokenExpiresIn
   */
  @Valid 
  @Schema(name = "oauth.access.token.expires.in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.access.token.expires.in")
  public @Nullable ConfigNodePropertyString getOauthAccessTokenExpiresIn() {
    return oauthAccessTokenExpiresIn;
  }

  @JsonProperty("oauth.access.token.expires.in")
  public void setOauthAccessTokenExpiresIn(@Nullable ConfigNodePropertyString oauthAccessTokenExpiresIn) {
    this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardServletPattern(@Nullable ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    return this;
  }

  /**
   * Get osgiHttpWhiteboardServletPattern
   * @return osgiHttpWhiteboardServletPattern
   */
  @Valid 
  @Schema(name = "osgi.http.whiteboard.servlet.pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public @Nullable ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }

  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public void setOsgiHttpWhiteboardServletPattern(@Nullable ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

  public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties osgiHttpWhiteboardContextSelect(@Nullable ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

  /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
   */
  @Valid 
  @Schema(name = "osgi.http.whiteboard.context.select", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("osgi.http.whiteboard.context.select")
  public @Nullable ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  @JsonProperty("osgi.http.whiteboard.context.select")
  public void setOsgiHttpWhiteboardContextSelect(@Nullable ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties = (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties) o;
    return Objects.equals(this.oauthIssuer, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.oauthIssuer) &&
        Objects.equals(this.oauthAccessTokenExpiresIn, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.oauthAccessTokenExpiresIn) &&
        Objects.equals(this.osgiHttpWhiteboardServletPattern, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.osgiHttpWhiteboardServletPattern) &&
        Objects.equals(this.osgiHttpWhiteboardContextSelect, comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.osgiHttpWhiteboardContextSelect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthIssuer, oauthAccessTokenExpiresIn, osgiHttpWhiteboardServletPattern, osgiHttpWhiteboardContextSelect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {\n");
    sb.append("    oauthIssuer: ").append(toIndentedString(oauthIssuer)).append("\n");
    sb.append("    oauthAccessTokenExpiresIn: ").append(toIndentedString(oauthAccessTokenExpiresIn)).append("\n");
    sb.append("    osgiHttpWhiteboardServletPattern: ").append(toIndentedString(osgiHttpWhiteboardServletPattern)).append("\n");
    sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
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

