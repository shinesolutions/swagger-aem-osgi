package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteAuthOauthProviderProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public ComAdobeGraniteAuthOauthProviderProperties() {
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthProviderProperties oauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.config.id")
  @Valid public ConfigNodePropertyString getOauthConfigId() {
    return oauthConfigId;
  }

  @JsonProperty("oauth.config.id")
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
  @Valid public ConfigNodePropertyString getOauthClientId() {
    return oauthClientId;
  }

  @JsonProperty("oauth.client.id")
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
  @Valid public ConfigNodePropertyString getOauthClientSecret() {
    return oauthClientSecret;
  }

  @JsonProperty("oauth.client.secret")
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
  @Valid public ConfigNodePropertyArray getOauthScope() {
    return oauthScope;
  }

  @JsonProperty("oauth.scope")
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
  @Valid public ConfigNodePropertyString getOauthConfigProviderId() {
    return oauthConfigProviderId;
  }

  @JsonProperty("oauth.config.provider.id")
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
  @Valid public ConfigNodePropertyBoolean getOauthCreateUsers() {
    return oauthCreateUsers;
  }

  @JsonProperty("oauth.create.users")
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
  @Valid public ConfigNodePropertyString getOauthUseridProperty() {
    return oauthUseridProperty;
  }

  @JsonProperty("oauth.userid.property")
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
  @Valid public ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
    return forceStrictUsernameMatching;
  }

  @JsonProperty("force.strict.username.matching")
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
  @Valid public ConfigNodePropertyBoolean getOauthEncodeUserids() {
    return oauthEncodeUserids;
  }

  @JsonProperty("oauth.encode.userids")
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
  @Valid public ConfigNodePropertyBoolean getOauthHashUserids() {
    return oauthHashUserids;
  }

  @JsonProperty("oauth.hash.userids")
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
  @Valid public ConfigNodePropertyString getOauthCallBackUrl() {
    return oauthCallBackUrl;
  }

  @JsonProperty("oauth.callBackUrl")
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
  @Valid public ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
    return oauthAccessTokenPersist;
  }

  @JsonProperty("oauth.access.token.persist")
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
  @Valid public ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
    return oauthAccessTokenPersistCookie;
  }

  @JsonProperty("oauth.access.token.persist.cookie")
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
  @Valid public ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
    return oauthCsrfStateProtection;
  }

  @JsonProperty("oauth.csrf.state.protection")
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
  @Valid public ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
    return oauthRedirectRequestParams;
  }

  @JsonProperty("oauth.redirect.request.params")
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
  @Valid public ConfigNodePropertyBoolean getOauthConfigSiblingsAllow() {
    return oauthConfigSiblingsAllow;
  }

  @JsonProperty("oauth.config.siblings.allow")
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
