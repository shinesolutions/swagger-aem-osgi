package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties   {
  @JsonProperty("permissionsJr2")
  private ConfigNodePropertyDropDown permissionsJr2 = null;

  @JsonProperty("importBehavior")
  private ConfigNodePropertyDropDown importBehavior = null;

  @JsonProperty("readPaths")
  private ConfigNodePropertyArray readPaths = null;

  @JsonProperty("administrativePrincipals")
  private ConfigNodePropertyArray administrativePrincipals = null;

  @JsonProperty("configurationRanking")
  private ConfigNodePropertyInteger configurationRanking = null;

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties permissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
    return this;
  }

   /**
   * Get permissionsJr2
   * @return permissionsJr2
  **/
  @Valid
  public ConfigNodePropertyDropDown getPermissionsJr2() {
    return permissionsJr2;
  }

  public void setPermissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties importBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
    return this;
  }

   /**
   * Get importBehavior
   * @return importBehavior
  **/
  @Valid
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }

  public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties readPaths(ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
    return this;
  }

   /**
   * Get readPaths
   * @return readPaths
  **/
  @Valid
  public ConfigNodePropertyArray getReadPaths() {
    return readPaths;
  }

  public void setReadPaths(ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties administrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
    return this;
  }

   /**
   * Get administrativePrincipals
   * @return administrativePrincipals
  **/
  @Valid
  public ConfigNodePropertyArray getAdministrativePrincipals() {
    return administrativePrincipals;
  }

  public void setAdministrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties configurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
    return this;
  }

   /**
   * Get configurationRanking
   * @return configurationRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }

  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

