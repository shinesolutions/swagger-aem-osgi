package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyString path;

  @JsonProperty("auth.http.nologin")
  private ConfigNodePropertyBoolean authHttpNologin;

  @JsonProperty("auth.http.realm")
  private ConfigNodePropertyString authHttpRealm;

  @JsonProperty("auth.default.loginpage")
  private ConfigNodePropertyString authDefaultLoginpage;

  @JsonProperty("auth.cred.form")
  private ConfigNodePropertyArray authCredForm;

  @JsonProperty("auth.cred.utf8")
  private ConfigNodePropertyArray authCredUtf8;

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
    return this;
  }

  /**
   * Get authHttpNologin
   * @return authHttpNologin
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAuthHttpNologin() {
    return authHttpNologin;
  }

  public void setAuthHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
    return this;
  }

  /**
   * Get authHttpRealm
   * @return authHttpRealm
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }

  public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
    return this;
  }

  /**
   * Get authDefaultLoginpage
   * @return authDefaultLoginpage
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAuthDefaultLoginpage() {
    return authDefaultLoginpage;
  }

  public void setAuthDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredForm(ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
    return this;
  }

  /**
   * Get authCredForm
   * @return authCredForm
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAuthCredForm() {
    return authCredForm;
  }

  public void setAuthCredForm(ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredUtf8(ConfigNodePropertyArray authCredUtf8) {
    this.authCredUtf8 = authCredUtf8;
    return this;
  }

  /**
   * Get authCredUtf8
   * @return authCredUtf8
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAuthCredUtf8() {
    return authCredUtf8;
  }

  public void setAuthCredUtf8(ConfigNodePropertyArray authCredUtf8) {
    this.authCredUtf8 = authCredUtf8;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplHTTPAuthHandlerProperties comDayCqWcmFoundationImplHTTPAuthHandlerProperties = (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties) o;
    return Objects.equals(this.path, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.path) &&
        Objects.equals(this.authHttpNologin, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authHttpNologin) &&
        Objects.equals(this.authHttpRealm, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authHttpRealm) &&
        Objects.equals(this.authDefaultLoginpage, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authDefaultLoginpage) &&
        Objects.equals(this.authCredForm, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authCredForm) &&
        Objects.equals(this.authCredUtf8, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authCredUtf8);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, authHttpNologin, authHttpRealm, authDefaultLoginpage, authCredForm, authCredUtf8);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    authHttpNologin: ").append(toIndentedString(authHttpNologin)).append("\n");
    sb.append("    authHttpRealm: ").append(toIndentedString(authHttpRealm)).append("\n");
    sb.append("    authDefaultLoginpage: ").append(toIndentedString(authDefaultLoginpage)).append("\n");
    sb.append("    authCredForm: ").append(toIndentedString(authCredForm)).append("\n");
    sb.append("    authCredUtf8: ").append(toIndentedString(authCredUtf8)).append("\n");
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

