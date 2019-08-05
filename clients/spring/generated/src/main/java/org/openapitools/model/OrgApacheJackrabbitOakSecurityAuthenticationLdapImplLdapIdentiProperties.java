package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties   {
  @JsonProperty("provider.name")
  private ConfigNodePropertyString providerName = null;

  @JsonProperty("host.name")
  private ConfigNodePropertyString hostName = null;

  @JsonProperty("host.port")
  private ConfigNodePropertyInteger hostPort = null;

  @JsonProperty("host.ssl")
  private ConfigNodePropertyBoolean hostSsl = null;

  @JsonProperty("host.tls")
  private ConfigNodePropertyBoolean hostTls = null;

  @JsonProperty("host.noCertCheck")
  private ConfigNodePropertyBoolean hostNoCertCheck = null;

  @JsonProperty("bind.dn")
  private ConfigNodePropertyString bindDn = null;

  @JsonProperty("bind.password")
  private ConfigNodePropertyString bindPassword = null;

  @JsonProperty("searchTimeout")
  private ConfigNodePropertyString searchTimeout = null;

  @JsonProperty("adminPool.maxActive")
  private ConfigNodePropertyInteger adminPoolMaxActive = null;

  @JsonProperty("adminPool.lookupOnValidate")
  private ConfigNodePropertyBoolean adminPoolLookupOnValidate = null;

  @JsonProperty("userPool.maxActive")
  private ConfigNodePropertyInteger userPoolMaxActive = null;

  @JsonProperty("userPool.lookupOnValidate")
  private ConfigNodePropertyBoolean userPoolLookupOnValidate = null;

  @JsonProperty("user.baseDN")
  private ConfigNodePropertyString userBaseDN = null;

  @JsonProperty("user.objectclass")
  private ConfigNodePropertyArray userObjectclass = null;

  @JsonProperty("user.idAttribute")
  private ConfigNodePropertyString userIdAttribute = null;

  @JsonProperty("user.extraFilter")
  private ConfigNodePropertyString userExtraFilter = null;

  @JsonProperty("user.makeDnPath")
  private ConfigNodePropertyBoolean userMakeDnPath = null;

  @JsonProperty("group.baseDN")
  private ConfigNodePropertyString groupBaseDN = null;

  @JsonProperty("group.objectclass")
  private ConfigNodePropertyArray groupObjectclass = null;

  @JsonProperty("group.nameAttribute")
  private ConfigNodePropertyString groupNameAttribute = null;

  @JsonProperty("group.extraFilter")
  private ConfigNodePropertyString groupExtraFilter = null;

  @JsonProperty("group.makeDnPath")
  private ConfigNodePropertyBoolean groupMakeDnPath = null;

  @JsonProperty("group.memberAttribute")
  private ConfigNodePropertyString groupMemberAttribute = null;

  @JsonProperty("useUidForExtId")
  private ConfigNodePropertyBoolean useUidForExtId = null;

  @JsonProperty("customattributes")
  private ConfigNodePropertyArray customattributes = null;

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Get providerName
   * @return providerName
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getCustomattributes() {
    return customattributes;
  }

  public void setCustomattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

