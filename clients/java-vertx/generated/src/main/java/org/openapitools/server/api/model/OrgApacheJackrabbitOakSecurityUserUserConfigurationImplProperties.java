package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties   {
  
  private ConfigNodePropertyString usersPath = null;
  private ConfigNodePropertyString groupsPath = null;
  private ConfigNodePropertyString systemRelativePath = null;
  private ConfigNodePropertyInteger defaultDepth = null;
  private ConfigNodePropertyDropDown importBehavior = null;
  private ConfigNodePropertyString passwordHashAlgorithm = null;
  private ConfigNodePropertyInteger passwordHashIterations = null;
  private ConfigNodePropertyInteger passwordSaltSize = null;
  private ConfigNodePropertyBoolean omitAdminPw = null;
  private ConfigNodePropertyBoolean supportAutoSave = null;
  private ConfigNodePropertyInteger passwordMaxAge = null;
  private ConfigNodePropertyBoolean initialPasswordChange = null;
  private ConfigNodePropertyInteger passwordHistorySize = null;
  private ConfigNodePropertyBoolean passwordExpiryForAdmin = null;
  private ConfigNodePropertyInteger cacheExpiration = null;
  private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile = null;

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties () {

  }

  public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties (ConfigNodePropertyString usersPath, ConfigNodePropertyString groupsPath, ConfigNodePropertyString systemRelativePath, ConfigNodePropertyInteger defaultDepth, ConfigNodePropertyDropDown importBehavior, ConfigNodePropertyString passwordHashAlgorithm, ConfigNodePropertyInteger passwordHashIterations, ConfigNodePropertyInteger passwordSaltSize, ConfigNodePropertyBoolean omitAdminPw, ConfigNodePropertyBoolean supportAutoSave, ConfigNodePropertyInteger passwordMaxAge, ConfigNodePropertyBoolean initialPasswordChange, ConfigNodePropertyInteger passwordHistorySize, ConfigNodePropertyBoolean passwordExpiryForAdmin, ConfigNodePropertyInteger cacheExpiration, ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.usersPath = usersPath;
    this.groupsPath = groupsPath;
    this.systemRelativePath = systemRelativePath;
    this.defaultDepth = defaultDepth;
    this.importBehavior = importBehavior;
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    this.passwordHashIterations = passwordHashIterations;
    this.passwordSaltSize = passwordSaltSize;
    this.omitAdminPw = omitAdminPw;
    this.supportAutoSave = supportAutoSave;
    this.passwordMaxAge = passwordMaxAge;
    this.initialPasswordChange = initialPasswordChange;
    this.passwordHistorySize = passwordHistorySize;
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
    this.cacheExpiration = cacheExpiration;
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }

    
  @JsonProperty("usersPath")
  public ConfigNodePropertyString getUsersPath() {
    return usersPath;
  }
  public void setUsersPath(ConfigNodePropertyString usersPath) {
    this.usersPath = usersPath;
  }

    
  @JsonProperty("groupsPath")
  public ConfigNodePropertyString getGroupsPath() {
    return groupsPath;
  }
  public void setGroupsPath(ConfigNodePropertyString groupsPath) {
    this.groupsPath = groupsPath;
  }

    
  @JsonProperty("systemRelativePath")
  public ConfigNodePropertyString getSystemRelativePath() {
    return systemRelativePath;
  }
  public void setSystemRelativePath(ConfigNodePropertyString systemRelativePath) {
    this.systemRelativePath = systemRelativePath;
  }

    
  @JsonProperty("defaultDepth")
  public ConfigNodePropertyInteger getDefaultDepth() {
    return defaultDepth;
  }
  public void setDefaultDepth(ConfigNodePropertyInteger defaultDepth) {
    this.defaultDepth = defaultDepth;
  }

    
  @JsonProperty("importBehavior")
  public ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }
  public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

    
  @JsonProperty("passwordHashAlgorithm")
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }
  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

    
  @JsonProperty("passwordHashIterations")
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }
  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

    
  @JsonProperty("passwordSaltSize")
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }
  public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

    
  @JsonProperty("omitAdminPw")
  public ConfigNodePropertyBoolean getOmitAdminPw() {
    return omitAdminPw;
  }
  public void setOmitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
    this.omitAdminPw = omitAdminPw;
  }

    
  @JsonProperty("supportAutoSave")
  public ConfigNodePropertyBoolean getSupportAutoSave() {
    return supportAutoSave;
  }
  public void setSupportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
    this.supportAutoSave = supportAutoSave;
  }

    
  @JsonProperty("passwordMaxAge")
  public ConfigNodePropertyInteger getPasswordMaxAge() {
    return passwordMaxAge;
  }
  public void setPasswordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
    this.passwordMaxAge = passwordMaxAge;
  }

    
  @JsonProperty("initialPasswordChange")
  public ConfigNodePropertyBoolean getInitialPasswordChange() {
    return initialPasswordChange;
  }
  public void setInitialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
    this.initialPasswordChange = initialPasswordChange;
  }

    
  @JsonProperty("passwordHistorySize")
  public ConfigNodePropertyInteger getPasswordHistorySize() {
    return passwordHistorySize;
  }
  public void setPasswordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
    this.passwordHistorySize = passwordHistorySize;
  }

    
  @JsonProperty("passwordExpiryForAdmin")
  public ConfigNodePropertyBoolean getPasswordExpiryForAdmin() {
    return passwordExpiryForAdmin;
  }
  public void setPasswordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
    this.passwordExpiryForAdmin = passwordExpiryForAdmin;
  }

    
  @JsonProperty("cacheExpiration")
  public ConfigNodePropertyInteger getCacheExpiration() {
    return cacheExpiration;
  }
  public void setCacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
  }

    
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
    return Objects.equals(usersPath, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.usersPath) &&
        Objects.equals(groupsPath, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.groupsPath) &&
        Objects.equals(systemRelativePath, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.systemRelativePath) &&
        Objects.equals(defaultDepth, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.defaultDepth) &&
        Objects.equals(importBehavior, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.importBehavior) &&
        Objects.equals(passwordHashAlgorithm, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordHashAlgorithm) &&
        Objects.equals(passwordHashIterations, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordHashIterations) &&
        Objects.equals(passwordSaltSize, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordSaltSize) &&
        Objects.equals(omitAdminPw, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.omitAdminPw) &&
        Objects.equals(supportAutoSave, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.supportAutoSave) &&
        Objects.equals(passwordMaxAge, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordMaxAge) &&
        Objects.equals(initialPasswordChange, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.initialPasswordChange) &&
        Objects.equals(passwordHistorySize, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordHistorySize) &&
        Objects.equals(passwordExpiryForAdmin, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.passwordExpiryForAdmin) &&
        Objects.equals(cacheExpiration, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.cacheExpiration) &&
        Objects.equals(enableRFC7613UsercaseMappedProfile, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.enableRFC7613UsercaseMappedProfile);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
