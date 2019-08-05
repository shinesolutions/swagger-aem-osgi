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

public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean authHttpNologin = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString authHttpRealm = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString authDefaultLoginpage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray authCredForm = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray authCredUtf8 = null;
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

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get authHttpNologin
   * @return authHttpNologin
  **/
  @JsonProperty("auth.http.nologin")
  public ConfigNodePropertyBoolean getAuthHttpNologin() {
    return authHttpNologin;
  }

  public void setAuthHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
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

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
    return this;
  }

 /**
   * Get authDefaultLoginpage
   * @return authDefaultLoginpage
  **/
  @JsonProperty("auth.default.loginpage")
  public ConfigNodePropertyString getAuthDefaultLoginpage() {
    return authDefaultLoginpage;
  }

  public void setAuthDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
    return this;
  }

 /**
   * Get authCredForm
   * @return authCredForm
  **/
  @JsonProperty("auth.cred.form")
  public ConfigNodePropertyArray getAuthCredForm() {
    return authCredForm;
  }

  public void setAuthCredForm(ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredForm(ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
    return this;
  }

 /**
   * Get authCredUtf8
   * @return authCredUtf8
  **/
  @JsonProperty("auth.cred.utf8")
  public ConfigNodePropertyArray getAuthCredUtf8() {
    return authCredUtf8;
  }

  public void setAuthCredUtf8(ConfigNodePropertyArray authCredUtf8) {
    this.authCredUtf8 = authCredUtf8;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredUtf8(ConfigNodePropertyArray authCredUtf8) {
    this.authCredUtf8 = authCredUtf8;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

