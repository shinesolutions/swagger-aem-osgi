package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties   {
  
  private ConfigNodePropertyDropDown permissionsJr2 = null;
  private ConfigNodePropertyDropDown importBehavior = null;
  private ConfigNodePropertyArray readPaths = null;
  private ConfigNodePropertyArray administrativePrincipals = null;
  private ConfigNodePropertyInteger configurationRanking = null;

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties () {

  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties (ConfigNodePropertyDropDown permissionsJr2, ConfigNodePropertyDropDown importBehavior, ConfigNodePropertyArray readPaths, ConfigNodePropertyArray administrativePrincipals, ConfigNodePropertyInteger configurationRanking) {
    this.permissionsJr2 = permissionsJr2;
    this.importBehavior = importBehavior;
    this.readPaths = readPaths;
    this.administrativePrincipals = administrativePrincipals;
    this.configurationRanking = configurationRanking;
  }

    
  @JsonProperty("permissionsJr2")
  public ConfigNodePropertyDropDown getPermissionsJr2() {
    return permissionsJr2;
  }
  public void setPermissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
  }

    
  @JsonProperty("importBehavior")
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }
  public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

    
  @JsonProperty("readPaths")
  public ConfigNodePropertyArray getReadPaths() {
    return readPaths;
  }
  public void setReadPaths(ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
  }

    
  @JsonProperty("administrativePrincipals")
  public ConfigNodePropertyArray getAdministrativePrincipals() {
    return administrativePrincipals;
  }
  public void setAdministrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
