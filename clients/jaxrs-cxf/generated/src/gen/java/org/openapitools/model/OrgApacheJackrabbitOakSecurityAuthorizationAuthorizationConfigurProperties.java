package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyDropDown permissionsJr2;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyDropDown importBehavior;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray readPaths;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray administrativePrincipals;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger configurationRanking;
 /**
   * Get permissionsJr2
   * @return permissionsJr2
  **/
  @JsonProperty("permissionsJr2")
  public ConfigNodePropertyDropDown getPermissionsJr2() {
    return permissionsJr2;
  }

  public void setPermissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties permissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
    return this;
  }

 /**
   * Get importBehavior
   * @return importBehavior
  **/
  @JsonProperty("importBehavior")
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }

  public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties importBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
    return this;
  }

 /**
   * Get readPaths
   * @return readPaths
  **/
  @JsonProperty("readPaths")
  public ConfigNodePropertyArray getReadPaths() {
    return readPaths;
  }

  public void setReadPaths(ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties readPaths(ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
    return this;
  }

 /**
   * Get administrativePrincipals
   * @return administrativePrincipals
  **/
  @JsonProperty("administrativePrincipals")
  public ConfigNodePropertyArray getAdministrativePrincipals() {
    return administrativePrincipals;
  }

  public void setAdministrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties administrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
    return this;
  }

 /**
   * Get configurationRanking
   * @return configurationRanking
  **/
  @JsonProperty("configurationRanking")
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }

  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties configurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
    return this;
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
    return Objects.equals(this.permissionsJr2, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.permissionsJr2) &&
        Objects.equals(this.importBehavior, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.importBehavior) &&
        Objects.equals(this.readPaths, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.readPaths) &&
        Objects.equals(this.administrativePrincipals, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.administrativePrincipals) &&
        Objects.equals(this.configurationRanking, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.configurationRanking);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

