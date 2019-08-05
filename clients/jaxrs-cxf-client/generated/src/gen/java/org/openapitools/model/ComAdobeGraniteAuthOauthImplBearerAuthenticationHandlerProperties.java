package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray oauthClientIdsAllowed = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean authBearerSyncIms = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString authTokenRequestParameter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString oauthBearerConfigid = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean oauthJwtSupport = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get oauthClientIdsAllowed
   * @return oauthClientIdsAllowed
  **/
  @JsonProperty("oauth.clientIds.allowed")
  public ConfigNodePropertyArray getOauthClientIdsAllowed() {
    return oauthClientIdsAllowed;
  }

  public void setOauthClientIdsAllowed(ConfigNodePropertyArray oauthClientIdsAllowed) {
    this.oauthClientIdsAllowed = oauthClientIdsAllowed;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties oauthClientIdsAllowed(ConfigNodePropertyArray oauthClientIdsAllowed) {
    this.oauthClientIdsAllowed = oauthClientIdsAllowed;
    return this;
  }

 /**
   * Get authBearerSyncIms
   * @return authBearerSyncIms
  **/
  @JsonProperty("auth.bearer.sync.ims")
  public ConfigNodePropertyBoolean getAuthBearerSyncIms() {
    return authBearerSyncIms;
  }

  public void setAuthBearerSyncIms(ConfigNodePropertyBoolean authBearerSyncIms) {
    this.authBearerSyncIms = authBearerSyncIms;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties authBearerSyncIms(ConfigNodePropertyBoolean authBearerSyncIms) {
    this.authBearerSyncIms = authBearerSyncIms;
    return this;
  }

 /**
   * Get authTokenRequestParameter
   * @return authTokenRequestParameter
  **/
  @JsonProperty("auth.tokenRequestParameter")
  public ConfigNodePropertyString getAuthTokenRequestParameter() {
    return authTokenRequestParameter;
  }

  public void setAuthTokenRequestParameter(ConfigNodePropertyString authTokenRequestParameter) {
    this.authTokenRequestParameter = authTokenRequestParameter;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties authTokenRequestParameter(ConfigNodePropertyString authTokenRequestParameter) {
    this.authTokenRequestParameter = authTokenRequestParameter;
    return this;
  }

 /**
   * Get oauthBearerConfigid
   * @return oauthBearerConfigid
  **/
  @JsonProperty("oauth.bearer.configid")
  public ConfigNodePropertyString getOauthBearerConfigid() {
    return oauthBearerConfigid;
  }

  public void setOauthBearerConfigid(ConfigNodePropertyString oauthBearerConfigid) {
    this.oauthBearerConfigid = oauthBearerConfigid;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties oauthBearerConfigid(ConfigNodePropertyString oauthBearerConfigid) {
    this.oauthBearerConfigid = oauthBearerConfigid;
    return this;
  }

 /**
   * Get oauthJwtSupport
   * @return oauthJwtSupport
  **/
  @JsonProperty("oauth.jwt.support")
  public ConfigNodePropertyBoolean getOauthJwtSupport() {
    return oauthJwtSupport;
  }

  public void setOauthJwtSupport(ConfigNodePropertyBoolean oauthJwtSupport) {
    this.oauthJwtSupport = oauthJwtSupport;
  }

  public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties oauthJwtSupport(ConfigNodePropertyBoolean oauthJwtSupport) {
    this.oauthJwtSupport = oauthJwtSupport;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

