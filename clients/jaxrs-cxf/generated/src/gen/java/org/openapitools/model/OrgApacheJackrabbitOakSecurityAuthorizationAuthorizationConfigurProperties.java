package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
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

public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown permissionsJr2 = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown importBehavior = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray readPaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray administrativePrincipals = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger configurationRanking = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

