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
 * ComAdobeGraniteAuthOauthProviderProperties
 */

@JsonTypeName("comAdobeGraniteAuthOauthProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthConfigId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthClientId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthClientSecret;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray oauthScope;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthConfigProviderId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthCreateUsers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthUseridProperty;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean forceStrictUsernameMatching;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthEncodeUserids;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthHashUserids;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString oauthCallBackUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthAccessTokenPersist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthAccessTokenPersistCookie;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthCsrfStateProtection;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthRedirectRequestParams;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean oauthConfigSiblingsAllow;

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigId(@Nullable ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
    return this;
  }

  /**
   * Get oauthConfigId
   * @return oauthConfigId
   */
  @Valid 
  @Schema(name = "oauth.config.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.config.id")
  public @Nullable ConfigNodePropertyString getOauthConfigId() {
    return oauthConfigId;
  }

  @JsonProperty("oauth.config.id")
  public void setOauthConfigId(@Nullable ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthClientId(@Nullable ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }

  /**
   * Get oauthClientId
   * @return oauthClientId
   */
  @Valid 
  @Schema(name = "oauth.client.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.client.id")
  public @Nullable ConfigNodePropertyString getOauthClientId() {
    return oauthClientId;
  }

  @JsonProperty("oauth.client.id")
  public void setOauthClientId(@Nullable ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthClientSecret(@Nullable ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
    return this;
  }

  /**
   * Get oauthClientSecret
   * @return oauthClientSecret
   */
  @Valid 
  @Schema(name = "oauth.client.secret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.client.secret")
  public @Nullable ConfigNodePropertyString getOauthClientSecret() {
    return oauthClientSecret;
  }

  @JsonProperty("oauth.client.secret")
  public void setOauthClientSecret(@Nullable ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthScope(@Nullable ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
    return this;
  }

  /**
   * Get oauthScope
   * @return oauthScope
   */
  @Valid 
  @Schema(name = "oauth.scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.scope")
  public @Nullable ConfigNodePropertyArray getOauthScope() {
    return oauthScope;
  }

  @JsonProperty("oauth.scope")
  public void setOauthScope(@Nullable ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigProviderId(@Nullable ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
    return this;
  }

  /**
   * Get oauthConfigProviderId
   * @return oauthConfigProviderId
   */
  @Valid 
  @Schema(name = "oauth.config.provider.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.config.provider.id")
  public @Nullable ConfigNodePropertyString getOauthConfigProviderId() {
    return oauthConfigProviderId;
  }

  @JsonProperty("oauth.config.provider.id")
  public void setOauthConfigProviderId(@Nullable ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCreateUsers(@Nullable ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
    return this;
  }

  /**
   * Get oauthCreateUsers
   * @return oauthCreateUsers
   */
  @Valid 
  @Schema(name = "oauth.create.users", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.create.users")
  public @Nullable ConfigNodePropertyBoolean getOauthCreateUsers() {
    return oauthCreateUsers;
  }

  @JsonProperty("oauth.create.users")
  public void setOauthCreateUsers(@Nullable ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthUseridProperty(@Nullable ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
    return this;
  }

  /**
   * Get oauthUseridProperty
   * @return oauthUseridProperty
   */
  @Valid 
  @Schema(name = "oauth.userid.property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.userid.property")
  public @Nullable ConfigNodePropertyString getOauthUseridProperty() {
    return oauthUseridProperty;
  }

  @JsonProperty("oauth.userid.property")
  public void setOauthUseridProperty(@Nullable ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
  }

  public ComAdobeGraniteAuthOauthProviderProperties forceStrictUsernameMatching(@Nullable ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
    return this;
  }

  /**
   * Get forceStrictUsernameMatching
   * @return forceStrictUsernameMatching
   */
  @Valid 
  @Schema(name = "force.strict.username.matching", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("force.strict.username.matching")
  public @Nullable ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
    return forceStrictUsernameMatching;
  }

  @JsonProperty("force.strict.username.matching")
  public void setForceStrictUsernameMatching(@Nullable ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthEncodeUserids(@Nullable ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
    return this;
  }

  /**
   * Get oauthEncodeUserids
   * @return oauthEncodeUserids
   */
  @Valid 
  @Schema(name = "oauth.encode.userids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.encode.userids")
  public @Nullable ConfigNodePropertyBoolean getOauthEncodeUserids() {
    return oauthEncodeUserids;
  }

  @JsonProperty("oauth.encode.userids")
  public void setOauthEncodeUserids(@Nullable ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthHashUserids(@Nullable ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
    return this;
  }

  /**
   * Get oauthHashUserids
   * @return oauthHashUserids
   */
  @Valid 
  @Schema(name = "oauth.hash.userids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.hash.userids")
  public @Nullable ConfigNodePropertyBoolean getOauthHashUserids() {
    return oauthHashUserids;
  }

  @JsonProperty("oauth.hash.userids")
  public void setOauthHashUserids(@Nullable ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCallBackUrl(@Nullable ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
    return this;
  }

  /**
   * Get oauthCallBackUrl
   * @return oauthCallBackUrl
   */
  @Valid 
  @Schema(name = "oauth.callBackUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.callBackUrl")
  public @Nullable ConfigNodePropertyString getOauthCallBackUrl() {
    return oauthCallBackUrl;
  }

  @JsonProperty("oauth.callBackUrl")
  public void setOauthCallBackUrl(@Nullable ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersist(@Nullable ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
    return this;
  }

  /**
   * Get oauthAccessTokenPersist
   * @return oauthAccessTokenPersist
   */
  @Valid 
  @Schema(name = "oauth.access.token.persist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.access.token.persist")
  public @Nullable ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
    return oauthAccessTokenPersist;
  }

  @JsonProperty("oauth.access.token.persist")
  public void setOauthAccessTokenPersist(@Nullable ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersistCookie(@Nullable ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
    return this;
  }

  /**
   * Get oauthAccessTokenPersistCookie
   * @return oauthAccessTokenPersistCookie
   */
  @Valid 
  @Schema(name = "oauth.access.token.persist.cookie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.access.token.persist.cookie")
  public @Nullable ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
    return oauthAccessTokenPersistCookie;
  }

  @JsonProperty("oauth.access.token.persist.cookie")
  public void setOauthAccessTokenPersistCookie(@Nullable ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCsrfStateProtection(@Nullable ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
    return this;
  }

  /**
   * Get oauthCsrfStateProtection
   * @return oauthCsrfStateProtection
   */
  @Valid 
  @Schema(name = "oauth.csrf.state.protection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.csrf.state.protection")
  public @Nullable ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
    return oauthCsrfStateProtection;
  }

  @JsonProperty("oauth.csrf.state.protection")
  public void setOauthCsrfStateProtection(@Nullable ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthRedirectRequestParams(@Nullable ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
    return this;
  }

  /**
   * Get oauthRedirectRequestParams
   * @return oauthRedirectRequestParams
   */
  @Valid 
  @Schema(name = "oauth.redirect.request.params", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.redirect.request.params")
  public @Nullable ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
    return oauthRedirectRequestParams;
  }

  @JsonProperty("oauth.redirect.request.params")
  public void setOauthRedirectRequestParams(@Nullable ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigSiblingsAllow(@Nullable ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
    return this;
  }

  /**
   * Get oauthConfigSiblingsAllow
   * @return oauthConfigSiblingsAllow
   */
  @Valid 
  @Schema(name = "oauth.config.siblings.allow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth.config.siblings.allow")
  public @Nullable ConfigNodePropertyBoolean getOauthConfigSiblingsAllow() {
    return oauthConfigSiblingsAllow;
  }

  @JsonProperty("oauth.config.siblings.allow")
  public void setOauthConfigSiblingsAllow(@Nullable ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthProviderProperties comAdobeGraniteAuthOauthProviderProperties = (ComAdobeGraniteAuthOauthProviderProperties) o;
    return Objects.equals(this.oauthConfigId, comAdobeGraniteAuthOauthProviderProperties.oauthConfigId) &&
        Objects.equals(this.oauthClientId, comAdobeGraniteAuthOauthProviderProperties.oauthClientId) &&
        Objects.equals(this.oauthClientSecret, comAdobeGraniteAuthOauthProviderProperties.oauthClientSecret) &&
        Objects.equals(this.oauthScope, comAdobeGraniteAuthOauthProviderProperties.oauthScope) &&
        Objects.equals(this.oauthConfigProviderId, comAdobeGraniteAuthOauthProviderProperties.oauthConfigProviderId) &&
        Objects.equals(this.oauthCreateUsers, comAdobeGraniteAuthOauthProviderProperties.oauthCreateUsers) &&
        Objects.equals(this.oauthUseridProperty, comAdobeGraniteAuthOauthProviderProperties.oauthUseridProperty) &&
        Objects.equals(this.forceStrictUsernameMatching, comAdobeGraniteAuthOauthProviderProperties.forceStrictUsernameMatching) &&
        Objects.equals(this.oauthEncodeUserids, comAdobeGraniteAuthOauthProviderProperties.oauthEncodeUserids) &&
        Objects.equals(this.oauthHashUserids, comAdobeGraniteAuthOauthProviderProperties.oauthHashUserids) &&
        Objects.equals(this.oauthCallBackUrl, comAdobeGraniteAuthOauthProviderProperties.oauthCallBackUrl) &&
        Objects.equals(this.oauthAccessTokenPersist, comAdobeGraniteAuthOauthProviderProperties.oauthAccessTokenPersist) &&
        Objects.equals(this.oauthAccessTokenPersistCookie, comAdobeGraniteAuthOauthProviderProperties.oauthAccessTokenPersistCookie) &&
        Objects.equals(this.oauthCsrfStateProtection, comAdobeGraniteAuthOauthProviderProperties.oauthCsrfStateProtection) &&
        Objects.equals(this.oauthRedirectRequestParams, comAdobeGraniteAuthOauthProviderProperties.oauthRedirectRequestParams) &&
        Objects.equals(this.oauthConfigSiblingsAllow, comAdobeGraniteAuthOauthProviderProperties.oauthConfigSiblingsAllow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthConfigId, oauthClientId, oauthClientSecret, oauthScope, oauthConfigProviderId, oauthCreateUsers, oauthUseridProperty, forceStrictUsernameMatching, oauthEncodeUserids, oauthHashUserids, oauthCallBackUrl, oauthAccessTokenPersist, oauthAccessTokenPersistCookie, oauthCsrfStateProtection, oauthRedirectRequestParams, oauthConfigSiblingsAllow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthProviderProperties {\n");
    sb.append("    oauthConfigId: ").append(toIndentedString(oauthConfigId)).append("\n");
    sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
    sb.append("    oauthClientSecret: ").append(toIndentedString(oauthClientSecret)).append("\n");
    sb.append("    oauthScope: ").append(toIndentedString(oauthScope)).append("\n");
    sb.append("    oauthConfigProviderId: ").append(toIndentedString(oauthConfigProviderId)).append("\n");
    sb.append("    oauthCreateUsers: ").append(toIndentedString(oauthCreateUsers)).append("\n");
    sb.append("    oauthUseridProperty: ").append(toIndentedString(oauthUseridProperty)).append("\n");
    sb.append("    forceStrictUsernameMatching: ").append(toIndentedString(forceStrictUsernameMatching)).append("\n");
    sb.append("    oauthEncodeUserids: ").append(toIndentedString(oauthEncodeUserids)).append("\n");
    sb.append("    oauthHashUserids: ").append(toIndentedString(oauthHashUserids)).append("\n");
    sb.append("    oauthCallBackUrl: ").append(toIndentedString(oauthCallBackUrl)).append("\n");
    sb.append("    oauthAccessTokenPersist: ").append(toIndentedString(oauthAccessTokenPersist)).append("\n");
    sb.append("    oauthAccessTokenPersistCookie: ").append(toIndentedString(oauthAccessTokenPersistCookie)).append("\n");
    sb.append("    oauthCsrfStateProtection: ").append(toIndentedString(oauthCsrfStateProtection)).append("\n");
    sb.append("    oauthRedirectRequestParams: ").append(toIndentedString(oauthRedirectRequestParams)).append("\n");
    sb.append("    oauthConfigSiblingsAllow: ").append(toIndentedString(oauthConfigSiblingsAllow)).append("\n");
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

