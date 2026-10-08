package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmFoundationImplHTTPAuthHandlerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties   {
  private ConfigNodePropertyString path;
  private ConfigNodePropertyBoolean authHttpNologin;
  private ConfigNodePropertyString authHttpRealm;
  private ConfigNodePropertyString authDefaultLoginpage;
  private ConfigNodePropertyArray authCredForm;
  private ConfigNodePropertyArray authCredUtf8;

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties() {
  }

  /**
   **/
  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  @Valid public ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.http.nologin")
  @Valid public ConfigNodePropertyBoolean getAuthHttpNologin() {
    return authHttpNologin;
  }

  @JsonProperty("auth.http.nologin")
  public void setAuthHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
  }

  /**
   **/
  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.http.realm")
  @Valid public ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }

  @JsonProperty("auth.http.realm")
  public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

  /**
   **/
  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.default.loginpage")
  @Valid public ConfigNodePropertyString getAuthDefaultLoginpage() {
    return authDefaultLoginpage;
  }

  @JsonProperty("auth.default.loginpage")
  public void setAuthDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
  }

  /**
   **/
  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredForm(ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.cred.form")
  @Valid public ConfigNodePropertyArray getAuthCredForm() {
    return authCredForm;
  }

  @JsonProperty("auth.cred.form")
  public void setAuthCredForm(ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
  }

  /**
   **/
  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredUtf8(ConfigNodePropertyArray authCredUtf8) {
    this.authCredUtf8 = authCredUtf8;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.cred.utf8")
  @Valid public ConfigNodePropertyArray getAuthCredUtf8() {
    return authCredUtf8;
  }

  @JsonProperty("auth.cred.utf8")
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
