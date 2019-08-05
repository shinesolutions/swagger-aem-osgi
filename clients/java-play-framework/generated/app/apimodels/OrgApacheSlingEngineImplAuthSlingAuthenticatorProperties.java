package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties   {
  @JsonProperty("osgi.http.whiteboard.context.select")
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  @JsonProperty("osgi.http.whiteboard.listener")
  private ConfigNodePropertyString osgiHttpWhiteboardListener = null;

  @JsonProperty("auth.sudo.cookie")
  private ConfigNodePropertyString authSudoCookie = null;

  @JsonProperty("auth.sudo.parameter")
  private ConfigNodePropertyString authSudoParameter = null;

  @JsonProperty("auth.annonymous")
  private ConfigNodePropertyBoolean authAnnonymous = null;

  @JsonProperty("sling.auth.requirements")
  private ConfigNodePropertyArray slingAuthRequirements = null;

  @JsonProperty("sling.auth.anonymous.user")
  private ConfigNodePropertyString slingAuthAnonymousUser = null;

  @JsonProperty("sling.auth.anonymous.password")
  private ConfigNodePropertyString slingAuthAnonymousPassword = null;

  @JsonProperty("auth.http")
  private ConfigNodePropertyDropDown authHttp = null;

  @JsonProperty("auth.http.realm")
  private ConfigNodePropertyString authHttpRealm = null;

  @JsonProperty("auth.uri.suffix")
  private ConfigNodePropertyArray authUriSuffix = null;

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

   /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
  **/
  @Valid
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    return this;
  }

   /**
   * Get osgiHttpWhiteboardListener
   * @return osgiHttpWhiteboardListener
  **/
  @Valid
  public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }

  public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoCookie(ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
    return this;
  }

   /**
   * Get authSudoCookie
   * @return authSudoCookie
  **/
  @Valid
  public ConfigNodePropertyString getAuthSudoCookie() {
    return authSudoCookie;
  }

  public void setAuthSudoCookie(ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoParameter(ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
    return this;
  }

   /**
   * Get authSudoParameter
   * @return authSudoParameter
  **/
  @Valid
  public ConfigNodePropertyString getAuthSudoParameter() {
    return authSudoParameter;
  }

  public void setAuthSudoParameter(ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
    return this;
  }

   /**
   * Get authAnnonymous
   * @return authAnnonymous
  **/
  @Valid
  public ConfigNodePropertyBoolean getAuthAnnonymous() {
    return authAnnonymous;
  }

  public void setAuthAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

   /**
   * Get slingAuthRequirements
   * @return slingAuthRequirements
  **/
  @Valid
  public ConfigNodePropertyArray getSlingAuthRequirements() {
    return slingAuthRequirements;
  }

  public void setSlingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
    return this;
  }

   /**
   * Get slingAuthAnonymousUser
   * @return slingAuthAnonymousUser
  **/
  @Valid
  public ConfigNodePropertyString getSlingAuthAnonymousUser() {
    return slingAuthAnonymousUser;
  }

  public void setSlingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
    return this;
  }

   /**
   * Get slingAuthAnonymousPassword
   * @return slingAuthAnonymousPassword
  **/
  @Valid
  public ConfigNodePropertyString getSlingAuthAnonymousPassword() {
    return slingAuthAnonymousPassword;
  }

  public void setSlingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttp(ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
    return this;
  }

   /**
   * Get authHttp
   * @return authHttp
  **/
  @Valid
  public ConfigNodePropertyDropDown getAuthHttp() {
    return authHttp;
  }

  public void setAuthHttp(ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
    return this;
  }

   /**
   * Get authHttpRealm
   * @return authHttpRealm
  **/
  @Valid
  public ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }

  public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authUriSuffix(ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
    return this;
  }

   /**
   * Get authUriSuffix
   * @return authUriSuffix
  **/
  @Valid
  public ConfigNodePropertyArray getAuthUriSuffix() {
    return authUriSuffix;
  }

  public void setAuthUriSuffix(ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties orgApacheSlingEngineImplAuthSlingAuthenticatorProperties = (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties) o;
    return Objects.equals(osgiHttpWhiteboardContextSelect, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.osgiHttpWhiteboardContextSelect) &&
        Objects.equals(osgiHttpWhiteboardListener, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.osgiHttpWhiteboardListener) &&
        Objects.equals(authSudoCookie, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authSudoCookie) &&
        Objects.equals(authSudoParameter, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authSudoParameter) &&
        Objects.equals(authAnnonymous, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authAnnonymous) &&
        Objects.equals(slingAuthRequirements, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.slingAuthRequirements) &&
        Objects.equals(slingAuthAnonymousUser, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.slingAuthAnonymousUser) &&
        Objects.equals(slingAuthAnonymousPassword, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.slingAuthAnonymousPassword) &&
        Objects.equals(authHttp, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authHttp) &&
        Objects.equals(authHttpRealm, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authHttpRealm) &&
        Objects.equals(authUriSuffix, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.authUriSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osgiHttpWhiteboardContextSelect, osgiHttpWhiteboardListener, authSudoCookie, authSudoParameter, authAnnonymous, slingAuthRequirements, slingAuthAnonymousUser, slingAuthAnonymousPassword, authHttp, authHttpRealm, authUriSuffix);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

