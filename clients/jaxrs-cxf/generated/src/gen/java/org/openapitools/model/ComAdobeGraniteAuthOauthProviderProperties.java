package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAuthOauthProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthConfigId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthClientId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthClientSecret = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray oauthScope = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthConfigProviderId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthCreateUsers = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthUseridProperty = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean forceStrictUsernameMatching = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthEncodeUserids = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthHashUserids = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthCallBackUrl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthAccessTokenPersist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthAccessTokenPersistCookie = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthCsrfStateProtection = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthRedirectRequestParams = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthConfigSiblingsAllow = null;
 /**
   * Get oauthConfigId
   * @return oauthConfigId
  **/
  @JsonProperty("oauth.config.id")
  public ConfigNodePropertyString getOauthConfigId() {
    return oauthConfigId;
  }

  public void setOauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
    return this;
  }

 /**
   * Get oauthClientId
   * @return oauthClientId
  **/
  @JsonProperty("oauth.client.id")
  public ConfigNodePropertyString getOauthClientId() {
    return oauthClientId;
  }

  public void setOauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }

 /**
   * Get oauthClientSecret
   * @return oauthClientSecret
  **/
  @JsonProperty("oauth.client.secret")
  public ConfigNodePropertyString getOauthClientSecret() {
    return oauthClientSecret;
  }

  public void setOauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
    return this;
  }

 /**
   * Get oauthScope
   * @return oauthScope
  **/
  @JsonProperty("oauth.scope")
  public ConfigNodePropertyArray getOauthScope() {
    return oauthScope;
  }

  public void setOauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
    return this;
  }

 /**
   * Get oauthConfigProviderId
   * @return oauthConfigProviderId
  **/
  @JsonProperty("oauth.config.provider.id")
  public ConfigNodePropertyString getOauthConfigProviderId() {
    return oauthConfigProviderId;
  }

  public void setOauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
    return this;
  }

 /**
   * Get oauthCreateUsers
   * @return oauthCreateUsers
  **/
  @JsonProperty("oauth.create.users")
  public ConfigNodePropertyBoolean getOauthCreateUsers() {
    return oauthCreateUsers;
  }

  public void setOauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
    return this;
  }

 /**
   * Get oauthUseridProperty
   * @return oauthUseridProperty
  **/
  @JsonProperty("oauth.userid.property")
  public ConfigNodePropertyString getOauthUseridProperty() {
    return oauthUseridProperty;
  }

  public void setOauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
    return this;
  }

 /**
   * Get forceStrictUsernameMatching
   * @return forceStrictUsernameMatching
  **/
  @JsonProperty("force.strict.username.matching")
  public ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
    return forceStrictUsernameMatching;
  }

  public void setForceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
  }

  public ComAdobeGraniteAuthOauthProviderProperties forceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
    return this;
  }

 /**
   * Get oauthEncodeUserids
   * @return oauthEncodeUserids
  **/
  @JsonProperty("oauth.encode.userids")
  public ConfigNodePropertyBoolean getOauthEncodeUserids() {
    return oauthEncodeUserids;
  }

  public void setOauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
    return this;
  }

 /**
   * Get oauthHashUserids
   * @return oauthHashUserids
  **/
  @JsonProperty("oauth.hash.userids")
  public ConfigNodePropertyBoolean getOauthHashUserids() {
    return oauthHashUserids;
  }

  public void setOauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
    return this;
  }

 /**
   * Get oauthCallBackUrl
   * @return oauthCallBackUrl
  **/
  @JsonProperty("oauth.callBackUrl")
  public ConfigNodePropertyString getOauthCallBackUrl() {
    return oauthCallBackUrl;
  }

  public void setOauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
    return this;
  }

 /**
   * Get oauthAccessTokenPersist
   * @return oauthAccessTokenPersist
  **/
  @JsonProperty("oauth.access.token.persist")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
    return oauthAccessTokenPersist;
  }

  public void setOauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
    return this;
  }

 /**
   * Get oauthAccessTokenPersistCookie
   * @return oauthAccessTokenPersistCookie
  **/
  @JsonProperty("oauth.access.token.persist.cookie")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
    return oauthAccessTokenPersistCookie;
  }

  public void setOauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
    return this;
  }

 /**
   * Get oauthCsrfStateProtection
   * @return oauthCsrfStateProtection
  **/
  @JsonProperty("oauth.csrf.state.protection")
  public ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
    return oauthCsrfStateProtection;
  }

  public void setOauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
    return this;
  }

 /**
   * Get oauthRedirectRequestParams
   * @return oauthRedirectRequestParams
  **/
  @JsonProperty("oauth.redirect.request.params")
  public ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
    return oauthRedirectRequestParams;
  }

  public void setOauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
    return this;
  }

 /**
   * Get oauthConfigSiblingsAllow
   * @return oauthConfigSiblingsAllow
  **/
  @JsonProperty("oauth.config.siblings.allow")
  public ConfigNodePropertyBoolean getOauthConfigSiblingsAllow() {
    return oauthConfigSiblingsAllow;
  }

  public void setOauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
  }

  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

