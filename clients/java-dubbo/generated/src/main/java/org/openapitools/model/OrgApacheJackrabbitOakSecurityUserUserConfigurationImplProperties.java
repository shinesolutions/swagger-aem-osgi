package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("usersPath")
  private ConfigNodePropertyString usersPath;

  @JsonProperty("groupsPath")
  private ConfigNodePropertyString groupsPath;

  @JsonProperty("systemRelativePath")
  private ConfigNodePropertyString systemRelativePath;

  @JsonProperty("defaultDepth")
  private ConfigNodePropertyInteger defaultDepth;

  @JsonProperty("importBehavior")
  private ConfigNodePropertyDropDown importBehavior;

  @JsonProperty("passwordHashAlgorithm")
  private ConfigNodePropertyString passwordHashAlgorithm;

  @JsonProperty("passwordHashIterations")
  private ConfigNodePropertyInteger passwordHashIterations;

  @JsonProperty("passwordSaltSize")
  private ConfigNodePropertyInteger passwordSaltSize;

  @JsonProperty("omitAdminPw")
  private ConfigNodePropertyBoolean omitAdminPw;

  @JsonProperty("supportAutoSave")
  private ConfigNodePropertyBoolean supportAutoSave;

  @JsonProperty("passwordMaxAge")
  private ConfigNodePropertyInteger passwordMaxAge;

  @JsonProperty("initialPasswordChange")
  private ConfigNodePropertyBoolean initialPasswordChange;

  @JsonProperty("passwordHistorySize")
  private ConfigNodePropertyInteger passwordHistorySize;

  @JsonProperty("passwordExpiryForAdmin")
  private ConfigNodePropertyBoolean passwordExpiryForAdmin;

  @JsonProperty("cacheExpiration")
  private ConfigNodePropertyInteger cacheExpiration;

  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;

  /**
   * 
   * @return usersPath
   */
  public ConfigNodePropertyString getUsersPath() {
    return usersPath;
  }

  public void setUsersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
  }

  /**
   * 
   * @return groupsPath
   */
  public ConfigNodePropertyString getGroupsPath() {
    return groupsPath;
  }

  public void setGroupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
  }

  /**
   * 
   * @return systemRelativePath
   */
  public ConfigNodePropertyString getSystemRelativePath() {
    return systemRelativePath;
  }

  public void setSystemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
  }

  /**
   * 
   * @return defaultDepth
   */
  public ConfigNodePropertyInteger getDefaultDepth() {
    return defaultDepth;
  }

  public void setDefaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
  }

  /**
   * 
   * @return importBehavior
   */
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }

  public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  /**
   * 
   * @return passwordHashAlgorithm
   */
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  /**
   * 
   * @return passwordHashIterations
   */
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  /**
   * 
   * @return passwordSaltSize
   */
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

  /**
   * 
   * @return omitAdminPw
   */
  public ConfigNodePropertyBoolean getOmitAdminPw() {
    return omitAdminPw;
  }

  public void setOmitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
  }

  /**
   * 
   * @return supportAutoSave
   */
  public ConfigNodePropertyBoolean getSupportAutoSave() {
    return supportAutoSave;
  }

  public void setSupportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
  }

  /**
   * 
   * @return passwordMaxAge
   */
  public ConfigNodePropertyInteger getPasswordMaxAge() {
    return passwordMaxAge;
  }

  public void setPasswordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
  }

  /**
   * 
   * @return initialPasswordChange
   */
  public ConfigNodePropertyBoolean getInitialPasswordChange() {
    return initialPasswordChange;
  }

  public void setInitialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
  }

  /**
   * 
   * @return passwordHistorySize
   */
  public ConfigNodePropertyInteger getPasswordHistorySize() {
    return passwordHistorySize;
  }

  public void setPasswordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }

  /**
   * 
   * @return passwordExpiryForAdmin
   */
  public ConfigNodePropertyBoolean getPasswordExpiryForAdmin() {
    return passwordExpiryForAdmin;
  }

  public void setPasswordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
  }

  /**
   * 
   * @return cacheExpiration
   */
  public ConfigNodePropertyInteger getCacheExpiration() {
    return cacheExpiration;
  }

  public void setCacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
  }

  /**
   * 
   * @return enableRFC7613UsercaseMappedProfile
   */
  public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties = (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties) o;
    return Objects.equals(this.usersPath, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.usersPath) &&
        Objects.equals(this.groupsPath, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.groupsPath) &&
        Objects.equals(this.systemRelativePath, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.systemRelativePath) &&
        Objects.equals(this.defaultDepth, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.defaultDepth) &&
        Objects.equals(this.importBehavior, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.importBehavior) &&
        Objects.equals(this.passwordHashAlgorithm, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordHashAlgorithm) &&
        Objects.equals(this.passwordHashIterations, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordHashIterations) &&
        Objects.equals(this.passwordSaltSize, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordSaltSize) &&
        Objects.equals(this.omitAdminPw, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.omitAdminPw) &&
        Objects.equals(this.supportAutoSave, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.supportAutoSave) &&
        Objects.equals(this.passwordMaxAge, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordMaxAge) &&
        Objects.equals(this.initialPasswordChange, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.initialPasswordChange) &&
        Objects.equals(this.passwordHistorySize, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordHistorySize) &&
        Objects.equals(this.passwordExpiryForAdmin, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordExpiryForAdmin) &&
        Objects.equals(this.cacheExpiration, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.cacheExpiration) &&
        Objects.equals(this.enableRFC7613UsercaseMappedProfile, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.enableRFC7613UsercaseMappedProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usersPath, groupsPath, systemRelativePath, defaultDepth, importBehavior, passwordHashAlgorithm, passwordHashIterations, passwordSaltSize, omitAdminPw, supportAutoSave, passwordMaxAge, initialPasswordChange, passwordHistorySize, passwordExpiryForAdmin, cacheExpiration, enableRFC7613UsercaseMappedProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {\n");
    
    sb.append("    usersPath: ").append(toIndentedString(usersPath)).append("\n");
    sb.append("    groupsPath: ").append(toIndentedString(groupsPath)).append("\n");
    sb.append("    systemRelativePath: ").append(toIndentedString(systemRelativePath)).append("\n");
    sb.append("    defaultDepth: ").append(toIndentedString(defaultDepth)).append("\n");
    sb.append("    importBehavior: ").append(toIndentedString(importBehavior)).append("\n");
    sb.append("    passwordHashAlgorithm: ").append(toIndentedString(passwordHashAlgorithm)).append("\n");
    sb.append("    passwordHashIterations: ").append(toIndentedString(passwordHashIterations)).append("\n");
    sb.append("    passwordSaltSize: ").append(toIndentedString(passwordSaltSize)).append("\n");
    sb.append("    omitAdminPw: ").append(toIndentedString(omitAdminPw)).append("\n");
    sb.append("    supportAutoSave: ").append(toIndentedString(supportAutoSave)).append("\n");
    sb.append("    passwordMaxAge: ").append(toIndentedString(passwordMaxAge)).append("\n");
    sb.append("    initialPasswordChange: ").append(toIndentedString(initialPasswordChange)).append("\n");
    sb.append("    passwordHistorySize: ").append(toIndentedString(passwordHistorySize)).append("\n");
    sb.append("    passwordExpiryForAdmin: ").append(toIndentedString(passwordExpiryForAdmin)).append("\n");
    sb.append("    cacheExpiration: ").append(toIndentedString(cacheExpiration)).append("\n");
    sb.append("    enableRFC7613UsercaseMappedProfile: ").append(toIndentedString(enableRFC7613UsercaseMappedProfile)).append("\n");
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
