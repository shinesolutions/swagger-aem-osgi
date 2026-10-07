package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
 */

@JsonTypeName("orgApacheFelixWebconsoleInternalServletOsgiManagerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString managerRoot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString httpServiceFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultRender;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString realm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString username;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString password;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString category;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString locale;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown loglevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown plugins;

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties managerRoot(@Nullable ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
    return this;
  }

  /**
   * Get managerRoot
   * @return managerRoot
   */
  @Valid 
  @Schema(name = "manager.root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager.root")
  public @Nullable ConfigNodePropertyString getManagerRoot() {
    return managerRoot;
  }

  @JsonProperty("manager.root")
  public void setManagerRoot(@Nullable ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties httpServiceFilter(@Nullable ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
    return this;
  }

  /**
   * Get httpServiceFilter
   * @return httpServiceFilter
   */
  @Valid 
  @Schema(name = "http.service.filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("http.service.filter")
  public @Nullable ConfigNodePropertyString getHttpServiceFilter() {
    return httpServiceFilter;
  }

  @JsonProperty("http.service.filter")
  public void setHttpServiceFilter(@Nullable ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties defaultRender(@Nullable ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
    return this;
  }

  /**
   * Get defaultRender
   * @return defaultRender
   */
  @Valid 
  @Schema(name = "default.render", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.render")
  public @Nullable ConfigNodePropertyString getDefaultRender() {
    return defaultRender;
  }

  @JsonProperty("default.render")
  public void setDefaultRender(@Nullable ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties realm(@Nullable ConfigNodePropertyString realm) {
    this.realm = realm;
    return this;
  }

  /**
   * Get realm
   * @return realm
   */
  @Valid 
  @Schema(name = "realm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("realm")
  public @Nullable ConfigNodePropertyString getRealm() {
    return realm;
  }

  @JsonProperty("realm")
  public void setRealm(@Nullable ConfigNodePropertyString realm) {
    this.realm = realm;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties username(@Nullable ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @Valid 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable ConfigNodePropertyString getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(@Nullable ConfigNodePropertyString username) {
    this.username = username;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties password(@Nullable ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @Valid 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public @Nullable ConfigNodePropertyString getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(@Nullable ConfigNodePropertyString password) {
    this.password = password;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties category(@Nullable ConfigNodePropertyString category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable ConfigNodePropertyString getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(@Nullable ConfigNodePropertyString category) {
    this.category = category;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties locale(@Nullable ConfigNodePropertyString locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  @Valid 
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public @Nullable ConfigNodePropertyString getLocale() {
    return locale;
  }

  @JsonProperty("locale")
  public void setLocale(@Nullable ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties loglevel(@Nullable ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
    return this;
  }

  /**
   * Get loglevel
   * @return loglevel
   */
  @Valid 
  @Schema(name = "loglevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loglevel")
  public @Nullable ConfigNodePropertyDropDown getLoglevel() {
    return loglevel;
  }

  @JsonProperty("loglevel")
  public void setLoglevel(@Nullable ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties plugins(@Nullable ConfigNodePropertyDropDown plugins) {
    this.plugins = plugins;
    return this;
  }

  /**
   * Get plugins
   * @return plugins
   */
  @Valid 
  @Schema(name = "plugins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plugins")
  public @Nullable ConfigNodePropertyDropDown getPlugins() {
    return plugins;
  }

  @JsonProperty("plugins")
  public void setPlugins(@Nullable ConfigNodePropertyDropDown plugins) {
    this.plugins = plugins;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties orgApacheFelixWebconsoleInternalServletOsgiManagerProperties = (OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties) o;
    return Objects.equals(this.managerRoot, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.managerRoot) &&
        Objects.equals(this.httpServiceFilter, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.httpServiceFilter) &&
        Objects.equals(this.defaultRender, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.defaultRender) &&
        Objects.equals(this.realm, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.realm) &&
        Objects.equals(this.username, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.username) &&
        Objects.equals(this.password, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.password) &&
        Objects.equals(this.category, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.category) &&
        Objects.equals(this.locale, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.locale) &&
        Objects.equals(this.loglevel, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.loglevel) &&
        Objects.equals(this.plugins, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerRoot, httpServiceFilter, defaultRender, realm, username, password, category, locale, loglevel, plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {\n");
    sb.append("    managerRoot: ").append(toIndentedString(managerRoot)).append("\n");
    sb.append("    httpServiceFilter: ").append(toIndentedString(httpServiceFilter)).append("\n");
    sb.append("    defaultRender: ").append(toIndentedString(defaultRender)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    loglevel: ").append(toIndentedString(loglevel)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

