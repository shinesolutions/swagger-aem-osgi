package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString managerRoot = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString httpServiceFilter = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultRender = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString realm = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString username = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString password = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString category = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString locale = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown loglevel = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown plugins = null;
 /**
   * Get managerRoot
   * @return managerRoot
  **/
  @JsonProperty("manager.root")
  public ConfigNodePropertyString getManagerRoot() {
    return managerRoot;
  }

  public void setManagerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties managerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
    return this;
  }

 /**
   * Get httpServiceFilter
   * @return httpServiceFilter
  **/
  @JsonProperty("http.service.filter")
  public ConfigNodePropertyString getHttpServiceFilter() {
    return httpServiceFilter;
  }

  public void setHttpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties httpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
    return this;
  }

 /**
   * Get defaultRender
   * @return defaultRender
  **/
  @JsonProperty("default.render")
  public ConfigNodePropertyString getDefaultRender() {
    return defaultRender;
  }

  public void setDefaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties defaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
    return this;
  }

 /**
   * Get realm
   * @return realm
  **/
  @JsonProperty("realm")
  public ConfigNodePropertyString getRealm() {
    return realm;
  }

  public void setRealm(ConfigNodePropertyString realm) {
    this.realm = realm;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties realm(ConfigNodePropertyString realm) {
    this.realm = realm;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  public ConfigNodePropertyString getCategory() {
    return category;
  }

  public void setCategory(ConfigNodePropertyString category) {
    this.category = category;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties category(ConfigNodePropertyString category) {
    this.category = category;
    return this;
  }

 /**
   * Get locale
   * @return locale
  **/
  @JsonProperty("locale")
  public ConfigNodePropertyString getLocale() {
    return locale;
  }

  public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties locale(ConfigNodePropertyString locale) {
    this.locale = locale;
    return this;
  }

 /**
   * Get loglevel
   * @return loglevel
  **/
  @JsonProperty("loglevel")
  public ConfigNodePropertyDropDown getLoglevel() {
    return loglevel;
  }

  public void setLoglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties loglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
    return this;
  }

 /**
   * Get plugins
   * @return plugins
  **/
  @JsonProperty("plugins")
  public ConfigNodePropertyDropDown getPlugins() {
    return plugins;
  }

  public void setPlugins(ConfigNodePropertyDropDown plugins) {
    this.plugins = plugins;
  }

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties plugins(ConfigNodePropertyDropDown plugins) {
    this.plugins = plugins;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

