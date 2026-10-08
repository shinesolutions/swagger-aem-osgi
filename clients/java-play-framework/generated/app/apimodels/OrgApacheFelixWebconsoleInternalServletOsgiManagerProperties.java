package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties   {
  @JsonProperty("manager.root")
  @Valid

  private ConfigNodePropertyString managerRoot;

  @JsonProperty("http.service.filter")
  @Valid

  private ConfigNodePropertyString httpServiceFilter;

  @JsonProperty("default.render")
  @Valid

  private ConfigNodePropertyString defaultRender;

  @JsonProperty("realm")
  @Valid

  private ConfigNodePropertyString realm;

  @JsonProperty("username")
  @Valid

  private ConfigNodePropertyString username;

  @JsonProperty("password")
  @Valid

  private ConfigNodePropertyString password;

  @JsonProperty("category")
  @Valid

  private ConfigNodePropertyString category;

  @JsonProperty("locale")
  @Valid

  private ConfigNodePropertyString locale;

  @JsonProperty("loglevel")
  @Valid

  private ConfigNodePropertyDropDown loglevel;

  @JsonProperty("plugins")
  @Valid

  private ConfigNodePropertyDropDown plugins;

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties managerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
    return this;
  }

   /**
   * Get managerRoot
   * @return managerRoot
  **/
  public ConfigNodePropertyString getManagerRoot() {
    return managerRoot;
  }

  public void setManagerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties httpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
    return this;
  }

   /**
   * Get httpServiceFilter
   * @return httpServiceFilter
  **/
  public ConfigNodePropertyString getHttpServiceFilter() {
    return httpServiceFilter;
  }

  public void setHttpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties defaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
    return this;
  }

   /**
   * Get defaultRender
   * @return defaultRender
  **/
  public ConfigNodePropertyString getDefaultRender() {
    return defaultRender;
  }

  public void setDefaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties realm(ConfigNodePropertyString realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  public ConfigNodePropertyString getRealm() {
    return realm;
  }

  public void setRealm(ConfigNodePropertyString realm) {
    this.realm = realm;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties category(ConfigNodePropertyString category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  public ConfigNodePropertyString getCategory() {
    return category;
  }

  public void setCategory(ConfigNodePropertyString category) {
    this.category = category;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties locale(ConfigNodePropertyString locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  public ConfigNodePropertyString getLocale() {
    return locale;
  }

  public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties loglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
    return this;
  }

   /**
   * Get loglevel
   * @return loglevel
  **/
  public ConfigNodePropertyDropDown getLoglevel() {
    return loglevel;
  }

  public void setLoglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties plugins(ConfigNodePropertyDropDown plugins) {
    this.plugins = plugins;
    return this;
  }

   /**
   * Get plugins
   * @return plugins
  **/
  public ConfigNodePropertyDropDown getPlugins() {
    return plugins;
  }

  public void setPlugins(ConfigNodePropertyDropDown plugins) {
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
    return Objects.equals(managerRoot, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.managerRoot) &&
        Objects.equals(httpServiceFilter, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.httpServiceFilter) &&
        Objects.equals(defaultRender, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.defaultRender) &&
        Objects.equals(realm, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.realm) &&
        Objects.equals(username, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.username) &&
        Objects.equals(password, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.password) &&
        Objects.equals(category, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.category) &&
        Objects.equals(locale, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.locale) &&
        Objects.equals(loglevel, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.loglevel) &&
        Objects.equals(plugins, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerRoot, httpServiceFilter, defaultRender, realm, username, password, category, locale, loglevel, plugins);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

