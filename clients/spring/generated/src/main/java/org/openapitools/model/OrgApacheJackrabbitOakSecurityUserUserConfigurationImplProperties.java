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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString usersPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupsPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString systemRelativePath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger defaultDepth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown importBehavior;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString passwordHashAlgorithm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger passwordHashIterations;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger passwordSaltSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean omitAdminPw;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean supportAutoSave;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger passwordMaxAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean initialPasswordChange;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger passwordHistorySize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean passwordExpiryForAdmin;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheExpiration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties usersPath(@Nullable ConfigNodePropertyString usersPath) {
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
  public @Nullable ConfigNodePropertyString getUsersPath() {
    return usersPath;
  }

  @JsonProperty("usersPath")
  public void setUsersPath(@Nullable ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties groupsPath(@Nullable ConfigNodePropertyString groupsPath) {
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
  public @Nullable ConfigNodePropertyString getGroupsPath() {
    return groupsPath;
  }

  @JsonProperty("groupsPath")
  public void setGroupsPath(@Nullable ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties systemRelativePath(@Nullable ConfigNodePropertyString systemRelativePath) {
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
  public @Nullable ConfigNodePropertyString getSystemRelativePath() {
    return systemRelativePath;
  }

  @JsonProperty("systemRelativePath")
  public void setSystemRelativePath(@Nullable ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties defaultDepth(@Nullable ConfigNodePropertyInteger defaultDepth) {
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
  public @Nullable ConfigNodePropertyInteger getDefaultDepth() {
    return defaultDepth;
  }

  @JsonProperty("defaultDepth")
  public void setDefaultDepth(@Nullable ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties importBehavior(@Nullable ConfigNodePropertyDropDown importBehavior) {
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
  public @Nullable ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }

  @JsonProperty("importBehavior")
  public void setImportBehavior(@Nullable ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashAlgorithm(@Nullable ConfigNodePropertyString passwordHashAlgorithm) {
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
  public @Nullable ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  @JsonProperty("passwordHashAlgorithm")
  public void setPasswordHashAlgorithm(@Nullable ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHashIterations(@Nullable ConfigNodePropertyInteger passwordHashIterations) {
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
  public @Nullable ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  @JsonProperty("passwordHashIterations")
  public void setPasswordHashIterations(@Nullable ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordSaltSize(@Nullable ConfigNodePropertyInteger passwordSaltSize) {
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
  public @Nullable ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  @JsonProperty("passwordSaltSize")
  public void setPasswordSaltSize(@Nullable ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties omitAdminPw(@Nullable ConfigNodePropertyBoolean omitAdminPw) {
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
  public @Nullable ConfigNodePropertyBoolean getOmitAdminPw() {
    return omitAdminPw;
  }

  @JsonProperty("omitAdminPw")
  public void setOmitAdminPw(@Nullable ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties supportAutoSave(@Nullable ConfigNodePropertyBoolean supportAutoSave) {
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
  public @Nullable ConfigNodePropertyBoolean getSupportAutoSave() {
    return supportAutoSave;
  }

  @JsonProperty("supportAutoSave")
  public void setSupportAutoSave(@Nullable ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordMaxAge(@Nullable ConfigNodePropertyInteger passwordMaxAge) {
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
  public @Nullable ConfigNodePropertyInteger getPasswordMaxAge() {
    return passwordMaxAge;
  }

  @JsonProperty("passwordMaxAge")
  public void setPasswordMaxAge(@Nullable ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties initialPasswordChange(@Nullable ConfigNodePropertyBoolean initialPasswordChange) {
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
  public @Nullable ConfigNodePropertyBoolean getInitialPasswordChange() {
    return initialPasswordChange;
  }

  @JsonProperty("initialPasswordChange")
  public void setInitialPasswordChange(@Nullable ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordHistorySize(@Nullable ConfigNodePropertyInteger passwordHistorySize) {
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
  public @Nullable ConfigNodePropertyInteger getPasswordHistorySize() {
    return passwordHistorySize;
  }

  @JsonProperty("passwordHistorySize")
  public void setPasswordHistorySize(@Nullable ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties passwordExpiryForAdmin(@Nullable ConfigNodePropertyBoolean passwordExpiryForAdmin) {
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
  public @Nullable ConfigNodePropertyBoolean getPasswordExpiryForAdmin() {
    return passwordExpiryForAdmin;
  }

  @JsonProperty("passwordExpiryForAdmin")
  public void setPasswordExpiryForAdmin(@Nullable ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties cacheExpiration(@Nullable ConfigNodePropertyInteger cacheExpiration) {
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
  public @Nullable ConfigNodePropertyInteger getCacheExpiration() {
    return cacheExpiration;
  }

  @JsonProperty("cacheExpiration")
  public void setCacheExpiration(@Nullable ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties enableRFC7613UsercaseMappedProfile(@Nullable ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
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
  public @Nullable ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  public void setEnableRFC7613UsercaseMappedProfile(@Nullable ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

