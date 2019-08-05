package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties   {
  @JsonProperty("manager.root")
  private ConfigNodePropertyString managerRoot = null;

  @JsonProperty("http.service.filter")
  private ConfigNodePropertyString httpServiceFilter = null;

  @JsonProperty("default.render")
  private ConfigNodePropertyString defaultRender = null;

  @JsonProperty("realm")
  private ConfigNodePropertyString realm = null;

  @JsonProperty("username")
  private ConfigNodePropertyString username = null;

  @JsonProperty("password")
  private ConfigNodePropertyString password = null;

  @JsonProperty("category")
  private ConfigNodePropertyString category = null;

  @JsonProperty("locale")
  private ConfigNodePropertyString locale = null;

  @JsonProperty("loglevel")
  private ConfigNodePropertyDropDown loglevel = null;

  @JsonProperty("plugins")
  private ConfigNodePropertyDropDown plugins = null;

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties managerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
    return this;
  }

   /**
   * Get managerRoot
   * @return managerRoot
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getPlugins() {
    return plugins;
  }

  public void setPlugins(ConfigNodePropertyDropDown plugins) {
    this.plugins = plugins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

