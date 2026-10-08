package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("manager.root")
  private ConfigNodePropertyString managerRoot;

  @JsonProperty("http.service.filter")
  private ConfigNodePropertyString httpServiceFilter;

  @JsonProperty("default.render")
  private ConfigNodePropertyString defaultRender;

  @JsonProperty("realm")
  private ConfigNodePropertyString realm;

  @JsonProperty("username")
  private ConfigNodePropertyString username;

  @JsonProperty("password")
  private ConfigNodePropertyString password;

  @JsonProperty("category")
  private ConfigNodePropertyString category;

  @JsonProperty("locale")
  private ConfigNodePropertyString locale;

  @JsonProperty("loglevel")
  private ConfigNodePropertyDropDown loglevel;

  @JsonProperty("plugins")
  private ConfigNodePropertyDropDown plugins;

  /**
   * 
   * @return managerRoot
   */
  public ConfigNodePropertyString getManagerRoot() {
    return managerRoot;
  }

  public void setManagerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
  }

  /**
   * 
   * @return httpServiceFilter
   */
  public ConfigNodePropertyString getHttpServiceFilter() {
    return httpServiceFilter;
  }

  public void setHttpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
  }

  /**
   * 
   * @return defaultRender
   */
  public ConfigNodePropertyString getDefaultRender() {
    return defaultRender;
  }

  public void setDefaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
  }

  /**
   * 
   * @return realm
   */
  public ConfigNodePropertyString getRealm() {
    return realm;
  }

  public void setRealm(ConfigNodePropertyString realm) {
    this.realm = realm;
  }

  /**
   * 
   * @return username
   */
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  /**
   * 
   * @return password
   */
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  /**
   * 
   * @return category
   */
  public ConfigNodePropertyString getCategory() {
    return category;
  }

  public void setCategory(ConfigNodePropertyString category) {
    this.category = category;
  }

  /**
   * 
   * @return locale
   */
  public ConfigNodePropertyString getLocale() {
    return locale;
  }

  public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  /**
   * 
   * @return loglevel
   */
  public ConfigNodePropertyDropDown getLoglevel() {
    return loglevel;
  }

  public void setLoglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
  }

  /**
   * 
   * @return plugins
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
