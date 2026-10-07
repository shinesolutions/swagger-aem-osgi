package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString osgiHttpWhiteboardListener;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authSudoCookie;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authSudoParameter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean authAnnonymous;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingAuthRequirements;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingAuthAnonymousUser;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingAuthAnonymousPassword;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown authHttp;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authHttpRealm;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray authUriSuffix;
 /**
  * Get osgiHttpWhiteboardContextSelect
  * @return osgiHttpWhiteboardContextSelect
  */
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardContextSelect</code> property.
   */
 public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardContextSelect</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

 /**
  * Get osgiHttpWhiteboardListener
  * @return osgiHttpWhiteboardListener
  */
  @JsonProperty("osgi.http.whiteboard.listener")
  public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardListener</code> property.
   */
 public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardListener</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    return this;
  }

 /**
  * Get authSudoCookie
  * @return authSudoCookie
  */
  @JsonProperty("auth.sudo.cookie")
  public ConfigNodePropertyString getAuthSudoCookie() {
    return authSudoCookie;
  }

  /**
   * Sets the <code>authSudoCookie</code> property.
   */
 public void setAuthSudoCookie(ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
  }

  /**
   * Sets the <code>authSudoCookie</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoCookie(ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
    return this;
  }

 /**
  * Get authSudoParameter
  * @return authSudoParameter
  */
  @JsonProperty("auth.sudo.parameter")
  public ConfigNodePropertyString getAuthSudoParameter() {
    return authSudoParameter;
  }

  /**
   * Sets the <code>authSudoParameter</code> property.
   */
 public void setAuthSudoParameter(ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
  }

  /**
   * Sets the <code>authSudoParameter</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoParameter(ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
    return this;
  }

 /**
  * Get authAnnonymous
  * @return authAnnonymous
  */
  @JsonProperty("auth.annonymous")
  public ConfigNodePropertyBoolean getAuthAnnonymous() {
    return authAnnonymous;
  }

  /**
   * Sets the <code>authAnnonymous</code> property.
   */
 public void setAuthAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
  }

  /**
   * Sets the <code>authAnnonymous</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
    return this;
  }

 /**
  * Get slingAuthRequirements
  * @return slingAuthRequirements
  */
  @JsonProperty("sling.auth.requirements")
  public ConfigNodePropertyArray getSlingAuthRequirements() {
    return slingAuthRequirements;
  }

  /**
   * Sets the <code>slingAuthRequirements</code> property.
   */
 public void setSlingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }

  /**
   * Sets the <code>slingAuthRequirements</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

 /**
  * Get slingAuthAnonymousUser
  * @return slingAuthAnonymousUser
  */
  @JsonProperty("sling.auth.anonymous.user")
  public ConfigNodePropertyString getSlingAuthAnonymousUser() {
    return slingAuthAnonymousUser;
  }

  /**
   * Sets the <code>slingAuthAnonymousUser</code> property.
   */
 public void setSlingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
  }

  /**
   * Sets the <code>slingAuthAnonymousUser</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
    return this;
  }

 /**
  * Get slingAuthAnonymousPassword
  * @return slingAuthAnonymousPassword
  */
  @JsonProperty("sling.auth.anonymous.password")
  public ConfigNodePropertyString getSlingAuthAnonymousPassword() {
    return slingAuthAnonymousPassword;
  }

  /**
   * Sets the <code>slingAuthAnonymousPassword</code> property.
   */
 public void setSlingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
  }

  /**
   * Sets the <code>slingAuthAnonymousPassword</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
    return this;
  }

 /**
  * Get authHttp
  * @return authHttp
  */
  @JsonProperty("auth.http")
  public ConfigNodePropertyDropDown getAuthHttp() {
    return authHttp;
  }

  /**
   * Sets the <code>authHttp</code> property.
   */
 public void setAuthHttp(ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
  }

  /**
   * Sets the <code>authHttp</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttp(ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
    return this;
  }

 /**
  * Get authHttpRealm
  * @return authHttpRealm
  */
  @JsonProperty("auth.http.realm")
  public ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }

  /**
   * Sets the <code>authHttpRealm</code> property.
   */
 public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

  /**
   * Sets the <code>authHttpRealm</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
    return this;
  }

 /**
  * Get authUriSuffix
  * @return authUriSuffix
  */
  @JsonProperty("auth.uri.suffix")
  public ConfigNodePropertyArray getAuthUriSuffix() {
    return authUriSuffix;
  }

  /**
   * Sets the <code>authUriSuffix</code> property.
   */
 public void setAuthUriSuffix(ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
  }

  /**
   * Sets the <code>authUriSuffix</code> property.
   */
  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authUriSuffix(ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties orgApacheSlingEngineImplAuthSlingAuthenticatorProperties = (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties) o;
    return Objects.equals(this.osgiHttpWhiteboardContextSelect, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.osgiHttpWhiteboardContextSelect) &&
        Objects.equals(this.osgiHttpWhiteboardListener, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.osgiHttpWhiteboardListener) &&
        Objects.equals(this.authSudoCookie, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authSudoCookie) &&
        Objects.equals(this.authSudoParameter, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authSudoParameter) &&
        Objects.equals(this.authAnnonymous, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authAnnonymous) &&
        Objects.equals(this.slingAuthRequirements, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.slingAuthRequirements) &&
        Objects.equals(this.slingAuthAnonymousUser, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.slingAuthAnonymousUser) &&
        Objects.equals(this.slingAuthAnonymousPassword, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.slingAuthAnonymousPassword) &&
        Objects.equals(this.authHttp, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authHttp) &&
        Objects.equals(this.authHttpRealm, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authHttpRealm) &&
        Objects.equals(this.authUriSuffix, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authUriSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osgiHttpWhiteboardContextSelect, osgiHttpWhiteboardListener, authSudoCookie, authSudoParameter, authAnnonymous, slingAuthRequirements, slingAuthAnonymousUser, slingAuthAnonymousPassword, authHttp, authHttpRealm, authUriSuffix);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

