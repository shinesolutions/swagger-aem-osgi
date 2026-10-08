package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties   {
  
  private ConfigNodePropertyString path;
  private ConfigNodePropertyArray oauthClientIdsAllowed;
  private ConfigNodePropertyBoolean authBearerSyncIms;
  private ConfigNodePropertyString authTokenRequestParameter;
  private ConfigNodePropertyString oauthBearerConfigid;
  private ConfigNodePropertyBoolean oauthJwtSupport;

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties () {

  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties (ConfigNodePropertyString path, ConfigNodePropertyArray oauthClientIdsAllowed, ConfigNodePropertyBoolean authBearerSyncIms, ConfigNodePropertyString authTokenRequestParameter, ConfigNodePropertyString oauthBearerConfigid, ConfigNodePropertyBoolean oauthJwtSupport) {
    this.path = path;
    this.oauthClientIdsAllowed = oauthClientIdsAllowed;
    this.authBearerSyncIms = authBearerSyncIms;
    this.authTokenRequestParameter = authTokenRequestParameter;
    this.oauthBearerConfigid = oauthBearerConfigid;
    this.oauthJwtSupport = oauthJwtSupport;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("oauth.clientIds.allowed")
  public ConfigNodePropertyArray getOauthClientIdsAllowed() {
    return oauthClientIdsAllowed;
  }
  public void setOauthClientIdsAllowed(ConfigNodePropertyArray oauthClientIdsAllowed) {
    this.oauthClientIdsAllowed = oauthClientIdsAllowed;
  }

    
  @JsonProperty("auth.bearer.sync.ims")
  public ConfigNodePropertyBoolean getAuthBearerSyncIms() {
    return authBearerSyncIms;
  }
  public void setAuthBearerSyncIms(ConfigNodePropertyBoolean authBearerSyncIms) {
    this.authBearerSyncIms = authBearerSyncIms;
  }

    
  @JsonProperty("auth.tokenRequestParameter")
  public ConfigNodePropertyString getAuthTokenRequestParameter() {
    return authTokenRequestParameter;
  }
  public void setAuthTokenRequestParameter(ConfigNodePropertyString authTokenRequestParameter) {
    this.authTokenRequestParameter = authTokenRequestParameter;
  }

    
  @JsonProperty("oauth.bearer.configid")
  public ConfigNodePropertyString getOauthBearerConfigid() {
    return oauthBearerConfigid;
  }
  public void setOauthBearerConfigid(ConfigNodePropertyString oauthBearerConfigid) {
    this.oauthBearerConfigid = oauthBearerConfigid;
  }

    
  @JsonProperty("oauth.jwt.support")
  public ConfigNodePropertyBoolean getOauthJwtSupport() {
    return oauthJwtSupport;
  }
  public void setOauthJwtSupport(ConfigNodePropertyBoolean oauthJwtSupport) {
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
    return Objects.equals(path, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.path) &&
        Objects.equals(oauthClientIdsAllowed, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthClientIdsAllowed) &&
        Objects.equals(authBearerSyncIms, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.authBearerSyncIms) &&
        Objects.equals(authTokenRequestParameter, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.authTokenRequestParameter) &&
        Objects.equals(oauthBearerConfigid, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthBearerConfigid) &&
        Objects.equals(oauthJwtSupport, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthJwtSupport);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
