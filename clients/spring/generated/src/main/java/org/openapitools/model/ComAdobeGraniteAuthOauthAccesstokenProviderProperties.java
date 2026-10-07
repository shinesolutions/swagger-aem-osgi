package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties
 */

@JsonTypeName("comAdobeGraniteAuthOauthAccesstokenProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenProviderTitle;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray authTokenProviderDefaultClaims;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenProviderEndpoint;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authAccessTokenRequest;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenProviderKeypairAlias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger authTokenProviderConnTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger authTokenProviderSoTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenProviderClientId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenProviderScope;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean authTokenProviderReuseAccessToken;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean authTokenProviderRelaxedSsl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tokenRequestCustomizerType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authTokenValidatorType;

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties name(@Nullable ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderTitle(@Nullable ConfigNodePropertyString authTokenProviderTitle) {
    this.authTokenProviderTitle = authTokenProviderTitle;
    return this;
  }

  /**
   * Get authTokenProviderTitle
   * @return authTokenProviderTitle
   */
  @Valid 
  @Schema(name = "auth.token.provider.title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.title")
  public @Nullable ConfigNodePropertyString getAuthTokenProviderTitle() {
    return authTokenProviderTitle;
  }

  @JsonProperty("auth.token.provider.title")
  public void setAuthTokenProviderTitle(@Nullable ConfigNodePropertyString authTokenProviderTitle) {
    this.authTokenProviderTitle = authTokenProviderTitle;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderDefaultClaims(@Nullable ConfigNodePropertyArray authTokenProviderDefaultClaims) {
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
    return this;
  }

  /**
   * Get authTokenProviderDefaultClaims
   * @return authTokenProviderDefaultClaims
   */
  @Valid 
  @Schema(name = "auth.token.provider.default.claims", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.default.claims")
  public @Nullable ConfigNodePropertyArray getAuthTokenProviderDefaultClaims() {
    return authTokenProviderDefaultClaims;
  }

  @JsonProperty("auth.token.provider.default.claims")
  public void setAuthTokenProviderDefaultClaims(@Nullable ConfigNodePropertyArray authTokenProviderDefaultClaims) {
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderEndpoint(@Nullable ConfigNodePropertyString authTokenProviderEndpoint) {
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
    return this;
  }

  /**
   * Get authTokenProviderEndpoint
   * @return authTokenProviderEndpoint
   */
  @Valid 
  @Schema(name = "auth.token.provider.endpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.endpoint")
  public @Nullable ConfigNodePropertyString getAuthTokenProviderEndpoint() {
    return authTokenProviderEndpoint;
  }

  @JsonProperty("auth.token.provider.endpoint")
  public void setAuthTokenProviderEndpoint(@Nullable ConfigNodePropertyString authTokenProviderEndpoint) {
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authAccessTokenRequest(@Nullable ConfigNodePropertyString authAccessTokenRequest) {
    this.authAccessTokenRequest = authAccessTokenRequest;
    return this;
  }

  /**
   * Get authAccessTokenRequest
   * @return authAccessTokenRequest
   */
  @Valid 
  @Schema(name = "auth.access.token.request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.access.token.request")
  public @Nullable ConfigNodePropertyString getAuthAccessTokenRequest() {
    return authAccessTokenRequest;
  }

  @JsonProperty("auth.access.token.request")
  public void setAuthAccessTokenRequest(@Nullable ConfigNodePropertyString authAccessTokenRequest) {
    this.authAccessTokenRequest = authAccessTokenRequest;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderKeypairAlias(@Nullable ConfigNodePropertyString authTokenProviderKeypairAlias) {
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
    return this;
  }

  /**
   * Get authTokenProviderKeypairAlias
   * @return authTokenProviderKeypairAlias
   */
  @Valid 
  @Schema(name = "auth.token.provider.keypair.alias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.keypair.alias")
  public @Nullable ConfigNodePropertyString getAuthTokenProviderKeypairAlias() {
    return authTokenProviderKeypairAlias;
  }

  @JsonProperty("auth.token.provider.keypair.alias")
  public void setAuthTokenProviderKeypairAlias(@Nullable ConfigNodePropertyString authTokenProviderKeypairAlias) {
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderConnTimeout(@Nullable ConfigNodePropertyInteger authTokenProviderConnTimeout) {
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
    return this;
  }

  /**
   * Get authTokenProviderConnTimeout
   * @return authTokenProviderConnTimeout
   */
  @Valid 
  @Schema(name = "auth.token.provider.conn.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.conn.timeout")
  public @Nullable ConfigNodePropertyInteger getAuthTokenProviderConnTimeout() {
    return authTokenProviderConnTimeout;
  }

  @JsonProperty("auth.token.provider.conn.timeout")
  public void setAuthTokenProviderConnTimeout(@Nullable ConfigNodePropertyInteger authTokenProviderConnTimeout) {
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderSoTimeout(@Nullable ConfigNodePropertyInteger authTokenProviderSoTimeout) {
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
    return this;
  }

  /**
   * Get authTokenProviderSoTimeout
   * @return authTokenProviderSoTimeout
   */
  @Valid 
  @Schema(name = "auth.token.provider.so.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.so.timeout")
  public @Nullable ConfigNodePropertyInteger getAuthTokenProviderSoTimeout() {
    return authTokenProviderSoTimeout;
  }

  @JsonProperty("auth.token.provider.so.timeout")
  public void setAuthTokenProviderSoTimeout(@Nullable ConfigNodePropertyInteger authTokenProviderSoTimeout) {
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderClientId(@Nullable ConfigNodePropertyString authTokenProviderClientId) {
    this.authTokenProviderClientId = authTokenProviderClientId;
    return this;
  }

  /**
   * Get authTokenProviderClientId
   * @return authTokenProviderClientId
   */
  @Valid 
  @Schema(name = "auth.token.provider.client.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.client.id")
  public @Nullable ConfigNodePropertyString getAuthTokenProviderClientId() {
    return authTokenProviderClientId;
  }

  @JsonProperty("auth.token.provider.client.id")
  public void setAuthTokenProviderClientId(@Nullable ConfigNodePropertyString authTokenProviderClientId) {
    this.authTokenProviderClientId = authTokenProviderClientId;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderScope(@Nullable ConfigNodePropertyString authTokenProviderScope) {
    this.authTokenProviderScope = authTokenProviderScope;
    return this;
  }

  /**
   * Get authTokenProviderScope
   * @return authTokenProviderScope
   */
  @Valid 
  @Schema(name = "auth.token.provider.scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.scope")
  public @Nullable ConfigNodePropertyString getAuthTokenProviderScope() {
    return authTokenProviderScope;
  }

  @JsonProperty("auth.token.provider.scope")
  public void setAuthTokenProviderScope(@Nullable ConfigNodePropertyString authTokenProviderScope) {
    this.authTokenProviderScope = authTokenProviderScope;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderReuseAccessToken(@Nullable ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
    return this;
  }

  /**
   * Get authTokenProviderReuseAccessToken
   * @return authTokenProviderReuseAccessToken
   */
  @Valid 
  @Schema(name = "auth.token.provider.reuse.access.token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.reuse.access.token")
  public @Nullable ConfigNodePropertyBoolean getAuthTokenProviderReuseAccessToken() {
    return authTokenProviderReuseAccessToken;
  }

  @JsonProperty("auth.token.provider.reuse.access.token")
  public void setAuthTokenProviderReuseAccessToken(@Nullable ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderRelaxedSsl(@Nullable ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
    return this;
  }

  /**
   * Get authTokenProviderRelaxedSsl
   * @return authTokenProviderRelaxedSsl
   */
  @Valid 
  @Schema(name = "auth.token.provider.relaxed.ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.token.provider.relaxed.ssl")
  public @Nullable ConfigNodePropertyBoolean getAuthTokenProviderRelaxedSsl() {
    return authTokenProviderRelaxedSsl;
  }

  @JsonProperty("auth.token.provider.relaxed.ssl")
  public void setAuthTokenProviderRelaxedSsl(@Nullable ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties tokenRequestCustomizerType(@Nullable ConfigNodePropertyString tokenRequestCustomizerType) {
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
    return this;
  }

  /**
   * Get tokenRequestCustomizerType
   * @return tokenRequestCustomizerType
   */
  @Valid 
  @Schema(name = "token.request.customizer.type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token.request.customizer.type")
  public @Nullable ConfigNodePropertyString getTokenRequestCustomizerType() {
    return tokenRequestCustomizerType;
  }

  @JsonProperty("token.request.customizer.type")
  public void setTokenRequestCustomizerType(@Nullable ConfigNodePropertyString tokenRequestCustomizerType) {
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenValidatorType(@Nullable ConfigNodePropertyString authTokenValidatorType) {
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
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties comAdobeGraniteAuthOauthAccesstokenProviderProperties = (ComAdobeGraniteAuthOauthAccesstokenProviderProperties) o;
    return Objects.equals(this.name, comAdobeGraniteAuthOauthAccesstokenProviderProperties.name) &&
        Objects.equals(this.authTokenProviderTitle, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderTitle) &&
        Objects.equals(this.authTokenProviderDefaultClaims, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderDefaultClaims) &&
        Objects.equals(this.authTokenProviderEndpoint, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderEndpoint) &&
        Objects.equals(this.authAccessTokenRequest, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authAccessTokenRequest) &&
        Objects.equals(this.authTokenProviderKeypairAlias, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderKeypairAlias) &&
        Objects.equals(this.authTokenProviderConnTimeout, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderConnTimeout) &&
        Objects.equals(this.authTokenProviderSoTimeout, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderSoTimeout) &&
        Objects.equals(this.authTokenProviderClientId, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderClientId) &&
        Objects.equals(this.authTokenProviderScope, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderScope) &&
        Objects.equals(this.authTokenProviderReuseAccessToken, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderReuseAccessToken) &&
        Objects.equals(this.authTokenProviderRelaxedSsl, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderRelaxedSsl) &&
        Objects.equals(this.tokenRequestCustomizerType, comAdobeGraniteAuthOauthAccesstokenProviderProperties.tokenRequestCustomizerType) &&
        Objects.equals(this.authTokenValidatorType, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenValidatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authTokenProviderTitle, authTokenProviderDefaultClaims, authTokenProviderEndpoint, authAccessTokenRequest, authTokenProviderKeypairAlias, authTokenProviderConnTimeout, authTokenProviderSoTimeout, authTokenProviderClientId, authTokenProviderScope, authTokenProviderReuseAccessToken, authTokenProviderRelaxedSsl, tokenRequestCustomizerType, authTokenValidatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authTokenProviderTitle: ").append(toIndentedString(authTokenProviderTitle)).append("\n");
    sb.append("    authTokenProviderDefaultClaims: ").append(toIndentedString(authTokenProviderDefaultClaims)).append("\n");
    sb.append("    authTokenProviderEndpoint: ").append(toIndentedString(authTokenProviderEndpoint)).append("\n");
    sb.append("    authAccessTokenRequest: ").append(toIndentedString(authAccessTokenRequest)).append("\n");
    sb.append("    authTokenProviderKeypairAlias: ").append(toIndentedString(authTokenProviderKeypairAlias)).append("\n");
    sb.append("    authTokenProviderConnTimeout: ").append(toIndentedString(authTokenProviderConnTimeout)).append("\n");
    sb.append("    authTokenProviderSoTimeout: ").append(toIndentedString(authTokenProviderSoTimeout)).append("\n");
    sb.append("    authTokenProviderClientId: ").append(toIndentedString(authTokenProviderClientId)).append("\n");
    sb.append("    authTokenProviderScope: ").append(toIndentedString(authTokenProviderScope)).append("\n");
    sb.append("    authTokenProviderReuseAccessToken: ").append(toIndentedString(authTokenProviderReuseAccessToken)).append("\n");
    sb.append("    authTokenProviderRelaxedSsl: ").append(toIndentedString(authTokenProviderRelaxedSsl)).append("\n");
    sb.append("    tokenRequestCustomizerType: ").append(toIndentedString(tokenRequestCustomizerType)).append("\n");
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

