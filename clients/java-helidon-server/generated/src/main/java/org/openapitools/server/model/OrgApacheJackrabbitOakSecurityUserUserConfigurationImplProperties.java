package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties   {

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

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.
     *
     * @param usersPath usersPath
     * @param groupsPath groupsPath
     * @param systemRelativePath systemRelativePath
     * @param defaultDepth defaultDepth
     * @param importBehavior importBehavior
     * @param passwordHashAlgorithm passwordHashAlgorithm
     * @param passwordHashIterations passwordHashIterations
     * @param passwordSaltSize passwordSaltSize
     * @param omitAdminPw omitAdminPw
     * @param supportAutoSave supportAutoSave
     * @param passwordMaxAge passwordMaxAge
     * @param initialPasswordChange initialPasswordChange
     * @param passwordHistorySize passwordHistorySize
     * @param passwordExpiryForAdmin passwordExpiryForAdmin
     * @param cacheExpiration cacheExpiration
     * @param enableRFC7613UsercaseMappedProfile enableRFC7613UsercaseMappedProfile
     */
    public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(
        ConfigNodePropertyString usersPath, 
        ConfigNodePropertyString groupsPath, 
        ConfigNodePropertyString systemRelativePath, 
        ConfigNodePropertyInteger defaultDepth, 
        ConfigNodePropertyDropDown importBehavior, 
        ConfigNodePropertyString passwordHashAlgorithm, 
        ConfigNodePropertyInteger passwordHashIterations, 
        ConfigNodePropertyInteger passwordSaltSize, 
        ConfigNodePropertyBoolean omitAdminPw, 
        ConfigNodePropertyBoolean supportAutoSave, 
        ConfigNodePropertyInteger passwordMaxAge, 
        ConfigNodePropertyBoolean initialPasswordChange, 
        ConfigNodePropertyInteger passwordHistorySize, 
        ConfigNodePropertyBoolean passwordExpiryForAdmin, 
        ConfigNodePropertyInteger cacheExpiration, 
        ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile
    ) {
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



    /**
     * Get usersPath
     * @return usersPath
     */
    public ConfigNodePropertyString getUsersPath() {
        return usersPath;
    }

    public void setUsersPath(ConfigNodePropertyString usersPath) {
        this.usersPath = usersPath;
    }

    /**
     * Get groupsPath
     * @return groupsPath
     */
    public ConfigNodePropertyString getGroupsPath() {
        return groupsPath;
    }

    public void setGroupsPath(ConfigNodePropertyString groupsPath) {
        this.groupsPath = groupsPath;
    }

    /**
     * Get systemRelativePath
     * @return systemRelativePath
     */
    public ConfigNodePropertyString getSystemRelativePath() {
        return systemRelativePath;
    }

    public void setSystemRelativePath(ConfigNodePropertyString systemRelativePath) {
        this.systemRelativePath = systemRelativePath;
    }

    /**
     * Get defaultDepth
     * @return defaultDepth
     */
    public ConfigNodePropertyInteger getDefaultDepth() {
        return defaultDepth;
    }

    public void setDefaultDepth(ConfigNodePropertyInteger defaultDepth) {
        this.defaultDepth = defaultDepth;
    }

    /**
     * Get importBehavior
     * @return importBehavior
     */
    public ConfigNodePropertyDropDown getImportBehavior() {
        return importBehavior;
    }

    public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
        this.importBehavior = importBehavior;
    }

    /**
     * Get passwordHashAlgorithm
     * @return passwordHashAlgorithm
     */
    public ConfigNodePropertyString getPasswordHashAlgorithm() {
        return passwordHashAlgorithm;
    }

    public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
        this.passwordHashAlgorithm = passwordHashAlgorithm;
    }

    /**
     * Get passwordHashIterations
     * @return passwordHashIterations
     */
    public ConfigNodePropertyInteger getPasswordHashIterations() {
        return passwordHashIterations;
    }

    public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
        this.passwordHashIterations = passwordHashIterations;
    }

    /**
     * Get passwordSaltSize
     * @return passwordSaltSize
     */
    public ConfigNodePropertyInteger getPasswordSaltSize() {
        return passwordSaltSize;
    }

    public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
        this.passwordSaltSize = passwordSaltSize;
    }

    /**
     * Get omitAdminPw
     * @return omitAdminPw
     */
    public ConfigNodePropertyBoolean getOmitAdminPw() {
        return omitAdminPw;
    }

    public void setOmitAdminPw(ConfigNodePropertyBoolean omitAdminPw) {
        this.omitAdminPw = omitAdminPw;
    }

    /**
     * Get supportAutoSave
     * @return supportAutoSave
     */
    public ConfigNodePropertyBoolean getSupportAutoSave() {
        return supportAutoSave;
    }

    public void setSupportAutoSave(ConfigNodePropertyBoolean supportAutoSave) {
        this.supportAutoSave = supportAutoSave;
    }

    /**
     * Get passwordMaxAge
     * @return passwordMaxAge
     */
    public ConfigNodePropertyInteger getPasswordMaxAge() {
        return passwordMaxAge;
    }

    public void setPasswordMaxAge(ConfigNodePropertyInteger passwordMaxAge) {
        this.passwordMaxAge = passwordMaxAge;
    }

    /**
     * Get initialPasswordChange
     * @return initialPasswordChange
     */
    public ConfigNodePropertyBoolean getInitialPasswordChange() {
        return initialPasswordChange;
    }

    public void setInitialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange) {
        this.initialPasswordChange = initialPasswordChange;
    }

    /**
     * Get passwordHistorySize
     * @return passwordHistorySize
     */
    public ConfigNodePropertyInteger getPasswordHistorySize() {
        return passwordHistorySize;
    }

    public void setPasswordHistorySize(ConfigNodePropertyInteger passwordHistorySize) {
        this.passwordHistorySize = passwordHistorySize;
    }

    /**
     * Get passwordExpiryForAdmin
     * @return passwordExpiryForAdmin
     */
    public ConfigNodePropertyBoolean getPasswordExpiryForAdmin() {
        return passwordExpiryForAdmin;
    }

    public void setPasswordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin) {
        this.passwordExpiryForAdmin = passwordExpiryForAdmin;
    }

    /**
     * Get cacheExpiration
     * @return cacheExpiration
     */
    public ConfigNodePropertyInteger getCacheExpiration() {
        return cacheExpiration;
    }

    public void setCacheExpiration(ConfigNodePropertyInteger cacheExpiration) {
        this.cacheExpiration = cacheExpiration;
    }

    /**
     * Get enableRFC7613UsercaseMappedProfile
     * @return enableRFC7613UsercaseMappedProfile
     */
    public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
        return enableRFC7613UsercaseMappedProfile;
    }

    public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
        this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

