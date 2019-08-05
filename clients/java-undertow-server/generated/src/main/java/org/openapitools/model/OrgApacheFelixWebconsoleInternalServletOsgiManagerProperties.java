package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
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

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties managerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("manager.root")
  public ConfigNodePropertyString getManagerRoot() {
    return managerRoot;
  }
  public void setManagerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties httpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http.service.filter")
  public ConfigNodePropertyString getHttpServiceFilter() {
    return httpServiceFilter;
  }
  public void setHttpServiceFilter(ConfigNodePropertyString httpServiceFilter) {
    this.httpServiceFilter = httpServiceFilter;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties defaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.render")
  public ConfigNodePropertyString getDefaultRender() {
    return defaultRender;
  }
  public void setDefaultRender(ConfigNodePropertyString defaultRender) {
    this.defaultRender = defaultRender;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties realm(ConfigNodePropertyString realm) {
    this.realm = realm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realm")
  public ConfigNodePropertyString getRealm() {
    return realm;
  }
  public void setRealm(ConfigNodePropertyString realm) {
    this.realm = realm;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }
  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public ConfigNodePropertyString getPassword() {
    return password;
  }
  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties category(ConfigNodePropertyString category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("category")
  public ConfigNodePropertyString getCategory() {
    return category;
  }
  public void setCategory(ConfigNodePropertyString category) {
    this.category = category;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties locale(ConfigNodePropertyString locale) {
    this.locale = locale;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("locale")
  public ConfigNodePropertyString getLocale() {
    return locale;
  }
  public void setLocale(ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties loglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("loglevel")
  public ConfigNodePropertyDropDown getLoglevel() {
    return loglevel;
  }
  public void setLoglevel(ConfigNodePropertyDropDown loglevel) {
    this.loglevel = loglevel;
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties plugins(ConfigNodePropertyDropDown plugins) {
    this.plugins = plugins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("plugins")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

