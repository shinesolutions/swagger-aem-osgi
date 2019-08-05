package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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

public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString osgiHttpWhiteboardListener = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString authSudoCookie = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString authSudoParameter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean authAnnonymous = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray slingAuthRequirements = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingAuthAnonymousUser = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingAuthAnonymousPassword = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown authHttp = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString authHttpRealm = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray authUriSuffix = null;
 /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
  **/
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

 /**
   * Get osgiHttpWhiteboardListener
   * @return osgiHttpWhiteboardListener
  **/
  @JsonProperty("osgi.http.whiteboard.listener")
  public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }

  public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    return this;
  }

 /**
   * Get authSudoCookie
   * @return authSudoCookie
  **/
  @JsonProperty("auth.sudo.cookie")
  public ConfigNodePropertyString getAuthSudoCookie() {
    return authSudoCookie;
  }

  public void setAuthSudoCookie(ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoCookie(ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
    return this;
  }

 /**
   * Get authSudoParameter
   * @return authSudoParameter
  **/
  @JsonProperty("auth.sudo.parameter")
  public ConfigNodePropertyString getAuthSudoParameter() {
    return authSudoParameter;
  }

  public void setAuthSudoParameter(ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoParameter(ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
    return this;
  }

 /**
   * Get authAnnonymous
   * @return authAnnonymous
  **/
  @JsonProperty("auth.annonymous")
  public ConfigNodePropertyBoolean getAuthAnnonymous() {
    return authAnnonymous;
  }

  public void setAuthAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
    return this;
  }

 /**
   * Get slingAuthRequirements
   * @return slingAuthRequirements
  **/
  @JsonProperty("sling.auth.requirements")
  public ConfigNodePropertyArray getSlingAuthRequirements() {
    return slingAuthRequirements;
  }

  public void setSlingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

 /**
   * Get slingAuthAnonymousUser
   * @return slingAuthAnonymousUser
  **/
  @JsonProperty("sling.auth.anonymous.user")
  public ConfigNodePropertyString getSlingAuthAnonymousUser() {
    return slingAuthAnonymousUser;
  }

  public void setSlingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
    return this;
  }

 /**
   * Get slingAuthAnonymousPassword
   * @return slingAuthAnonymousPassword
  **/
  @JsonProperty("sling.auth.anonymous.password")
  public ConfigNodePropertyString getSlingAuthAnonymousPassword() {
    return slingAuthAnonymousPassword;
  }

  public void setSlingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
    return this;
  }

 /**
   * Get authHttp
   * @return authHttp
  **/
  @JsonProperty("auth.http")
  public ConfigNodePropertyDropDown getAuthHttp() {
    return authHttp;
  }

  public void setAuthHttp(ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttp(ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
    return this;
  }

 /**
   * Get authHttpRealm
   * @return authHttpRealm
  **/
  @JsonProperty("auth.http.realm")
  public ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }

  public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
    return this;
  }

 /**
   * Get authUriSuffix
   * @return authUriSuffix
  **/
  @JsonProperty("auth.uri.suffix")
  public ConfigNodePropertyArray getAuthUriSuffix() {
    return authUriSuffix;
  }

  public void setAuthUriSuffix(ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authUriSuffix(ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {\n");
    
    sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
    sb.append("    osgiHttpWhiteboardListener: ").append(toIndentedString(osgiHttpWhiteboardListener)).append("\n");
    sb.append("    authSudoCookie: ").append(toIndentedString(authSudoCookie)).append("\n");
    sb.append("    authSudoParameter: ").append(toIndentedString(authSudoParameter)).append("\n");
    sb.append("    authAnnonymous: ").append(toIndentedString(authAnnonymous)).append("\n");
    sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
    sb.append("    slingAuthAnonymousUser: ").append(toIndentedString(slingAuthAnonymousUser)).append("\n");
    sb.append("    slingAuthAnonymousPassword: ").append(toIndentedString(slingAuthAnonymousPassword)).append("\n");
    sb.append("    authHttp: ").append(toIndentedString(authHttp)).append("\n");
    sb.append("    authHttpRealm: ").append(toIndentedString(authHttpRealm)).append("\n");
    sb.append("    authUriSuffix: ").append(toIndentedString(authUriSuffix)).append("\n");
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

