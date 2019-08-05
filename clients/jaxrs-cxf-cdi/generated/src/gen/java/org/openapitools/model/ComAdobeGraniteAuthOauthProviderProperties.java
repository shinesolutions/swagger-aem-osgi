package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteAuthOauthProviderProperties   {
  
  private ConfigNodePropertyString oauthConfigId = null;

  private ConfigNodePropertyString oauthClientId = null;

  private ConfigNodePropertyString oauthClientSecret = null;

  private ConfigNodePropertyArray oauthScope = null;

  private ConfigNodePropertyString oauthConfigProviderId = null;

  private ConfigNodePropertyBoolean oauthCreateUsers = null;

  private ConfigNodePropertyString oauthUseridProperty = null;

  private ConfigNodePropertyBoolean forceStrictUsernameMatching = null;

  private ConfigNodePropertyBoolean oauthEncodeUserids = null;

  private ConfigNodePropertyBoolean oauthHashUserids = null;

  private ConfigNodePropertyString oauthCallBackUrl = null;

  private ConfigNodePropertyBoolean oauthAccessTokenPersist = null;

  private ConfigNodePropertyBoolean oauthAccessTokenPersistCookie = null;

  private ConfigNodePropertyBoolean oauthCsrfStateProtection = null;

  private ConfigNodePropertyBoolean oauthRedirectRequestParams = null;

  private ConfigNodePropertyBoolean oauthConfigSiblingsAllow = null;


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.config.id")
  public ConfigNodePropertyString getOauthConfigId() {
    return oauthConfigId;
  }
  public void setOauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.client.id")
  public ConfigNodePropertyString getOauthClientId() {
    return oauthClientId;
  }
  public void setOauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.client.secret")
  public ConfigNodePropertyString getOauthClientSecret() {
    return oauthClientSecret;
  }
  public void setOauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.scope")
  public ConfigNodePropertyArray getOauthScope() {
    return oauthScope;
  }
  public void setOauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.config.provider.id")
  public ConfigNodePropertyString getOauthConfigProviderId() {
    return oauthConfigProviderId;
  }
  public void setOauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.create.users")
  public ConfigNodePropertyBoolean getOauthCreateUsers() {
    return oauthCreateUsers;
  }
  public void setOauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.userid.property")
  public ConfigNodePropertyString getOauthUseridProperty() {
    return oauthUseridProperty;
  }
  public void setOauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties forceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("force.strict.username.matching")
  public ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
    return forceStrictUsernameMatching;
  }
  public void setForceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.encode.userids")
  public ConfigNodePropertyBoolean getOauthEncodeUserids() {
    return oauthEncodeUserids;
  }
  public void setOauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.hash.userids")
  public ConfigNodePropertyBoolean getOauthHashUserids() {
    return oauthHashUserids;
  }
  public void setOauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.callBackUrl")
  public ConfigNodePropertyString getOauthCallBackUrl() {
    return oauthCallBackUrl;
  }
  public void setOauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.access.token.persist")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
    return oauthAccessTokenPersist;
  }
  public void setOauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.access.token.persist.cookie")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
    return oauthAccessTokenPersistCookie;
  }
  public void setOauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.csrf.state.protection")
  public ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
    return oauthCsrfStateProtection;
  }
  public void setOauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.redirect.request.params")
  public ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
    return oauthRedirectRequestParams;
  }
  public void setOauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
  }


  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.config.siblings.allow")
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
    return Objects.equals(oauthConfigId, comAdobeGraniteAuthOauthProviderProperties.oauthConfigId) &&
        Objects.equals(oauthClientId, comAdobeGraniteAuthOauthProviderProperties.oauthClientId) &&
        Objects.equals(oauthClientSecret, comAdobeGraniteAuthOauthProviderProperties.oauthClientSecret) &&
        Objects.equals(oauthScope, comAdobeGraniteAuthOauthProviderProperties.oauthScope) &&
        Objects.equals(oauthConfigProviderId, comAdobeGraniteAuthOauthProviderProperties.oauthConfigProviderId) &&
        Objects.equals(oauthCreateUsers, comAdobeGraniteAuthOauthProviderProperties.oauthCreateUsers) &&
        Objects.equals(oauthUseridProperty, comAdobeGraniteAuthOauthProviderProperties.oauthUseridProperty) &&
        Objects.equals(forceStrictUsernameMatching, comAdobeGraniteAuthOauthProviderProperties.forceStrictUsernameMatching) &&
        Objects.equals(oauthEncodeUserids, comAdobeGraniteAuthOauthProviderProperties.oauthEncodeUserids) &&
        Objects.equals(oauthHashUserids, comAdobeGraniteAuthOauthProviderProperties.oauthHashUserids) &&
        Objects.equals(oauthCallBackUrl, comAdobeGraniteAuthOauthProviderProperties.oauthCallBackUrl) &&
        Objects.equals(oauthAccessTokenPersist, comAdobeGraniteAuthOauthProviderProperties.oauthAccessTokenPersist) &&
        Objects.equals(oauthAccessTokenPersistCookie, comAdobeGraniteAuthOauthProviderProperties.oauthAccessTokenPersistCookie) &&
        Objects.equals(oauthCsrfStateProtection, comAdobeGraniteAuthOauthProviderProperties.oauthCsrfStateProtection) &&
        Objects.equals(oauthRedirectRequestParams, comAdobeGraniteAuthOauthProviderProperties.oauthRedirectRequestParams) &&
        Objects.equals(oauthConfigSiblingsAllow, comAdobeGraniteAuthOauthProviderProperties.oauthConfigSiblingsAllow);
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

