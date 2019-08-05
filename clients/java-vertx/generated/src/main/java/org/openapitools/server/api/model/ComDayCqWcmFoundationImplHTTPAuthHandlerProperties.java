package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties   {
  
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyBoolean authHttpNologin = null;
  private ConfigNodePropertyString authHttpRealm = null;
  private ConfigNodePropertyString authDefaultLoginpage = null;
  private ConfigNodePropertyArray authCredForm = null;
  private ConfigNodePropertyArray authCredUtf8 = null;

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties () {

  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties (ConfigNodePropertyString path, ConfigNodePropertyBoolean authHttpNologin, ConfigNodePropertyString authHttpRealm, ConfigNodePropertyString authDefaultLoginpage, ConfigNodePropertyArray authCredForm, ConfigNodePropertyArray authCredUtf8) {
    this.path = path;
    this.authHttpNologin = authHttpNologin;
    this.authHttpRealm = authHttpRealm;
    this.authDefaultLoginpage = authDefaultLoginpage;
    this.authCredForm = authCredForm;
    this.authCredUtf8 = authCredUtf8;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("auth.http.nologin")
  public ConfigNodePropertyBoolean getAuthHttpNologin() {
    return authHttpNologin;
  }
  public void setAuthHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
  }

    
  @JsonProperty("auth.http.realm")
  public ConfigNodePropertyString getAuthHttpRealm() {
    return authHttpRealm;
  }
  public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
    this.authHttpRealm = authHttpRealm;
  }

    
  @JsonProperty("auth.default.loginpage")
  public ConfigNodePropertyString getAuthDefaultLoginpage() {
    return authDefaultLoginpage;
  }
  public void setAuthDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
  }

    
  @JsonProperty("auth.cred.form")
  public ConfigNodePropertyArray getAuthCredForm() {
    return authCredForm;
  }
  public void setAuthCredForm(ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
  }

    
  @JsonProperty("auth.cred.utf8")
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
    return Objects.equals(path, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.path) &&
        Objects.equals(authHttpNologin, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authHttpNologin) &&
        Objects.equals(authHttpRealm, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authHttpRealm) &&
        Objects.equals(authDefaultLoginpage, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authDefaultLoginpage) &&
        Objects.equals(authCredForm, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authCredForm) &&
        Objects.equals(authCredUtf8, comDayCqWcmFoundationImplHTTPAuthHandlerProperties.authCredUtf8);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
