package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("auth.http.nologin")
  private ConfigNodePropertyBoolean authHttpNologin = null;

  @JsonProperty("auth.http.realm")
  private ConfigNodePropertyString authHttpRealm = null;

  @JsonProperty("auth.default.loginpage")
  private ConfigNodePropertyString authDefaultLoginpage = null;

  @JsonProperty("auth.cred.form")
  private ConfigNodePropertyArray authCredForm = null;

  @JsonProperty("auth.cred.utf8")
  private ConfigNodePropertyArray authCredUtf8 = null;

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
  public ConfigNodePropertyArray getAuthCredUtf8() {
    return authCredUtf8;
  }

  public void setAuthCredUtf8(ConfigNodePropertyArray authCredUtf8) {
    this.authCredUtf8 = authCredUtf8;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

