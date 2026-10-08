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
public class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties   {
  
  private ConfigNodePropertyString path;
  private ConfigNodePropertyArray oauthClientIdsAllowed;
  private ConfigNodePropertyBoolean authBearerSyncIms;
  private ConfigNodePropertyString authTokenRequestParameter;
  private ConfigNodePropertyString oauthBearerConfigid;
  private ConfigNodePropertyBoolean oauthJwtSupport;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.clientIds.allowed")
  public ConfigNodePropertyArray getOauthClientIdsAllowed() {
    return oauthClientIdsAllowed;
  }
  public void setOauthClientIdsAllowed(ConfigNodePropertyArray oauthClientIdsAllowed) {
    this.oauthClientIdsAllowed = oauthClientIdsAllowed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.bearer.sync.ims")
  public ConfigNodePropertyBoolean getAuthBearerSyncIms() {
    return authBearerSyncIms;
  }
  public void setAuthBearerSyncIms(ConfigNodePropertyBoolean authBearerSyncIms) {
    this.authBearerSyncIms = authBearerSyncIms;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.tokenRequestParameter")
  public ConfigNodePropertyString getAuthTokenRequestParameter() {
    return authTokenRequestParameter;
  }
  public void setAuthTokenRequestParameter(ConfigNodePropertyString authTokenRequestParameter) {
    this.authTokenRequestParameter = authTokenRequestParameter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.bearer.configid")
  public ConfigNodePropertyString getOauthBearerConfigid() {
    return oauthBearerConfigid;
  }
  public void setOauthBearerConfigid(ConfigNodePropertyString oauthBearerConfigid) {
    this.oauthBearerConfigid = oauthBearerConfigid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.path, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.path) &&
        Objects.equals(this.oauthClientIdsAllowed, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthClientIdsAllowed) &&
        Objects.equals(this.authBearerSyncIms, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.authBearerSyncIms) &&
        Objects.equals(this.authTokenRequestParameter, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.authTokenRequestParameter) &&
        Objects.equals(this.oauthBearerConfigid, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthBearerConfigid) &&
        Objects.equals(this.oauthJwtSupport, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.oauthJwtSupport);
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

