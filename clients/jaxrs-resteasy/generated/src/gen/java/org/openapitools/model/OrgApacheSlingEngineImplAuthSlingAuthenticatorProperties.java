package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties   {
  
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;
  private ConfigNodePropertyString osgiHttpWhiteboardListener = null;
  private ConfigNodePropertyString authSudoCookie = null;
  private ConfigNodePropertyString authSudoParameter = null;
  private ConfigNodePropertyBoolean authAnnonymous = null;
  private ConfigNodePropertyArray slingAuthRequirements = null;
  private ConfigNodePropertyString slingAuthAnonymousUser = null;
  private ConfigNodePropertyString slingAuthAnonymousPassword = null;
  private ConfigNodePropertyDropDown authHttp = null;
  private ConfigNodePropertyString authHttpRealm = null;
  private ConfigNodePropertyArray authUriSuffix = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.listener")
  public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }
  public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.sudo.cookie")
  public ConfigNodePropertyString getAuthSudoCookie() {
    return authSudoCookie;
  }
  public void setAuthSudoCookie(ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.sudo.parameter")
  public ConfigNodePropertyString getAuthSudoParameter() {
    return authSudoParameter;
  }
  public void setAuthSudoParameter(ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.annonymous")
  public ConfigNodePropertyBoolean getAuthAnnonymous() {
    return authAnnonymous;
  }
  public void setAuthAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.auth.requirements")
  public ConfigNodePropertyArray getSlingAuthRequirements() {
    return slingAuthRequirements;
  }
  public void setSlingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.auth.anonymous.user")
  public ConfigNodePropertyString getSlingAuthAnonymousUser() {
    return slingAuthAnonymousUser;
  }
  public void setSlingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.auth.anonymous.password")
  public ConfigNodePropertyString getSlingAuthAnonymousPassword() {
    return slingAuthAnonymousPassword;
  }
  public void setSlingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.http")
  public ConfigNodePropertyDropDown getAuthHttp() {
    return authHttp;
  }
  public void setAuthHttp(ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.http.realm")
  public ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }
  public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.uri.suffix")
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

