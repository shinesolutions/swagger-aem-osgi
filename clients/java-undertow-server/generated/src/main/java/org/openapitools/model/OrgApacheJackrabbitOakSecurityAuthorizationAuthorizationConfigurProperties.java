/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties   {
  
  private ConfigNodePropertyDropDown permissionsJr2;
  private ConfigNodePropertyDropDown importBehavior;
  private ConfigNodePropertyArray readPaths;
  private ConfigNodePropertyArray administrativePrincipals;
  private ConfigNodePropertyInteger configurationRanking;

  /**
   */
  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties permissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionsJr2")
  public ConfigNodePropertyDropDown getPermissionsJr2() {
    return permissionsJr2;
  }
  public void setPermissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
  }

  /**
   */
  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties importBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importBehavior")
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }
  public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  /**
   */
  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties readPaths(ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("readPaths")
  public ConfigNodePropertyArray getReadPaths() {
    return readPaths;
  }
  public void setReadPaths(ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
  }

  /**
   */
  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties administrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("administrativePrincipals")
  public ConfigNodePropertyArray getAdministrativePrincipals() {
    return administrativePrincipals;
  }
  public void setAdministrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
  }

  /**
   */
  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties configurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configurationRanking")
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }
  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties = (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties) o;
    return Objects.equals(permissionsJr2, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.permissionsJr2) &&
        Objects.equals(importBehavior, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.importBehavior) &&
        Objects.equals(readPaths, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.readPaths) &&
        Objects.equals(administrativePrincipals, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.administrativePrincipals) &&
        Objects.equals(configurationRanking, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.configurationRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsJr2, importBehavior, readPaths, administrativePrincipals, configurationRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {\n");
    
    sb.append("    permissionsJr2: ").append(toIndentedString(permissionsJr2)).append("\n");
    sb.append("    importBehavior: ").append(toIndentedString(importBehavior)).append("\n");
    sb.append("    readPaths: ").append(toIndentedString(readPaths)).append("\n");
    sb.append("    administrativePrincipals: ").append(toIndentedString(administrativePrincipals)).append("\n");
    sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
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

