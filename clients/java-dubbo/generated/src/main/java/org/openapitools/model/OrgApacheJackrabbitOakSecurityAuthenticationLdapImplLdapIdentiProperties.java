package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("provider.name")
  private ConfigNodePropertyString providerName;

  @JsonProperty("host.name")
  private ConfigNodePropertyString hostName;

  @JsonProperty("host.port")
  private ConfigNodePropertyInteger hostPort;

  @JsonProperty("host.ssl")
  private ConfigNodePropertyBoolean hostSsl;

  @JsonProperty("host.tls")
  private ConfigNodePropertyBoolean hostTls;

  @JsonProperty("host.noCertCheck")
  private ConfigNodePropertyBoolean hostNoCertCheck;

  @JsonProperty("bind.dn")
  private ConfigNodePropertyString bindDn;

  @JsonProperty("bind.password")
  private ConfigNodePropertyString bindPassword;

  @JsonProperty("searchTimeout")
  private ConfigNodePropertyString searchTimeout;

  @JsonProperty("adminPool.maxActive")
  private ConfigNodePropertyInteger adminPoolMaxActive;

  @JsonProperty("adminPool.lookupOnValidate")
  private ConfigNodePropertyBoolean adminPoolLookupOnValidate;

  @JsonProperty("userPool.maxActive")
  private ConfigNodePropertyInteger userPoolMaxActive;

  @JsonProperty("userPool.lookupOnValidate")
  private ConfigNodePropertyBoolean userPoolLookupOnValidate;

  @JsonProperty("user.baseDN")
  private ConfigNodePropertyString userBaseDN;

  @JsonProperty("user.objectclass")
  private ConfigNodePropertyArray userObjectclass;

  @JsonProperty("user.idAttribute")
  private ConfigNodePropertyString userIdAttribute;

  @JsonProperty("user.extraFilter")
  private ConfigNodePropertyString userExtraFilter;

  @JsonProperty("user.makeDnPath")
  private ConfigNodePropertyBoolean userMakeDnPath;

  @JsonProperty("group.baseDN")
  private ConfigNodePropertyString groupBaseDN;

  @JsonProperty("group.objectclass")
  private ConfigNodePropertyArray groupObjectclass;

  @JsonProperty("group.nameAttribute")
  private ConfigNodePropertyString groupNameAttribute;

  @JsonProperty("group.extraFilter")
  private ConfigNodePropertyString groupExtraFilter;

  @JsonProperty("group.makeDnPath")
  private ConfigNodePropertyBoolean groupMakeDnPath;

  @JsonProperty("group.memberAttribute")
  private ConfigNodePropertyString groupMemberAttribute;

  @JsonProperty("useUidForExtId")
  private ConfigNodePropertyBoolean useUidForExtId;

  @JsonProperty("customattributes")
  private ConfigNodePropertyArray customattributes;

  /**
   * 
   * @return providerName
   */
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  /**
   * 
   * @return hostName
   */
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }

  public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

  /**
   * 
   * @return hostPort
   */
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }

  public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

  /**
   * 
   * @return hostSsl
   */
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }

  public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

  /**
   * 
   * @return hostTls
   */
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }

  public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

  /**
   * 
   * @return hostNoCertCheck
   */
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }

  public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

  /**
   * 
   * @return bindDn
   */
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }

  public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

  /**
   * 
   * @return bindPassword
   */
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

  /**
   * 
   * @return searchTimeout
   */
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }

  public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

  /**
   * 
   * @return adminPoolMaxActive
   */
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }

  public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

  /**
   * 
   * @return adminPoolLookupOnValidate
   */
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }

  public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

  /**
   * 
   * @return userPoolMaxActive
   */
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }

  public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

  /**
   * 
   * @return userPoolLookupOnValidate
   */
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }

  public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

  /**
   * 
   * @return userBaseDN
   */
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }

  public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

  /**
   * 
   * @return userObjectclass
   */
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }

  public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

  /**
   * 
   * @return userIdAttribute
   */
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }

  public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  /**
   * 
   * @return userExtraFilter
   */
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }

  public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

  /**
   * 
   * @return userMakeDnPath
   */
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }

  public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

  /**
   * 
   * @return groupBaseDN
   */
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }

  public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

  /**
   * 
   * @return groupObjectclass
   */
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }

  public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

  /**
   * 
   * @return groupNameAttribute
   */
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }

  public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  /**
   * 
   * @return groupExtraFilter
   */
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }

  public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

  /**
   * 
   * @return groupMakeDnPath
   */
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }

  public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

  /**
   * 
   * @return groupMemberAttribute
   */
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  /**
   * 
   * @return useUidForExtId
   */
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }

  public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

  /**
   * 
   * @return customattributes
   */
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
    return Objects.equals(this.providerName, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.providerName) &&
        Objects.equals(this.hostName, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostName) &&
        Objects.equals(this.hostPort, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostPort) &&
        Objects.equals(this.hostSsl, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostSsl) &&
        Objects.equals(this.hostTls, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostTls) &&
        Objects.equals(this.hostNoCertCheck, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostNoCertCheck) &&
        Objects.equals(this.bindDn, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindDn) &&
        Objects.equals(this.bindPassword, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindPassword) &&
        Objects.equals(this.searchTimeout, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.searchTimeout) &&
        Objects.equals(this.adminPoolMaxActive, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolMaxActive) &&
        Objects.equals(this.adminPoolLookupOnValidate, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolLookupOnValidate) &&
        Objects.equals(this.userPoolMaxActive, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolMaxActive) &&
        Objects.equals(this.userPoolLookupOnValidate, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolLookupOnValidate) &&
        Objects.equals(this.userBaseDN, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userBaseDN) &&
        Objects.equals(this.userObjectclass, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userObjectclass) &&
        Objects.equals(this.userIdAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userIdAttribute) &&
        Objects.equals(this.userExtraFilter, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userExtraFilter) &&
        Objects.equals(this.userMakeDnPath, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userMakeDnPath) &&
        Objects.equals(this.groupBaseDN, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupBaseDN) &&
        Objects.equals(this.groupObjectclass, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupObjectclass) &&
        Objects.equals(this.groupNameAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupNameAttribute) &&
        Objects.equals(this.groupExtraFilter, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupExtraFilter) &&
        Objects.equals(this.groupMakeDnPath, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMakeDnPath) &&
        Objects.equals(this.groupMemberAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMemberAttribute) &&
        Objects.equals(this.useUidForExtId, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.useUidForExtId) &&
        Objects.equals(this.customattributes, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.customattributes);
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
