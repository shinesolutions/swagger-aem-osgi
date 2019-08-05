package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteAuthOauthProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteAuthOauthProviderProperties   {
  @JsonProperty("oauth.config.id")
  private ConfigNodePropertyString oauthConfigId = null;

  @JsonProperty("oauth.client.id")
  private ConfigNodePropertyString oauthClientId = null;

  @JsonProperty("oauth.client.secret")
  private ConfigNodePropertyString oauthClientSecret = null;

  @JsonProperty("oauth.scope")
  private ConfigNodePropertyArray oauthScope = null;

  @JsonProperty("oauth.config.provider.id")
  private ConfigNodePropertyString oauthConfigProviderId = null;

  @JsonProperty("oauth.create.users")
  private ConfigNodePropertyBoolean oauthCreateUsers = null;

  @JsonProperty("oauth.userid.property")
  private ConfigNodePropertyString oauthUseridProperty = null;

  @JsonProperty("force.strict.username.matching")
  private ConfigNodePropertyBoolean forceStrictUsernameMatching = null;

  @JsonProperty("oauth.encode.userids")
  private ConfigNodePropertyBoolean oauthEncodeUserids = null;

  @JsonProperty("oauth.hash.userids")
  private ConfigNodePropertyBoolean oauthHashUserids = null;

  @JsonProperty("oauth.callBackUrl")
  private ConfigNodePropertyString oauthCallBackUrl = null;

  @JsonProperty("oauth.access.token.persist")
  private ConfigNodePropertyBoolean oauthAccessTokenPersist = null;

  @JsonProperty("oauth.access.token.persist.cookie")
  private ConfigNodePropertyBoolean oauthAccessTokenPersistCookie = null;

  @JsonProperty("oauth.csrf.state.protection")
  private ConfigNodePropertyBoolean oauthCsrfStateProtection = null;

  @JsonProperty("oauth.redirect.request.params")
  private ConfigNodePropertyBoolean oauthRedirectRequestParams = null;

  @JsonProperty("oauth.config.siblings.allow")
  private ConfigNodePropertyBoolean oauthConfigSiblingsAllow = null;

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
    return this;
  }

   /**
   * Get oauthConfigId
   * @return oauthConfigId
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthConfigId() {
    return oauthConfigId;
  }

  public void setOauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }

   /**
   * Get oauthClientId
   * @return oauthClientId
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthClientId() {
    return oauthClientId;
  }

  public void setOauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
    return this;
  }

   /**
   * Get oauthClientSecret
   * @return oauthClientSecret
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthClientSecret() {
    return oauthClientSecret;
  }

  public void setOauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
    return this;
  }

   /**
   * Get oauthScope
   * @return oauthScope
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOauthScope() {
    return oauthScope;
  }

  public void setOauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
    return this;
  }

   /**
   * Get oauthConfigProviderId
   * @return oauthConfigProviderId
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthConfigProviderId() {
    return oauthConfigProviderId;
  }

  public void setOauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
    return this;
  }

   /**
   * Get oauthCreateUsers
   * @return oauthCreateUsers
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthCreateUsers() {
    return oauthCreateUsers;
  }

  public void setOauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
    return this;
  }

   /**
   * Get oauthUseridProperty
   * @return oauthUseridProperty
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthUseridProperty() {
    return oauthUseridProperty;
  }

  public void setOauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
  }

  public ComAdobeGraniteAuthOauthProviderProperties forceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
    return this;
  }

   /**
   * Get forceStrictUsernameMatching
   * @return forceStrictUsernameMatching
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
    return forceStrictUsernameMatching;
  }

  public void setForceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
    return this;
  }

   /**
   * Get oauthEncodeUserids
   * @return oauthEncodeUserids
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthEncodeUserids() {
    return oauthEncodeUserids;
  }

  public void setOauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
    return this;
  }

   /**
   * Get oauthHashUserids
   * @return oauthHashUserids
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthHashUserids() {
    return oauthHashUserids;
  }

  public void setOauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
    return this;
  }

   /**
   * Get oauthCallBackUrl
   * @return oauthCallBackUrl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOauthCallBackUrl() {
    return oauthCallBackUrl;
  }

  public void setOauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
    return this;
  }

   /**
   * Get oauthAccessTokenPersist
   * @return oauthAccessTokenPersist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
    return oauthAccessTokenPersist;
  }

  public void setOauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
    return this;
  }

   /**
   * Get oauthAccessTokenPersistCookie
   * @return oauthAccessTokenPersistCookie
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
    return oauthAccessTokenPersistCookie;
  }

  public void setOauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
    return this;
  }

   /**
   * Get oauthCsrfStateProtection
   * @return oauthCsrfStateProtection
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
    return oauthCsrfStateProtection;
  }

  public void setOauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
    return this;
  }

   /**
   * Get oauthRedirectRequestParams
   * @return oauthRedirectRequestParams
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
    return oauthRedirectRequestParams;
  }

  public void setOauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
    return this;
  }

   /**
   * Get oauthConfigSiblingsAllow
   * @return oauthConfigSiblingsAllow
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOauthConfigSiblingsAllow() {
    return oauthConfigSiblingsAllow;
  }

  public void setOauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

