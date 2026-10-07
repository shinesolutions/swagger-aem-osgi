package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
 */

@JsonTypeName("comDayCqWcmFoundationImplHTTPAuthHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean authHttpNologin;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authHttpRealm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString authDefaultLoginpage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray authCredForm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray authCredUtf8;

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties path(@Nullable ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpNologin(@Nullable ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
    return this;
  }

  /**
   * Get authHttpNologin
   * @return authHttpNologin
   */
  @Valid 
  @Schema(name = "auth.http.nologin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.http.nologin")
  public @Nullable ConfigNodePropertyBoolean getAuthHttpNologin() {
    return authHttpNologin;
  }

  @JsonProperty("auth.http.nologin")
  public void setAuthHttpNologin(@Nullable ConfigNodePropertyBoolean authHttpNologin) {
    this.authHttpNologin = authHttpNologin;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authHttpRealm(@Nullable ConfigNodePropertyString authHttpRealm) {
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

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authDefaultLoginpage(@Nullable ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
    return this;
  }

  /**
   * Get authDefaultLoginpage
   * @return authDefaultLoginpage
   */
  @Valid 
  @Schema(name = "auth.default.loginpage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.default.loginpage")
  public @Nullable ConfigNodePropertyString getAuthDefaultLoginpage() {
    return authDefaultLoginpage;
  }

  @JsonProperty("auth.default.loginpage")
  public void setAuthDefaultLoginpage(@Nullable ConfigNodePropertyString authDefaultLoginpage) {
    this.authDefaultLoginpage = authDefaultLoginpage;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredForm(@Nullable ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
    return this;
  }

  /**
   * Get authCredForm
   * @return authCredForm
   */
  @Valid 
  @Schema(name = "auth.cred.form", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.cred.form")
  public @Nullable ConfigNodePropertyArray getAuthCredForm() {
    return authCredForm;
  }

  @JsonProperty("auth.cred.form")
  public void setAuthCredForm(@Nullable ConfigNodePropertyArray authCredForm) {
    this.authCredForm = authCredForm;
  }

  public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties authCredUtf8(@Nullable ConfigNodePropertyArray authCredUtf8) {
    this.authCredUtf8 = authCredUtf8;
    return this;
  }

  /**
   * Get authCredUtf8
   * @return authCredUtf8
   */
  @Valid 
  @Schema(name = "auth.cred.utf8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth.cred.utf8")
  public @Nullable ConfigNodePropertyArray getAuthCredUtf8() {
    return authCredUtf8;
  }

  @JsonProperty("auth.cred.utf8")
  public void setAuthCredUtf8(@Nullable ConfigNodePropertyArray authCredUtf8) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

