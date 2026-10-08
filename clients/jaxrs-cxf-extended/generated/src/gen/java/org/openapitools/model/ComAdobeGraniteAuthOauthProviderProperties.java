package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthOauthProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthConfigId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthClientId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthClientSecret;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray oauthScope;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthConfigProviderId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthCreateUsers;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthUseridProperty;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean forceStrictUsernameMatching;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthEncodeUserids;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthHashUserids;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthCallBackUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthAccessTokenPersist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthAccessTokenPersistCookie;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthCsrfStateProtection;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthRedirectRequestParams;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthConfigSiblingsAllow;
 /**
  * Get oauthConfigId
  * @return oauthConfigId
  */
  @JsonProperty("oauth.config.id")
  public ConfigNodePropertyString getOauthConfigId() {
    return oauthConfigId;
  }

  /**
   * Sets the <code>oauthConfigId</code> property.
   */
 public void setOauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
  }

  /**
   * Sets the <code>oauthConfigId</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
    return this;
  }

 /**
  * Get oauthClientId
  * @return oauthClientId
  */
  @JsonProperty("oauth.client.id")
  public ConfigNodePropertyString getOauthClientId() {
    return oauthClientId;
  }

  /**
   * Sets the <code>oauthClientId</code> property.
   */
 public void setOauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
  }

  /**
   * Sets the <code>oauthClientId</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }

 /**
  * Get oauthClientSecret
  * @return oauthClientSecret
  */
  @JsonProperty("oauth.client.secret")
  public ConfigNodePropertyString getOauthClientSecret() {
    return oauthClientSecret;
  }

  /**
   * Sets the <code>oauthClientSecret</code> property.
   */
 public void setOauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
  }

  /**
   * Sets the <code>oauthClientSecret</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
    return this;
  }

 /**
  * Get oauthScope
  * @return oauthScope
  */
  @JsonProperty("oauth.scope")
  public ConfigNodePropertyArray getOauthScope() {
    return oauthScope;
  }

  /**
   * Sets the <code>oauthScope</code> property.
   */
 public void setOauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
  }

  /**
   * Sets the <code>oauthScope</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
    return this;
  }

 /**
  * Get oauthConfigProviderId
  * @return oauthConfigProviderId
  */
  @JsonProperty("oauth.config.provider.id")
  public ConfigNodePropertyString getOauthConfigProviderId() {
    return oauthConfigProviderId;
  }

  /**
   * Sets the <code>oauthConfigProviderId</code> property.
   */
 public void setOauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
  }

  /**
   * Sets the <code>oauthConfigProviderId</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
    return this;
  }

 /**
  * Get oauthCreateUsers
  * @return oauthCreateUsers
  */
  @JsonProperty("oauth.create.users")
  public ConfigNodePropertyBoolean getOauthCreateUsers() {
    return oauthCreateUsers;
  }

  /**
   * Sets the <code>oauthCreateUsers</code> property.
   */
 public void setOauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
  }

  /**
   * Sets the <code>oauthCreateUsers</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
    return this;
  }

 /**
  * Get oauthUseridProperty
  * @return oauthUseridProperty
  */
  @JsonProperty("oauth.userid.property")
  public ConfigNodePropertyString getOauthUseridProperty() {
    return oauthUseridProperty;
  }

  /**
   * Sets the <code>oauthUseridProperty</code> property.
   */
 public void setOauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
  }

  /**
   * Sets the <code>oauthUseridProperty</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
    return this;
  }

 /**
  * Get forceStrictUsernameMatching
  * @return forceStrictUsernameMatching
  */
  @JsonProperty("force.strict.username.matching")
  public ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
    return forceStrictUsernameMatching;
  }

  /**
   * Sets the <code>forceStrictUsernameMatching</code> property.
   */
 public void setForceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
  }

  /**
   * Sets the <code>forceStrictUsernameMatching</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties forceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
    return this;
  }

 /**
  * Get oauthEncodeUserids
  * @return oauthEncodeUserids
  */
  @JsonProperty("oauth.encode.userids")
  public ConfigNodePropertyBoolean getOauthEncodeUserids() {
    return oauthEncodeUserids;
  }

  /**
   * Sets the <code>oauthEncodeUserids</code> property.
   */
 public void setOauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
  }

  /**
   * Sets the <code>oauthEncodeUserids</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
    return this;
  }

 /**
  * Get oauthHashUserids
  * @return oauthHashUserids
  */
  @JsonProperty("oauth.hash.userids")
  public ConfigNodePropertyBoolean getOauthHashUserids() {
    return oauthHashUserids;
  }

  /**
   * Sets the <code>oauthHashUserids</code> property.
   */
 public void setOauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
  }

  /**
   * Sets the <code>oauthHashUserids</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
    return this;
  }

 /**
  * Get oauthCallBackUrl
  * @return oauthCallBackUrl
  */
  @JsonProperty("oauth.callBackUrl")
  public ConfigNodePropertyString getOauthCallBackUrl() {
    return oauthCallBackUrl;
  }

  /**
   * Sets the <code>oauthCallBackUrl</code> property.
   */
 public void setOauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
  }

  /**
   * Sets the <code>oauthCallBackUrl</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
    return this;
  }

 /**
  * Get oauthAccessTokenPersist
  * @return oauthAccessTokenPersist
  */
  @JsonProperty("oauth.access.token.persist")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
    return oauthAccessTokenPersist;
  }

  /**
   * Sets the <code>oauthAccessTokenPersist</code> property.
   */
 public void setOauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
  }

  /**
   * Sets the <code>oauthAccessTokenPersist</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
    return this;
  }

 /**
  * Get oauthAccessTokenPersistCookie
  * @return oauthAccessTokenPersistCookie
  */
  @JsonProperty("oauth.access.token.persist.cookie")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
    return oauthAccessTokenPersistCookie;
  }

  /**
   * Sets the <code>oauthAccessTokenPersistCookie</code> property.
   */
 public void setOauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
  }

  /**
   * Sets the <code>oauthAccessTokenPersistCookie</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
    return this;
  }

 /**
  * Get oauthCsrfStateProtection
  * @return oauthCsrfStateProtection
  */
  @JsonProperty("oauth.csrf.state.protection")
  public ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
    return oauthCsrfStateProtection;
  }

  /**
   * Sets the <code>oauthCsrfStateProtection</code> property.
   */
 public void setOauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
  }

  /**
   * Sets the <code>oauthCsrfStateProtection</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
    return this;
  }

 /**
  * Get oauthRedirectRequestParams
  * @return oauthRedirectRequestParams
  */
  @JsonProperty("oauth.redirect.request.params")
  public ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
    return oauthRedirectRequestParams;
  }

  /**
   * Sets the <code>oauthRedirectRequestParams</code> property.
   */
 public void setOauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
  }

  /**
   * Sets the <code>oauthRedirectRequestParams</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
    return this;
  }

 /**
  * Get oauthConfigSiblingsAllow
  * @return oauthConfigSiblingsAllow
  */
  @JsonProperty("oauth.config.siblings.allow")
  public ConfigNodePropertyBoolean getOauthConfigSiblingsAllow() {
    return oauthConfigSiblingsAllow;
  }

  /**
   * Sets the <code>oauthConfigSiblingsAllow</code> property.
   */
 public void setOauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
  }

  /**
   * Sets the <code>oauthConfigSiblingsAllow</code> property.
   */
  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

