package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString usersPath;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString groupsPath;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString systemRelativePath;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger defaultDepth;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyDropDown importBehavior;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString passwordHashAlgorithm;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger passwordHashIterations;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger passwordSaltSize;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean omitAdminPw;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean supportAutoSave;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger passwordMaxAge;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean initialPasswordChange;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger passwordHistorySize;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean passwordExpiryForAdmin;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger cacheExpiration;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;
 /**
   * Get usersPath
   * @return usersPath
  **/
  @JsonProperty("usersPath")
  public ConfigNodePropertyString getUsersPath() {
    return usersPath;
  }

  public void setUsersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties usersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
    return this;
  }

 /**
   * Get groupsPath
   * @return groupsPath
  **/
  @JsonProperty("groupsPath")
  public ConfigNodePropertyString getGroupsPath() {
    return groupsPath;
  }

  public void setGroupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties groupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
    return this;
  }

 /**
   * Get systemRelativePath
   * @return systemRelativePath
  **/
  @JsonProperty("systemRelativePath")
  public ConfigNodePropertyString getSystemRelativePath() {
    return systemRelativePath;
  }

  public void setSystemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties systemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
    return this;
  }

 /**
   * Get defaultDepth
   * @return defaultDepth
  **/
  @JsonProperty("defaultDepth")
  public ConfigNodePropertyInteger getDefaultDepth() {
    return defaultDepth;
  }

  public void setDefaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties defaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
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

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties importBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
    return this;
  }

 /**
   * Get passwordHashAlgorithm
   * @return passwordHashAlgorithm
  **/
  @JsonProperty("passwordHashAlgorithm")
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    return this;
  }

 /**
   * Get passwordHashIterations
   * @return passwordHashIterations
  **/
  @JsonProperty("passwordHashIterations")
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
    return this;
  }

 /**
   * Get passwordSaltSize
   * @return passwordSaltSize
  **/
  @JsonProperty("passwordSaltSize")
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
    return this;
  }

 /**
   * Get omitAdminPw
   * @return omitAdminPw
  **/
  @JsonProperty("omitAdminPw")
  public ConfigNodePropertyBoolean getOmitAdminPw() {
    return omitAdminPw;
  }

  public void setOmitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties omitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
    return this;
  }

 /**
   * Get supportAutoSave
   * @return supportAutoSave
  **/
  @JsonProperty("supportAutoSave")
  public ConfigNodePropertyBoolean getSupportAutoSave() {
    return supportAutoSave;
  }

  public void setSupportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties supportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
    return this;
  }

 /**
   * Get passwordMaxAge
   * @return passwordMaxAge
  **/
  @JsonProperty("passwordMaxAge")
  public ConfigNodePropertyInteger getPasswordMaxAge() {
    return passwordMaxAge;
  }

  public void setPasswordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
    return this;
  }

 /**
   * Get initialPasswordChange
   * @return initialPasswordChange
  **/
  @JsonProperty("initialPasswordChange")
  public ConfigNodePropertyBoolean getInitialPasswordChange() {
    return initialPasswordChange;
  }

  public void setInitialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties initialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
    return this;
  }

 /**
   * Get passwordHistorySize
   * @return passwordHistorySize
  **/
  @JsonProperty("passwordHistorySize")
  public ConfigNodePropertyInteger getPasswordHistorySize() {
    return passwordHistorySize;
  }

  public void setPasswordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
    return this;
  }

 /**
   * Get passwordExpiryForAdmin
   * @return passwordExpiryForAdmin
  **/
  @JsonProperty("passwordExpiryForAdmin")
  public ConfigNodePropertyBoolean getPasswordExpiryForAdmin() {
    return passwordExpiryForAdmin;
  }

  public void setPasswordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
    return this;
  }

 /**
   * Get cacheExpiration
   * @return cacheExpiration
  **/
  @JsonProperty("cacheExpiration")
  public ConfigNodePropertyInteger getCacheExpiration() {
    return cacheExpiration;
  }

  public void setCacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties cacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
    return this;
  }

 /**
   * Get enableRFC7613UsercaseMappedProfile
   * @return enableRFC7613UsercaseMappedProfile
  **/
  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties enableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

