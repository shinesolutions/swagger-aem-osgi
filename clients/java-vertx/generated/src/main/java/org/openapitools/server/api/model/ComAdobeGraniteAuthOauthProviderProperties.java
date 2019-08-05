package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public ComAdobeGraniteAuthOauthProviderProperties () {

  }

  public ComAdobeGraniteAuthOauthProviderProperties (ConfigNodePropertyString oauthConfigId, ConfigNodePropertyString oauthClientId, ConfigNodePropertyString oauthClientSecret, ConfigNodePropertyArray oauthScope, ConfigNodePropertyString oauthConfigProviderId, ConfigNodePropertyBoolean oauthCreateUsers, ConfigNodePropertyString oauthUseridProperty, ConfigNodePropertyBoolean forceStrictUsernameMatching, ConfigNodePropertyBoolean oauthEncodeUserids, ConfigNodePropertyBoolean oauthHashUserids, ConfigNodePropertyString oauthCallBackUrl, ConfigNodePropertyBoolean oauthAccessTokenPersist, ConfigNodePropertyBoolean oauthAccessTokenPersistCookie, ConfigNodePropertyBoolean oauthCsrfStateProtection, ConfigNodePropertyBoolean oauthRedirectRequestParams, ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
    this.oauthConfigId = oauthConfigId;
    this.oauthClientId = oauthClientId;
    this.oauthClientSecret = oauthClientSecret;
    this.oauthScope = oauthScope;
    this.oauthConfigProviderId = oauthConfigProviderId;
    this.oauthCreateUsers = oauthCreateUsers;
    this.oauthUseridProperty = oauthUseridProperty;
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
    this.oauthEncodeUserids = oauthEncodeUserids;
    this.oauthHashUserids = oauthHashUserids;
    this.oauthCallBackUrl = oauthCallBackUrl;
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
    this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
  }

    
  @JsonProperty("oauth.config.id")
  public ConfigNodePropertyString getOauthConfigId() {
    return oauthConfigId;
  }
  public void setOauthConfigId(ConfigNodePropertyString oauthConfigId) {
    this.oauthConfigId = oauthConfigId;
  }

    
  @JsonProperty("oauth.client.id")
  public ConfigNodePropertyString getOauthClientId() {
    return oauthClientId;
  }
  public void setOauthClientId(ConfigNodePropertyString oauthClientId) {
    this.oauthClientId = oauthClientId;
  }

    
  @JsonProperty("oauth.client.secret")
  public ConfigNodePropertyString getOauthClientSecret() {
    return oauthClientSecret;
  }
  public void setOauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
  }

    
  @JsonProperty("oauth.scope")
  public ConfigNodePropertyArray getOauthScope() {
    return oauthScope;
  }
  public void setOauthScope(ConfigNodePropertyArray oauthScope) {
    this.oauthScope = oauthScope;
  }

    
  @JsonProperty("oauth.config.provider.id")
  public ConfigNodePropertyString getOauthConfigProviderId() {
    return oauthConfigProviderId;
  }
  public void setOauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
    this.oauthConfigProviderId = oauthConfigProviderId;
  }

    
  @JsonProperty("oauth.create.users")
  public ConfigNodePropertyBoolean getOauthCreateUsers() {
    return oauthCreateUsers;
  }
  public void setOauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
    this.oauthCreateUsers = oauthCreateUsers;
  }

    
  @JsonProperty("oauth.userid.property")
  public ConfigNodePropertyString getOauthUseridProperty() {
    return oauthUseridProperty;
  }
  public void setOauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
    this.oauthUseridProperty = oauthUseridProperty;
  }

    
  @JsonProperty("force.strict.username.matching")
  public ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
    return forceStrictUsernameMatching;
  }
  public void setForceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
    this.forceStrictUsernameMatching = forceStrictUsernameMatching;
  }

    
  @JsonProperty("oauth.encode.userids")
  public ConfigNodePropertyBoolean getOauthEncodeUserids() {
    return oauthEncodeUserids;
  }
  public void setOauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
    this.oauthEncodeUserids = oauthEncodeUserids;
  }

    
  @JsonProperty("oauth.hash.userids")
  public ConfigNodePropertyBoolean getOauthHashUserids() {
    return oauthHashUserids;
  }
  public void setOauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
    this.oauthHashUserids = oauthHashUserids;
  }

    
  @JsonProperty("oauth.callBackUrl")
  public ConfigNodePropertyString getOauthCallBackUrl() {
    return oauthCallBackUrl;
  }
  public void setOauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
    this.oauthCallBackUrl = oauthCallBackUrl;
  }

    
  @JsonProperty("oauth.access.token.persist")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
    return oauthAccessTokenPersist;
  }
  public void setOauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
    this.oauthAccessTokenPersist = oauthAccessTokenPersist;
  }

    
  @JsonProperty("oauth.access.token.persist.cookie")
  public ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
    return oauthAccessTokenPersistCookie;
  }
  public void setOauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
    this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
  }

    
  @JsonProperty("oauth.csrf.state.protection")
  public ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
    return oauthCsrfStateProtection;
  }
  public void setOauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
    this.oauthCsrfStateProtection = oauthCsrfStateProtection;
  }

    
  @JsonProperty("oauth.redirect.request.params")
  public ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
    return oauthRedirectRequestParams;
  }
  public void setOauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
    this.oauthRedirectRequestParams = oauthRedirectRequestParams;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
