package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties   {
  
  private ConfigNodePropertyString managerRoot = null;
  private ConfigNodePropertyString httpServiceFilter = null;
  private ConfigNodePropertyString defaultRender = null;
  private ConfigNodePropertyString realm = null;
  private ConfigNodePropertyString username = null;
  private ConfigNodePropertyString password = null;
  private ConfigNodePropertyString category = null;
  private ConfigNodePropertyString locale = null;
  private ConfigNodePropertyDropDown loglevel = null;
  private ConfigNodePropertyDropDown plugins = null;

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties () {

  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties (ConfigNodePropertyString managerRoot, ConfigNodePropertyString httpServiceFilter, ConfigNodePropertyString defaultRender, ConfigNodePropertyString realm, ConfigNodePropertyString username, ConfigNodePropertyString password, ConfigNodePropertyString category, ConfigNodePropertyString locale, ConfigNodePropertyDropDown loglevel, ConfigNodePropertyDropDown plugins) {
    this.managerRoot = managerRoot;
    this.httpServiceFilter = httpServiceFilter;
    this.defaultRender = defaultRender;
    this.realm = realm;
    this.username = username;
    this.password = password;
    this.category = category;
    this.locale = locale;
    this.loglevel = loglevel;
    this.plugins = plugins;
  }

    
  @JsonProperty("manager.root")
  public ConfigNodePropertyString getManagerRoot() {
    return managerRoot;
  }
  public void setManagerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
  }

    
  @JsonProperty("http.service.filter")
  public ConfigNodePropertyString getHttpServiceFilter() {
    return httpServiceFilter;
  }
  public void setHttpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
  }

    
  @JsonProperty("default.render")
  public ConfigNodePropertyString getDefaultRender() {
    return defaultRender;
  }
  public void setDefaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
  }

    
  @JsonProperty("realm")
  public ConfigNodePropertyString getRealm() {
    return realm;
  }
  public void setRealm(ConfigNodePropertyString realm) {
    this.realm = realm;
  }

    
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }
  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

    
  @JsonProperty("password")
  public ConfigNodePropertyString getPassword() {
    return password;
  }
  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

    
  @JsonProperty("category")
  public ConfigNodePropertyString getCategory() {
    return category;
  }
  public void setCategory(ConfigNodePropertyString category) {
    this.category = category;
  }

    
  @JsonProperty("locale")
  public ConfigNodePropertyString getLocale() {
    return locale;
  }
  public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

    
  @JsonProperty("loglevel")
  public ConfigNodePropertyDropDown getLoglevel() {
    return loglevel;
  }
  public void setLoglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
  }

    
  @JsonProperty("plugins")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
