package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
 */

@JsonTypeName("comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray oauthClientIdsAllowed;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean authBearerSyncIms;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenRequestParameter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthBearerConfigid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthJwtSupport;

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties path(@Nullable ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties oauthClientIdsAllowed(@Nullable ConfigNodePropertyArray oauthClientIdsAllowed) {
    this.oauthClientIdsAllowed = oauthClientIdsAllowed;
    return this;
  }

  /**
   * Get oauthClientIdsAllowed
   * @return oauthClientIdsAllowed
   */
  @Valid 
  @Schema(name = "oauth.clientIds.allowed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.clientIds.allowed")
  public @Nullable ConfigNodePropertyArray getOauthClientIdsAllowed() {
    return oauthClientIdsAllowed;
  }

  @JsonProperty("oauth.clientIds.allowed")
  public void setOauthClientIdsAllowed(@Nullable ConfigNodePropertyArray oauthClientIdsAllowed) {
    this.oauthClientIdsAllowed = oauthClientIdsAllowed;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties authBearerSyncIms(@Nullable ConfigNodePropertyBoolean authBearerSyncIms) {
    this.authBearerSyncIms = authBearerSyncIms;
    return this;
  }

  /**
   * Get authBearerSyncIms
   * @return authBearerSyncIms
   */
  @Valid 
  @Schema(name = "auth.bearer.sync.ims", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.bearer.sync.ims")
  public @Nullable ConfigNodePropertyBoolean getAuthBearerSyncIms() {
    return authBearerSyncIms;
  }

  @JsonProperty("auth.bearer.sync.ims")
  public void setAuthBearerSyncIms(@Nullable ConfigNodePropertyBoolean authBearerSyncIms) {
    this.authBearerSyncIms = authBearerSyncIms;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties authTokenRequestParameter(@Nullable ConfigNodePropertyString authTokenRequestParameter) {
    this.authTokenRequestParameter = authTokenRequestParameter;
    return this;
  }

  /**
   * Get authTokenRequestParameter
   * @return authTokenRequestParameter
   */
  @Valid 
  @Schema(name = "auth.tokenRequestParameter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.tokenRequestParameter")
  public @Nullable ConfigNodePropertyString getAuthTokenRequestParameter() {
    return authTokenRequestParameter;
  }

  @JsonProperty("auth.tokenRequestParameter")
  public void setAuthTokenRequestParameter(@Nullable ConfigNodePropertyString authTokenRequestParameter) {
    this.authTokenRequestParameter = authTokenRequestParameter;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties oauthBearerConfigid(@Nullable ConfigNodePropertyString oauthBearerConfigid) {
    this.oauthBearerConfigid = oauthBearerConfigid;
    return this;
  }

  /**
   * Get oauthBearerConfigid
   * @return oauthBearerConfigid
   */
  @Valid 
  @Schema(name = "oauth.bearer.configid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.bearer.configid")
  public @Nullable ConfigNodePropertyString getOauthBearerConfigid() {
    return oauthBearerConfigid;
  }

  @JsonProperty("oauth.bearer.configid")
  public void setOauthBearerConfigid(@Nullable ConfigNodePropertyString oauthBearerConfigid) {
    this.oauthBearerConfigid = oauthBearerConfigid;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties oauthJwtSupport(@Nullable ConfigNodePropertyBoolean oauthJwtSupport) {
    this.oauthJwtSupport = oauthJwtSupport;
    return this;
  }

  /**
   * Get oauthJwtSupport
   * @return oauthJwtSupport
   */
  @Valid 
  @Schema(name = "oauth.jwt.support", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.jwt.support")
  public @Nullable ConfigNodePropertyBoolean getOauthJwtSupport() {
    return oauthJwtSupport;
  }

  @JsonProperty("oauth.jwt.support")
  public void setOauthJwtSupport(@Nullable ConfigNodePropertyBoolean oauthJwtSupport) {
    this.oauthJwtSupport = oauthJwtSupport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties = (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties) o;
    return Objects.equals(this.path, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.path) &&
        Objects.equals(this.oauthClientIdsAllowed, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthClientIdsAllowed) &&
        Objects.equals(this.authBearerSyncIms, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.authBearerSyncIms) &&
        Objects.equals(this.authTokenRequestParameter, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.authTokenRequestParameter) &&
        Objects.equals(this.oauthBearerConfigid, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthBearerConfigid) &&
        Objects.equals(this.oauthJwtSupport, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthJwtSupport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, oauthClientIdsAllowed, authBearerSyncIms, authTokenRequestParameter, oauthBearerConfigid, oauthJwtSupport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    oauthClientIdsAllowed: ").append(toIndentedString(oauthClientIdsAllowed)).append("\n");
    sb.append("    authBearerSyncIms: ").append(toIndentedString(authBearerSyncIms)).append("\n");
    sb.append("    authTokenRequestParameter: ").append(toIndentedString(authTokenRequestParameter)).append("\n");
    sb.append("    oauthBearerConfigid: ").append(toIndentedString(oauthBearerConfigid)).append("\n");
    sb.append("    oauthJwtSupport: ").append(toIndentedString(oauthJwtSupport)).append("\n");
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

