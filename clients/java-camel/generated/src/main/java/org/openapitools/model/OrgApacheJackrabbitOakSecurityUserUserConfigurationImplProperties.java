package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {

  private ConfigNodePropertyString usersPath;

  private ConfigNodePropertyString groupsPath;

  private ConfigNodePropertyString systemRelativePath;

  private ConfigNodePropertyInteger defaultDepth;

  private ConfigNodePropertyDropDown importBehavior;

  private ConfigNodePropertyString passwordHashAlgorithm;

  private ConfigNodePropertyInteger passwordHashIterations;

  private ConfigNodePropertyInteger passwordSaltSize;

  private ConfigNodePropertyBoolean omitAdminPw;

  private ConfigNodePropertyBoolean supportAutoSave;

  private ConfigNodePropertyInteger passwordMaxAge;

  private ConfigNodePropertyBoolean initialPasswordChange;

  private ConfigNodePropertyInteger passwordHistorySize;

  private ConfigNodePropertyBoolean passwordExpiryForAdmin;

  private ConfigNodePropertyInteger cacheExpiration;

  private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties usersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
    return this;
  }

  /**
   * Get usersPath
   * @return usersPath
   */
  @Valid 
  @Schema(name = "usersPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usersPath")
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
   */
  @Valid 
  @Schema(name = "groupsPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupsPath")
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
   */
  @Valid 
  @Schema(name = "systemRelativePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemRelativePath")
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
   */
  @Valid 
  @Schema(name = "defaultDepth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultDepth")
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
   */
  @Valid 
  @Schema(name = "importBehavior", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importBehavior")
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
   */
  @Valid 
  @Schema(name = "passwordHashAlgorithm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordHashAlgorithm")
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
   */
  @Valid 
  @Schema(name = "passwordHashIterations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordHashIterations")
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
   */
  @Valid 
  @Schema(name = "passwordSaltSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordSaltSize")
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
   */
  @Valid 
  @Schema(name = "omitAdminPw", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("omitAdminPw")
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
   */
  @Valid 
  @Schema(name = "supportAutoSave", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportAutoSave")
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
   */
  @Valid 
  @Schema(name = "passwordMaxAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordMaxAge")
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
   */
  @Valid 
  @Schema(name = "initialPasswordChange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initialPasswordChange")
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
   */
  @Valid 
  @Schema(name = "passwordHistorySize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordHistorySize")
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
   */
  @Valid 
  @Schema(name = "passwordExpiryForAdmin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordExpiryForAdmin")
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
   */
  @Valid 
  @Schema(name = "cacheExpiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheExpiration")
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
   */
  @Valid 
  @Schema(name = "enableRFC7613UsercaseMappedProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableRFC7613UsercaseMappedProfile")
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

