package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties () {

  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties (ConfigNodePropertyString providerName, ConfigNodePropertyString hostName, ConfigNodePropertyInteger hostPort, ConfigNodePropertyBoolean hostSsl, ConfigNodePropertyBoolean hostTls, ConfigNodePropertyBoolean hostNoCertCheck, ConfigNodePropertyString bindDn, ConfigNodePropertyString bindPassword, ConfigNodePropertyString searchTimeout, ConfigNodePropertyInteger adminPoolMaxActive, ConfigNodePropertyBoolean adminPoolLookupOnValidate, ConfigNodePropertyInteger userPoolMaxActive, ConfigNodePropertyBoolean userPoolLookupOnValidate, ConfigNodePropertyString userBaseDN, ConfigNodePropertyArray userObjectclass, ConfigNodePropertyString userIdAttribute, ConfigNodePropertyString userExtraFilter, ConfigNodePropertyBoolean userMakeDnPath, ConfigNodePropertyString groupBaseDN, ConfigNodePropertyArray groupObjectclass, ConfigNodePropertyString groupNameAttribute, ConfigNodePropertyString groupExtraFilter, ConfigNodePropertyBoolean groupMakeDnPath, ConfigNodePropertyString groupMemberAttribute, ConfigNodePropertyBoolean useUidForExtId, ConfigNodePropertyArray customattributes) {
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

    
  @JsonProperty("provider.name")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }
  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

    
  @JsonProperty("host.name")
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }
  public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

    
  @JsonProperty("host.port")
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }
  public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

    
  @JsonProperty("host.ssl")
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }
  public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

    
  @JsonProperty("host.tls")
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }
  public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

    
  @JsonProperty("host.noCertCheck")
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }
  public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

    
  @JsonProperty("bind.dn")
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }
  public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

    
  @JsonProperty("bind.password")
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }
  public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

    
  @JsonProperty("searchTimeout")
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }
  public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

    
  @JsonProperty("adminPool.maxActive")
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }
  public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

    
  @JsonProperty("adminPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }
  public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

    
  @JsonProperty("userPool.maxActive")
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }
  public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

    
  @JsonProperty("userPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }
  public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

    
  @JsonProperty("user.baseDN")
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }
  public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

    
  @JsonProperty("user.objectclass")
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }
  public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

    
  @JsonProperty("user.idAttribute")
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }
  public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

    
  @JsonProperty("user.extraFilter")
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }
  public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

    
  @JsonProperty("user.makeDnPath")
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }
  public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

    
  @JsonProperty("group.baseDN")
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }
  public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

    
  @JsonProperty("group.objectclass")
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }
  public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

    
  @JsonProperty("group.nameAttribute")
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }
  public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

    
  @JsonProperty("group.extraFilter")
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }
  public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

    
  @JsonProperty("group.makeDnPath")
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }
  public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

    
  @JsonProperty("group.memberAttribute")
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }
  public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

    
  @JsonProperty("useUidForExtId")
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }
  public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

    
  @JsonProperty("customattributes")
  public ConfigNodePropertyArray getCustomattributes() {
    return customattributes;
  }
  public void setCustomattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties = (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) o;
    return Objects.equals(providerName, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.providerName) &&
        Objects.equals(hostName, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostName) &&
        Objects.equals(hostPort, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostPort) &&
        Objects.equals(hostSsl, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostSsl) &&
        Objects.equals(hostTls, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostTls) &&
        Objects.equals(hostNoCertCheck, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostNoCertCheck) &&
        Objects.equals(bindDn, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindDn) &&
        Objects.equals(bindPassword, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindPassword) &&
        Objects.equals(searchTimeout, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.searchTimeout) &&
        Objects.equals(adminPoolMaxActive, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolMaxActive) &&
        Objects.equals(adminPoolLookupOnValidate, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolLookupOnValidate) &&
        Objects.equals(userPoolMaxActive, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolMaxActive) &&
        Objects.equals(userPoolLookupOnValidate, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolLookupOnValidate) &&
        Objects.equals(userBaseDN, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userBaseDN) &&
        Objects.equals(userObjectclass, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userObjectclass) &&
        Objects.equals(userIdAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userIdAttribute) &&
        Objects.equals(userExtraFilter, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userExtraFilter) &&
        Objects.equals(userMakeDnPath, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userMakeDnPath) &&
        Objects.equals(groupBaseDN, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupBaseDN) &&
        Objects.equals(groupObjectclass, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupObjectclass) &&
        Objects.equals(groupNameAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupNameAttribute) &&
        Objects.equals(groupExtraFilter, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupExtraFilter) &&
        Objects.equals(groupMakeDnPath, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMakeDnPath) &&
        Objects.equals(groupMemberAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMemberAttribute) &&
        Objects.equals(useUidForExtId, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.useUidForExtId) &&
        Objects.equals(customattributes, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.customattributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, hostName, hostPort, hostSsl, hostTls, hostNoCertCheck, bindDn, bindPassword, searchTimeout, adminPoolMaxActive, adminPoolLookupOnValidate, userPoolMaxActive, userPoolLookupOnValidate, userBaseDN, userObjectclass, userIdAttribute, userExtraFilter, userMakeDnPath, groupBaseDN, groupObjectclass, groupNameAttribute, groupExtraFilter, groupMakeDnPath, groupMemberAttribute, useUidForExtId, customattributes);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
