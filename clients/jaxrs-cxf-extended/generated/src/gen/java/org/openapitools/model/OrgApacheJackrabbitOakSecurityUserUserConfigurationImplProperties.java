package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  */
  @JsonProperty("usersPath")
  public ConfigNodePropertyString getUsersPath() {
    return usersPath;
  }

  /**
   * Sets the <code>usersPath</code> property.
   */
 public void setUsersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
  }

  /**
   * Sets the <code>usersPath</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties usersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
    return this;
  }

 /**
  * Get groupsPath
  * @return groupsPath
  */
  @JsonProperty("groupsPath")
  public ConfigNodePropertyString getGroupsPath() {
    return groupsPath;
  }

  /**
   * Sets the <code>groupsPath</code> property.
   */
 public void setGroupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
  }

  /**
   * Sets the <code>groupsPath</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties groupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
    return this;
  }

 /**
  * Get systemRelativePath
  * @return systemRelativePath
  */
  @JsonProperty("systemRelativePath")
  public ConfigNodePropertyString getSystemRelativePath() {
    return systemRelativePath;
  }

  /**
   * Sets the <code>systemRelativePath</code> property.
   */
 public void setSystemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
  }

  /**
   * Sets the <code>systemRelativePath</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties systemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
    return this;
  }

 /**
  * Get defaultDepth
  * @return defaultDepth
  */
  @JsonProperty("defaultDepth")
  public ConfigNodePropertyInteger getDefaultDepth() {
    return defaultDepth;
  }

  /**
   * Sets the <code>defaultDepth</code> property.
   */
 public void setDefaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
  }

  /**
   * Sets the <code>defaultDepth</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties defaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
    return this;
  }

 /**
  * Get importBehavior
  * @return importBehavior
  */
  @JsonProperty("importBehavior")
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }

  /**
   * Sets the <code>importBehavior</code> property.
   */
 public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  /**
   * Sets the <code>importBehavior</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties importBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
    return this;
  }

 /**
  * Get passwordHashAlgorithm
  * @return passwordHashAlgorithm
  */
  @JsonProperty("passwordHashAlgorithm")
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  /**
   * Sets the <code>passwordHashAlgorithm</code> property.
   */
 public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  /**
   * Sets the <code>passwordHashAlgorithm</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    return this;
  }

 /**
  * Get passwordHashIterations
  * @return passwordHashIterations
  */
  @JsonProperty("passwordHashIterations")
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  /**
   * Sets the <code>passwordHashIterations</code> property.
   */
 public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  /**
   * Sets the <code>passwordHashIterations</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
    return this;
  }

 /**
  * Get passwordSaltSize
  * @return passwordSaltSize
  */
  @JsonProperty("passwordSaltSize")
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  /**
   * Sets the <code>passwordSaltSize</code> property.
   */
 public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

  /**
   * Sets the <code>passwordSaltSize</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
    return this;
  }

 /**
  * Get omitAdminPw
  * @return omitAdminPw
  */
  @JsonProperty("omitAdminPw")
  public ConfigNodePropertyBoolean getOmitAdminPw() {
    return omitAdminPw;
  }

  /**
   * Sets the <code>omitAdminPw</code> property.
   */
 public void setOmitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
  }

  /**
   * Sets the <code>omitAdminPw</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties omitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
    return this;
  }

 /**
  * Get supportAutoSave
  * @return supportAutoSave
  */
  @JsonProperty("supportAutoSave")
  public ConfigNodePropertyBoolean getSupportAutoSave() {
    return supportAutoSave;
  }

  /**
   * Sets the <code>supportAutoSave</code> property.
   */
 public void setSupportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
  }

  /**
   * Sets the <code>supportAutoSave</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties supportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
    return this;
  }

 /**
  * Get passwordMaxAge
  * @return passwordMaxAge
  */
  @JsonProperty("passwordMaxAge")
  public ConfigNodePropertyInteger getPasswordMaxAge() {
    return passwordMaxAge;
  }

  /**
   * Sets the <code>passwordMaxAge</code> property.
   */
 public void setPasswordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
  }

  /**
   * Sets the <code>passwordMaxAge</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
    return this;
  }

 /**
  * Get initialPasswordChange
  * @return initialPasswordChange
  */
  @JsonProperty("initialPasswordChange")
  public ConfigNodePropertyBoolean getInitialPasswordChange() {
    return initialPasswordChange;
  }

  /**
   * Sets the <code>initialPasswordChange</code> property.
   */
 public void setInitialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
  }

  /**
   * Sets the <code>initialPasswordChange</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties initialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
    return this;
  }

 /**
  * Get passwordHistorySize
  * @return passwordHistorySize
  */
  @JsonProperty("passwordHistorySize")
  public ConfigNodePropertyInteger getPasswordHistorySize() {
    return passwordHistorySize;
  }

  /**
   * Sets the <code>passwordHistorySize</code> property.
   */
 public void setPasswordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }

  /**
   * Sets the <code>passwordHistorySize</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
    return this;
  }

 /**
  * Get passwordExpiryForAdmin
  * @return passwordExpiryForAdmin
  */
  @JsonProperty("passwordExpiryForAdmin")
  public ConfigNodePropertyBoolean getPasswordExpiryForAdmin() {
    return passwordExpiryForAdmin;
  }

  /**
   * Sets the <code>passwordExpiryForAdmin</code> property.
   */
 public void setPasswordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
  }

  /**
   * Sets the <code>passwordExpiryForAdmin</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
    return this;
  }

 /**
  * Get cacheExpiration
  * @return cacheExpiration
  */
  @JsonProperty("cacheExpiration")
  public ConfigNodePropertyInteger getCacheExpiration() {
    return cacheExpiration;
  }

  /**
   * Sets the <code>cacheExpiration</code> property.
   */
 public void setCacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
  }

  /**
   * Sets the <code>cacheExpiration</code> property.
   */
  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties cacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
    return this;
  }

 /**
  * Get enableRFC7613UsercaseMappedProfile
  * @return enableRFC7613UsercaseMappedProfile
  */
  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  /**
   * Sets the <code>enableRFC7613UsercaseMappedProfile</code> property.
   */
 public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }

  /**
   * Sets the <code>enableRFC7613UsercaseMappedProfile</code> property.
   */
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

