package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties   {
  @JsonProperty("usersPath")
  private ConfigNodePropertyString usersPath = null;

  @JsonProperty("groupsPath")
  private ConfigNodePropertyString groupsPath = null;

  @JsonProperty("systemRelativePath")
  private ConfigNodePropertyString systemRelativePath = null;

  @JsonProperty("defaultDepth")
  private ConfigNodePropertyInteger defaultDepth = null;

  @JsonProperty("importBehavior")
  private ConfigNodePropertyDropDown importBehavior = null;

  @JsonProperty("passwordHashAlgorithm")
  private ConfigNodePropertyString passwordHashAlgorithm = null;

  @JsonProperty("passwordHashIterations")
  private ConfigNodePropertyInteger passwordHashIterations = null;

  @JsonProperty("passwordSaltSize")
  private ConfigNodePropertyInteger passwordSaltSize = null;

  @JsonProperty("omitAdminPw")
  private ConfigNodePropertyBoolean omitAdminPw = null;

  @JsonProperty("supportAutoSave")
  private ConfigNodePropertyBoolean supportAutoSave = null;

  @JsonProperty("passwordMaxAge")
  private ConfigNodePropertyInteger passwordMaxAge = null;

  @JsonProperty("initialPasswordChange")
  private ConfigNodePropertyBoolean initialPasswordChange = null;

  @JsonProperty("passwordHistorySize")
  private ConfigNodePropertyInteger passwordHistorySize = null;

  @JsonProperty("passwordExpiryForAdmin")
  private ConfigNodePropertyBoolean passwordExpiryForAdmin = null;

  @JsonProperty("cacheExpiration")
  private ConfigNodePropertyInteger cacheExpiration = null;

  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile = null;

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties usersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
    return this;
  }

   /**
   * Get usersPath
   * @return usersPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUsersPath() {
    return usersPath;
  }

  public void setUsersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties groupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
    return this;
  }

   /**
   * Get groupsPath
   * @return groupsPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupsPath() {
    return groupsPath;
  }

  public void setGroupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties systemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
    return this;
  }

   /**
   * Get systemRelativePath
   * @return systemRelativePath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSystemRelativePath() {
    return systemRelativePath;
  }

  public void setSystemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties defaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
    return this;
  }

   /**
   * Get defaultDepth
   * @return defaultDepth
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDefaultDepth() {
    return defaultDepth;
  }

  public void setDefaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties importBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
    return this;
  }

   /**
   * Get importBehavior
   * @return importBehavior
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }

  public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    return this;
  }

   /**
   * Get passwordHashAlgorithm
   * @return passwordHashAlgorithm
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
    return this;
  }

   /**
   * Get passwordHashIterations
   * @return passwordHashIterations
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
    return this;
  }

   /**
   * Get passwordSaltSize
   * @return passwordSaltSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties omitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
    return this;
  }

   /**
   * Get omitAdminPw
   * @return omitAdminPw
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOmitAdminPw() {
    return omitAdminPw;
  }

  public void setOmitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties supportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
    return this;
  }

   /**
   * Get supportAutoSave
   * @return supportAutoSave
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSupportAutoSave() {
    return supportAutoSave;
  }

  public void setSupportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
    return this;
  }

   /**
   * Get passwordMaxAge
   * @return passwordMaxAge
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPasswordMaxAge() {
    return passwordMaxAge;
  }

  public void setPasswordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties initialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
    return this;
  }

   /**
   * Get initialPasswordChange
   * @return initialPasswordChange
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getInitialPasswordChange() {
    return initialPasswordChange;
  }

  public void setInitialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
    return this;
  }

   /**
   * Get passwordHistorySize
   * @return passwordHistorySize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPasswordHistorySize() {
    return passwordHistorySize;
  }

  public void setPasswordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
    return this;
  }

   /**
   * Get passwordExpiryForAdmin
   * @return passwordExpiryForAdmin
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPasswordExpiryForAdmin() {
    return passwordExpiryForAdmin;
  }

  public void setPasswordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties cacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
    return this;
  }

   /**
   * Get cacheExpiration
   * @return cacheExpiration
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCacheExpiration() {
    return cacheExpiration;
  }

  public void setCacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties enableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    return this;
  }

   /**
   * Get enableRFC7613UsercaseMappedProfile
   * @return enableRFC7613UsercaseMappedProfile
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

