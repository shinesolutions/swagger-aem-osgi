package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthProviderProperties   {
  
  private ConfigNodePropertyString oauthConfigId;
  private ConfigNodePropertyString oauthClientId;
  private ConfigNodePropertyString oauthClientSecret;
  private ConfigNodePropertyArray oauthScope;
  private ConfigNodePropertyString oauthConfigProviderId;
  private ConfigNodePropertyBoolean oauthCreateUsers;
  private ConfigNodePropertyString oauthUseridProperty;
  private ConfigNodePropertyBoolean forceStrictUsernameMatching;
  private ConfigNodePropertyBoolean oauthEncodeUserids;
  private ConfigNodePropertyBoolean oauthHashUserids;
  private ConfigNodePropertyString oauthCallBackUrl;
  private ConfigNodePropertyBoolean oauthAccessTokenPersist;
  private ConfigNodePropertyBoolean oauthAccessTokenPersistCookie;
  private ConfigNodePropertyBoolean oauthCsrfStateProtection;
  private ConfigNodePropertyBoolean oauthRedirectRequestParams;
  private ConfigNodePropertyBoolean oauthConfigSiblingsAllow;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.config.siblings.allow")
  public ConfigNodePropertyBoolean getOauthConfigSiblingsAllow() {
    return oauthConfigSiblingsAllow;
  }
  public void setOauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

