package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties   {

    private ConfigNodePropertyString providerName;
    private ConfigNodePropertyString hostName;
    private ConfigNodePropertyInteger hostPort;
    private ConfigNodePropertyBoolean hostSsl;
    private ConfigNodePropertyBoolean hostTls;
    private ConfigNodePropertyBoolean hostNoCertCheck;
    private ConfigNodePropertyString bindDn;
    private ConfigNodePropertyString bindPassword;
    private ConfigNodePropertyString searchTimeout;
    private ConfigNodePropertyInteger adminPoolMaxActive;
    private ConfigNodePropertyBoolean adminPoolLookupOnValidate;
    private ConfigNodePropertyInteger userPoolMaxActive;
    private ConfigNodePropertyBoolean userPoolLookupOnValidate;
    private ConfigNodePropertyString userBaseDN;
    private ConfigNodePropertyArray userObjectclass;
    private ConfigNodePropertyString userIdAttribute;
    private ConfigNodePropertyString userExtraFilter;
    private ConfigNodePropertyBoolean userMakeDnPath;
    private ConfigNodePropertyString groupBaseDN;
    private ConfigNodePropertyArray groupObjectclass;
    private ConfigNodePropertyString groupNameAttribute;
    private ConfigNodePropertyString groupExtraFilter;
    private ConfigNodePropertyBoolean groupMakeDnPath;
    private ConfigNodePropertyString groupMemberAttribute;
    private ConfigNodePropertyBoolean useUidForExtId;
    private ConfigNodePropertyArray customattributes;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.
     *
     * @param providerName providerName
     * @param hostName hostName
     * @param hostPort hostPort
     * @param hostSsl hostSsl
     * @param hostTls hostTls
     * @param hostNoCertCheck hostNoCertCheck
     * @param bindDn bindDn
     * @param bindPassword bindPassword
     * @param searchTimeout searchTimeout
     * @param adminPoolMaxActive adminPoolMaxActive
     * @param adminPoolLookupOnValidate adminPoolLookupOnValidate
     * @param userPoolMaxActive userPoolMaxActive
     * @param userPoolLookupOnValidate userPoolLookupOnValidate
     * @param userBaseDN userBaseDN
     * @param userObjectclass userObjectclass
     * @param userIdAttribute userIdAttribute
     * @param userExtraFilter userExtraFilter
     * @param userMakeDnPath userMakeDnPath
     * @param groupBaseDN groupBaseDN
     * @param groupObjectclass groupObjectclass
     * @param groupNameAttribute groupNameAttribute
     * @param groupExtraFilter groupExtraFilter
     * @param groupMakeDnPath groupMakeDnPath
     * @param groupMemberAttribute groupMemberAttribute
     * @param useUidForExtId useUidForExtId
     * @param customattributes customattributes
     */
    public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(
        ConfigNodePropertyString providerName, 
        ConfigNodePropertyString hostName, 
        ConfigNodePropertyInteger hostPort, 
        ConfigNodePropertyBoolean hostSsl, 
        ConfigNodePropertyBoolean hostTls, 
        ConfigNodePropertyBoolean hostNoCertCheck, 
        ConfigNodePropertyString bindDn, 
        ConfigNodePropertyString bindPassword, 
        ConfigNodePropertyString searchTimeout, 
        ConfigNodePropertyInteger adminPoolMaxActive, 
        ConfigNodePropertyBoolean adminPoolLookupOnValidate, 
        ConfigNodePropertyInteger userPoolMaxActive, 
        ConfigNodePropertyBoolean userPoolLookupOnValidate, 
        ConfigNodePropertyString userBaseDN, 
        ConfigNodePropertyArray userObjectclass, 
        ConfigNodePropertyString userIdAttribute, 
        ConfigNodePropertyString userExtraFilter, 
        ConfigNodePropertyBoolean userMakeDnPath, 
        ConfigNodePropertyString groupBaseDN, 
        ConfigNodePropertyArray groupObjectclass, 
        ConfigNodePropertyString groupNameAttribute, 
        ConfigNodePropertyString groupExtraFilter, 
        ConfigNodePropertyBoolean groupMakeDnPath, 
        ConfigNodePropertyString groupMemberAttribute, 
        ConfigNodePropertyBoolean useUidForExtId, 
        ConfigNodePropertyArray customattributes
    ) {
        this.providerName = providerName;
        this.hostName = hostName;
        this.hostPort = hostPort;
        this.hostSsl = hostSsl;
        this.hostTls = hostTls;
        this.hostNoCertCheck = hostNoCertCheck;
        this.bindDn = bindDn;
        this.bindPassword = bindPassword;
        this.searchTimeout = searchTimeout;
        this.adminPoolMaxActive = adminPoolMaxActive;
        this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
        this.userPoolMaxActive = userPoolMaxActive;
        this.userPoolLookupOnValidate = userPoolLookupOnValidate;
        this.userBaseDN = userBaseDN;
        this.userObjectclass = userObjectclass;
        this.userIdAttribute = userIdAttribute;
        this.userExtraFilter = userExtraFilter;
        this.userMakeDnPath = userMakeDnPath;
        this.groupBaseDN = groupBaseDN;
        this.groupObjectclass = groupObjectclass;
        this.groupNameAttribute = groupNameAttribute;
        this.groupExtraFilter = groupExtraFilter;
        this.groupMakeDnPath = groupMakeDnPath;
        this.groupMemberAttribute = groupMemberAttribute;
        this.useUidForExtId = useUidForExtId;
        this.customattributes = customattributes;
    }



    /**
     * Get providerName
     * @return providerName
     */
    public ConfigNodePropertyString getProviderName() {
        return providerName;
    }

    public void setProviderName(ConfigNodePropertyString providerName) {
        this.providerName = providerName;
    }

    /**
     * Get hostName
     * @return hostName
     */
    public ConfigNodePropertyString getHostName() {
        return hostName;
    }

    public void setHostName(ConfigNodePropertyString hostName) {
        this.hostName = hostName;
    }

    /**
     * Get hostPort
     * @return hostPort
     */
    public ConfigNodePropertyInteger getHostPort() {
        return hostPort;
    }

    public void setHostPort(ConfigNodePropertyInteger hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * Get hostSsl
     * @return hostSsl
     */
    public ConfigNodePropertyBoolean getHostSsl() {
        return hostSsl;
    }

    public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
        this.hostSsl = hostSsl;
    }

    /**
     * Get hostTls
     * @return hostTls
     */
    public ConfigNodePropertyBoolean getHostTls() {
        return hostTls;
    }

    public void setHostTls(ConfigNodePropertyBoolean hostTls) {
        this.hostTls = hostTls;
    }

    /**
     * Get hostNoCertCheck
     * @return hostNoCertCheck
     */
    public ConfigNodePropertyBoolean getHostNoCertCheck() {
        return hostNoCertCheck;
    }

    public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
        this.hostNoCertCheck = hostNoCertCheck;
    }

    /**
     * Get bindDn
     * @return bindDn
     */
    public ConfigNodePropertyString getBindDn() {
        return bindDn;
    }

    public void setBindDn(ConfigNodePropertyString bindDn) {
        this.bindDn = bindDn;
    }

    /**
     * Get bindPassword
     * @return bindPassword
     */
    public ConfigNodePropertyString getBindPassword() {
        return bindPassword;
    }

    public void setBindPassword(ConfigNodePropertyString bindPassword) {
        this.bindPassword = bindPassword;
    }

    /**
     * Get searchTimeout
     * @return searchTimeout
     */
    public ConfigNodePropertyString getSearchTimeout() {
        return searchTimeout;
    }

    public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
        this.searchTimeout = searchTimeout;
    }

    /**
     * Get adminPoolMaxActive
     * @return adminPoolMaxActive
     */
    public ConfigNodePropertyInteger getAdminPoolMaxActive() {
        return adminPoolMaxActive;
    }

    public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
        this.adminPoolMaxActive = adminPoolMaxActive;
    }

    /**
     * Get adminPoolLookupOnValidate
     * @return adminPoolLookupOnValidate
     */
    public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
        return adminPoolLookupOnValidate;
    }

    public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
        this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
    }

    /**
     * Get userPoolMaxActive
     * @return userPoolMaxActive
     */
    public ConfigNodePropertyInteger getUserPoolMaxActive() {
        return userPoolMaxActive;
    }

    public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
        this.userPoolMaxActive = userPoolMaxActive;
    }

    /**
     * Get userPoolLookupOnValidate
     * @return userPoolLookupOnValidate
     */
    public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
        return userPoolLookupOnValidate;
    }

    public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
        this.userPoolLookupOnValidate = userPoolLookupOnValidate;
    }

    /**
     * Get userBaseDN
     * @return userBaseDN
     */
    public ConfigNodePropertyString getUserBaseDN() {
        return userBaseDN;
    }

    public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
        this.userBaseDN = userBaseDN;
    }

    /**
     * Get userObjectclass
     * @return userObjectclass
     */
    public ConfigNodePropertyArray getUserObjectclass() {
        return userObjectclass;
    }

    public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
        this.userObjectclass = userObjectclass;
    }

    /**
     * Get userIdAttribute
     * @return userIdAttribute
     */
    public ConfigNodePropertyString getUserIdAttribute() {
        return userIdAttribute;
    }

    public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
        this.userIdAttribute = userIdAttribute;
    }

    /**
     * Get userExtraFilter
     * @return userExtraFilter
     */
    public ConfigNodePropertyString getUserExtraFilter() {
        return userExtraFilter;
    }

    public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
        this.userExtraFilter = userExtraFilter;
    }

    /**
     * Get userMakeDnPath
     * @return userMakeDnPath
     */
    public ConfigNodePropertyBoolean getUserMakeDnPath() {
        return userMakeDnPath;
    }

    public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
        this.userMakeDnPath = userMakeDnPath;
    }

    /**
     * Get groupBaseDN
     * @return groupBaseDN
     */
    public ConfigNodePropertyString getGroupBaseDN() {
        return groupBaseDN;
    }

    public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
        this.groupBaseDN = groupBaseDN;
    }

    /**
     * Get groupObjectclass
     * @return groupObjectclass
     */
    public ConfigNodePropertyArray getGroupObjectclass() {
        return groupObjectclass;
    }

    public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
        this.groupObjectclass = groupObjectclass;
    }

    /**
     * Get groupNameAttribute
     * @return groupNameAttribute
     */
    public ConfigNodePropertyString getGroupNameAttribute() {
        return groupNameAttribute;
    }

    public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
        this.groupNameAttribute = groupNameAttribute;
    }

    /**
     * Get groupExtraFilter
     * @return groupExtraFilter
     */
    public ConfigNodePropertyString getGroupExtraFilter() {
        return groupExtraFilter;
    }

    public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
        this.groupExtraFilter = groupExtraFilter;
    }

    /**
     * Get groupMakeDnPath
     * @return groupMakeDnPath
     */
    public ConfigNodePropertyBoolean getGroupMakeDnPath() {
        return groupMakeDnPath;
    }

    public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
        this.groupMakeDnPath = groupMakeDnPath;
    }

    /**
     * Get groupMemberAttribute
     * @return groupMemberAttribute
     */
    public ConfigNodePropertyString getGroupMemberAttribute() {
        return groupMemberAttribute;
    }

    public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
        this.groupMemberAttribute = groupMemberAttribute;
    }

    /**
     * Get useUidForExtId
     * @return useUidForExtId
     */
    public ConfigNodePropertyBoolean getUseUidForExtId() {
        return useUidForExtId;
    }

    public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
        this.useUidForExtId = useUidForExtId;
    }

    /**
     * Get customattributes
     * @return customattributes
     */
    public ConfigNodePropertyArray getCustomattributes() {
        return customattributes;
    }

    public void setCustomattributes(ConfigNodePropertyArray customattributes) {
        this.customattributes = customattributes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {\n");
        
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
        sb.append("    hostSsl: ").append(toIndentedString(hostSsl)).append("\n");
        sb.append("    hostTls: ").append(toIndentedString(hostTls)).append("\n");
        sb.append("    hostNoCertCheck: ").append(toIndentedString(hostNoCertCheck)).append("\n");
        sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
        sb.append("    bindPassword: ").append(toIndentedString(bindPassword)).append("\n");
        sb.append("    searchTimeout: ").append(toIndentedString(searchTimeout)).append("\n");
        sb.append("    adminPoolMaxActive: ").append(toIndentedString(adminPoolMaxActive)).append("\n");
        sb.append("    adminPoolLookupOnValidate: ").append(toIndentedString(adminPoolLookupOnValidate)).append("\n");
        sb.append("    userPoolMaxActive: ").append(toIndentedString(userPoolMaxActive)).append("\n");
        sb.append("    userPoolLookupOnValidate: ").append(toIndentedString(userPoolLookupOnValidate)).append("\n");
        sb.append("    userBaseDN: ").append(toIndentedString(userBaseDN)).append("\n");
        sb.append("    userObjectclass: ").append(toIndentedString(userObjectclass)).append("\n");
        sb.append("    userIdAttribute: ").append(toIndentedString(userIdAttribute)).append("\n");
        sb.append("    userExtraFilter: ").append(toIndentedString(userExtraFilter)).append("\n");
        sb.append("    userMakeDnPath: ").append(toIndentedString(userMakeDnPath)).append("\n");
        sb.append("    groupBaseDN: ").append(toIndentedString(groupBaseDN)).append("\n");
        sb.append("    groupObjectclass: ").append(toIndentedString(groupObjectclass)).append("\n");
        sb.append("    groupNameAttribute: ").append(toIndentedString(groupNameAttribute)).append("\n");
        sb.append("    groupExtraFilter: ").append(toIndentedString(groupExtraFilter)).append("\n");
        sb.append("    groupMakeDnPath: ").append(toIndentedString(groupMakeDnPath)).append("\n");
        sb.append("    groupMemberAttribute: ").append(toIndentedString(groupMemberAttribute)).append("\n");
        sb.append("    useUidForExtId: ").append(toIndentedString(useUidForExtId)).append("\n");
        sb.append("    customattributes: ").append(toIndentedString(customattributes)).append("\n");
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

