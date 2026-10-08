package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheFelixWebconsoleInternalServletOsgiManagerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties   {
  private ConfigNodePropertyString managerRoot;
  private ConfigNodePropertyString httpServiceFilter;
  private ConfigNodePropertyString defaultRender;
  private ConfigNodePropertyString realm;
  private ConfigNodePropertyString username;
  private ConfigNodePropertyString password;
  private ConfigNodePropertyString category;
  private ConfigNodePropertyString locale;
  private ConfigNodePropertyDropDown loglevel;
  private ConfigNodePropertyDropDown plugins;

  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties() {
  }

  /**
   **/
  public OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties managerRoot(ConfigNodePropertyString managerRoot) {
    this.managerRoot = managerRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("manager.root")
  @Valid public ConfigNodePropertyString getManagerRoot() {
    return managerRoot;
  }

  @JsonProperty("manager.root")
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
  @Valid public ConfigNodePropertyString getHttpServiceFilter() {
    return httpServiceFilter;
  }

  @JsonProperty("http.service.filter")
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
  @Valid public ConfigNodePropertyString getDefaultRender() {
    return defaultRender;
  }

  @JsonProperty("default.render")
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
  @Valid public ConfigNodePropertyString getRealm() {
    return realm;
  }

  @JsonProperty("realm")
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
  @Valid public ConfigNodePropertyString getUsername() {
    return username;
  }

  @JsonProperty("username")
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
  @Valid public ConfigNodePropertyString getPassword() {
    return password;
  }

  @JsonProperty("password")
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
  @Valid public ConfigNodePropertyString getCategory() {
    return category;
  }

  @JsonProperty("category")
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
  @Valid public ConfigNodePropertyString getLocale() {
    return locale;
  }

  @JsonProperty("locale")
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
  @Valid public ConfigNodePropertyDropDown getLoglevel() {
    return loglevel;
  }

  @JsonProperty("loglevel")
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
  @Valid public ConfigNodePropertyDropDown getPlugins() {
    return plugins;
  }

  @JsonProperty("plugins")
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
