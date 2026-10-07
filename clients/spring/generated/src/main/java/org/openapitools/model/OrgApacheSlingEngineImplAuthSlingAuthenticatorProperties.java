package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
 */

@JsonTypeName("orgApacheSlingEngineImplAuthSlingAuthenticatorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString osgiHttpWhiteboardContextSelect;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString osgiHttpWhiteboardListener;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authSudoCookie;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authSudoParameter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean authAnnonymous;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingAuthRequirements;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingAuthAnonymousUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingAuthAnonymousPassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown authHttp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authHttpRealm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray authUriSuffix;

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardContextSelect(@Nullable ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

  /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
   */
  @Valid 
  @Schema(name = "osgi.http.whiteboard.context.select", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("osgi.http.whiteboard.context.select")
  public @Nullable ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  @JsonProperty("osgi.http.whiteboard.context.select")
  public void setOsgiHttpWhiteboardContextSelect(@Nullable ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties osgiHttpWhiteboardListener(@Nullable ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    return this;
  }

  /**
   * Get osgiHttpWhiteboardListener
   * @return osgiHttpWhiteboardListener
   */
  @Valid 
  @Schema(name = "osgi.http.whiteboard.listener", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("osgi.http.whiteboard.listener")
  public @Nullable ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }

  @JsonProperty("osgi.http.whiteboard.listener")
  public void setOsgiHttpWhiteboardListener(@Nullable ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoCookie(@Nullable ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
    return this;
  }

  /**
   * Get authSudoCookie
   * @return authSudoCookie
   */
  @Valid 
  @Schema(name = "auth.sudo.cookie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.sudo.cookie")
  public @Nullable ConfigNodePropertyString getAuthSudoCookie() {
    return authSudoCookie;
  }

  @JsonProperty("auth.sudo.cookie")
  public void setAuthSudoCookie(@Nullable ConfigNodePropertyString authSudoCookie) {
    this.authSudoCookie = authSudoCookie;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authSudoParameter(@Nullable ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
    return this;
  }

  /**
   * Get authSudoParameter
   * @return authSudoParameter
   */
  @Valid 
  @Schema(name = "auth.sudo.parameter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.sudo.parameter")
  public @Nullable ConfigNodePropertyString getAuthSudoParameter() {
    return authSudoParameter;
  }

  @JsonProperty("auth.sudo.parameter")
  public void setAuthSudoParameter(@Nullable ConfigNodePropertyString authSudoParameter) {
    this.authSudoParameter = authSudoParameter;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authAnnonymous(@Nullable ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
    return this;
  }

  /**
   * Get authAnnonymous
   * @return authAnnonymous
   */
  @Valid 
  @Schema(name = "auth.annonymous", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.annonymous")
  public @Nullable ConfigNodePropertyBoolean getAuthAnnonymous() {
    return authAnnonymous;
  }

  @JsonProperty("auth.annonymous")
  public void setAuthAnnonymous(@Nullable ConfigNodePropertyBoolean authAnnonymous) {
    this.authAnnonymous = authAnnonymous;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthRequirements(@Nullable ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

  /**
   * Get slingAuthRequirements
   * @return slingAuthRequirements
   */
  @Valid 
  @Schema(name = "sling.auth.requirements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.auth.requirements")
  public @Nullable ConfigNodePropertyArray getSlingAuthRequirements() {
    return slingAuthRequirements;
  }

  @JsonProperty("sling.auth.requirements")
  public void setSlingAuthRequirements(@Nullable ConfigNodePropertyArray slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousUser(@Nullable ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
    return this;
  }

  /**
   * Get slingAuthAnonymousUser
   * @return slingAuthAnonymousUser
   */
  @Valid 
  @Schema(name = "sling.auth.anonymous.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.auth.anonymous.user")
  public @Nullable ConfigNodePropertyString getSlingAuthAnonymousUser() {
    return slingAuthAnonymousUser;
  }

  @JsonProperty("sling.auth.anonymous.user")
  public void setSlingAuthAnonymousUser(@Nullable ConfigNodePropertyString slingAuthAnonymousUser) {
    this.slingAuthAnonymousUser = slingAuthAnonymousUser;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties slingAuthAnonymousPassword(@Nullable ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
    return this;
  }

  /**
   * Get slingAuthAnonymousPassword
   * @return slingAuthAnonymousPassword
   */
  @Valid 
  @Schema(name = "sling.auth.anonymous.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.auth.anonymous.password")
  public @Nullable ConfigNodePropertyString getSlingAuthAnonymousPassword() {
    return slingAuthAnonymousPassword;
  }

  @JsonProperty("sling.auth.anonymous.password")
  public void setSlingAuthAnonymousPassword(@Nullable ConfigNodePropertyString slingAuthAnonymousPassword) {
    this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttp(@Nullable ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
    return this;
  }

  /**
   * Get authHttp
   * @return authHttp
   */
  @Valid 
  @Schema(name = "auth.http", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.http")
  public @Nullable ConfigNodePropertyDropDown getAuthHttp() {
    return authHttp;
  }

  @JsonProperty("auth.http")
  public void setAuthHttp(@Nullable ConfigNodePropertyDropDown authHttp) {
    this.authHttp = authHttp;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authHttpRealm(@Nullable ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
    return this;
  }

  /**
   * Get authHttpRealm
   * @return authHttpRealm
   */
  @Valid 
  @Schema(name = "auth.http.realm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.http.realm")
  public @Nullable ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }

  @JsonProperty("auth.http.realm")
  public void setAuthHttpRealm(@Nullable ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

  public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties authUriSuffix(@Nullable ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
    return this;
  }

  /**
   * Get authUriSuffix
   * @return authUriSuffix
   */
  @Valid 
  @Schema(name = "auth.uri.suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.uri.suffix")
  public @Nullable ConfigNodePropertyArray getAuthUriSuffix() {
    return authUriSuffix;
  }

  @JsonProperty("auth.uri.suffix")
  public void setAuthUriSuffix(@Nullable ConfigNodePropertyArray authUriSuffix) {
    this.authUriSuffix = authUriSuffix;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

