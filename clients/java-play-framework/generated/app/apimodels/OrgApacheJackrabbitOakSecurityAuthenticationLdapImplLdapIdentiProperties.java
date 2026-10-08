package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties   {
  @JsonProperty("provider.name")
  @Valid

  private ConfigNodePropertyString providerName;

  @JsonProperty("host.name")
  @Valid

  private ConfigNodePropertyString hostName;

  @JsonProperty("host.port")
  @Valid

  private ConfigNodePropertyInteger hostPort;

  @JsonProperty("host.ssl")
  @Valid

  private ConfigNodePropertyBoolean hostSsl;

  @JsonProperty("host.tls")
  @Valid

  private ConfigNodePropertyBoolean hostTls;

  @JsonProperty("host.noCertCheck")
  @Valid

  private ConfigNodePropertyBoolean hostNoCertCheck;

  @JsonProperty("bind.dn")
  @Valid

  private ConfigNodePropertyString bindDn;

  @JsonProperty("bind.password")
  @Valid

  private ConfigNodePropertyString bindPassword;

  @JsonProperty("searchTimeout")
  @Valid

  private ConfigNodePropertyString searchTimeout;

  @JsonProperty("adminPool.maxActive")
  @Valid

  private ConfigNodePropertyInteger adminPoolMaxActive;

  @JsonProperty("adminPool.lookupOnValidate")
  @Valid

  private ConfigNodePropertyBoolean adminPoolLookupOnValidate;

  @JsonProperty("userPool.maxActive")
  @Valid

  private ConfigNodePropertyInteger userPoolMaxActive;

  @JsonProperty("userPool.lookupOnValidate")
  @Valid

  private ConfigNodePropertyBoolean userPoolLookupOnValidate;

  @JsonProperty("user.baseDN")
  @Valid

  private ConfigNodePropertyString userBaseDN;

  @JsonProperty("user.objectclass")
  @Valid

  private ConfigNodePropertyArray userObjectclass;

  @JsonProperty("user.idAttribute")
  @Valid

  private ConfigNodePropertyString userIdAttribute;

  @JsonProperty("user.extraFilter")
  @Valid

  private ConfigNodePropertyString userExtraFilter;

  @JsonProperty("user.makeDnPath")
  @Valid

  private ConfigNodePropertyBoolean userMakeDnPath;

  @JsonProperty("group.baseDN")
  @Valid

  private ConfigNodePropertyString groupBaseDN;

  @JsonProperty("group.objectclass")
  @Valid

  private ConfigNodePropertyArray groupObjectclass;

  @JsonProperty("group.nameAttribute")
  @Valid

  private ConfigNodePropertyString groupNameAttribute;

  @JsonProperty("group.extraFilter")
  @Valid

  private ConfigNodePropertyString groupExtraFilter;

  @JsonProperty("group.makeDnPath")
  @Valid

  private ConfigNodePropertyBoolean groupMakeDnPath;

  @JsonProperty("group.memberAttribute")
  @Valid

  private ConfigNodePropertyString groupMemberAttribute;

  @JsonProperty("useUidForExtId")
  @Valid

  private ConfigNodePropertyBoolean useUidForExtId;

  @JsonProperty("customattributes")
  @Valid

  private ConfigNodePropertyArray customattributes;

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }

  public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
    return this;
  }

   /**
   * Get hostPort
   * @return hostPort
  **/
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }

  public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
    return this;
  }

   /**
   * Get hostSsl
   * @return hostSsl
  **/
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }

  public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
    return this;
  }

   /**
   * Get hostTls
   * @return hostTls
  **/
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }

  public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
    return this;
  }

   /**
   * Get hostNoCertCheck
   * @return hostNoCertCheck
  **/
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }

  public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
    return this;
  }

   /**
   * Get bindDn
   * @return bindDn
  **/
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }

  public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

   /**
   * Get bindPassword
   * @return bindPassword
  **/
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties searchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
    return this;
  }

   /**
   * Get searchTimeout
   * @return searchTimeout
  **/
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }

  public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
    return this;
  }

   /**
   * Get adminPoolMaxActive
   * @return adminPoolMaxActive
  **/
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }

  public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
    return this;
  }

   /**
   * Get adminPoolLookupOnValidate
   * @return adminPoolLookupOnValidate
  **/
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }

  public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
    return this;
  }

   /**
   * Get userPoolMaxActive
   * @return userPoolMaxActive
  **/
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }

  public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
    return this;
  }

   /**
   * Get userPoolLookupOnValidate
   * @return userPoolLookupOnValidate
  **/
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }

  public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
    return this;
  }

   /**
   * Get userBaseDN
   * @return userBaseDN
  **/
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }

  public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
    return this;
  }

   /**
   * Get userObjectclass
   * @return userObjectclass
  **/
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }

  public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
    return this;
  }

   /**
   * Get userIdAttribute
   * @return userIdAttribute
  **/
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }

  public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
    return this;
  }

   /**
   * Get userExtraFilter
   * @return userExtraFilter
  **/
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }

  public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
    return this;
  }

   /**
   * Get userMakeDnPath
   * @return userMakeDnPath
  **/
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }

  public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
    return this;
  }

   /**
   * Get groupBaseDN
   * @return groupBaseDN
  **/
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }

  public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
    return this;
  }

   /**
   * Get groupObjectclass
   * @return groupObjectclass
  **/
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }

  public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
    return this;
  }

   /**
   * Get groupNameAttribute
   * @return groupNameAttribute
  **/
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }

  public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
    return this;
  }

   /**
   * Get groupExtraFilter
   * @return groupExtraFilter
  **/
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }

  public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
    return this;
  }

   /**
   * Get groupMakeDnPath
   * @return groupMakeDnPath
  **/
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }

  public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
    return this;
  }

   /**
   * Get groupMemberAttribute
   * @return groupMemberAttribute
  **/
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties useUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
    return this;
  }

   /**
   * Get useUidForExtId
   * @return useUidForExtId
  **/
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }

  public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties customattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
    return this;
  }

   /**
   * Get customattributes
   * @return customattributes
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

