package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString providerName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString hostName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger hostPort;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean hostSsl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean hostTls;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean hostNoCertCheck;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString bindDn;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString bindPassword;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString searchTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger adminPoolMaxActive;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean adminPoolLookupOnValidate;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger userPoolMaxActive;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean userPoolLookupOnValidate;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userBaseDN;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray userObjectclass;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userIdAttribute;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userExtraFilter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean userMakeDnPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString groupBaseDN;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray groupObjectclass;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString groupNameAttribute;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString groupExtraFilter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean groupMakeDnPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString groupMemberAttribute;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean useUidForExtId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray customattributes;
 /**
  * Get providerName
  * @return providerName
  */
  @JsonProperty("provider.name")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  /**
   * Sets the <code>providerName</code> property.
   */
 public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  /**
   * Sets the <code>providerName</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

 /**
  * Get hostName
  * @return hostName
  */
  @JsonProperty("host.name")
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }

  /**
   * Sets the <code>hostName</code> property.
   */
 public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

  /**
   * Sets the <code>hostName</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
    return this;
  }

 /**
  * Get hostPort
  * @return hostPort
  */
  @JsonProperty("host.port")
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }

  /**
   * Sets the <code>hostPort</code> property.
   */
 public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

  /**
   * Sets the <code>hostPort</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
    return this;
  }

 /**
  * Get hostSsl
  * @return hostSsl
  */
  @JsonProperty("host.ssl")
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }

  /**
   * Sets the <code>hostSsl</code> property.
   */
 public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

  /**
   * Sets the <code>hostSsl</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
    return this;
  }

 /**
  * Get hostTls
  * @return hostTls
  */
  @JsonProperty("host.tls")
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }

  /**
   * Sets the <code>hostTls</code> property.
   */
 public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

  /**
   * Sets the <code>hostTls</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
    return this;
  }

 /**
  * Get hostNoCertCheck
  * @return hostNoCertCheck
  */
  @JsonProperty("host.noCertCheck")
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }

  /**
   * Sets the <code>hostNoCertCheck</code> property.
   */
 public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

  /**
   * Sets the <code>hostNoCertCheck</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
    return this;
  }

 /**
  * Get bindDn
  * @return bindDn
  */
  @JsonProperty("bind.dn")
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }

  /**
   * Sets the <code>bindDn</code> property.
   */
 public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

  /**
   * Sets the <code>bindDn</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
    return this;
  }

 /**
  * Get bindPassword
  * @return bindPassword
  */
  @JsonProperty("bind.password")
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }

  /**
   * Sets the <code>bindPassword</code> property.
   */
 public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

  /**
   * Sets the <code>bindPassword</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

 /**
  * Get searchTimeout
  * @return searchTimeout
  */
  @JsonProperty("searchTimeout")
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }

  /**
   * Sets the <code>searchTimeout</code> property.
   */
 public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

  /**
   * Sets the <code>searchTimeout</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties searchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
    return this;
  }

 /**
  * Get adminPoolMaxActive
  * @return adminPoolMaxActive
  */
  @JsonProperty("adminPool.maxActive")
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }

  /**
   * Sets the <code>adminPoolMaxActive</code> property.
   */
 public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

  /**
   * Sets the <code>adminPoolMaxActive</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
    return this;
  }

 /**
  * Get adminPoolLookupOnValidate
  * @return adminPoolLookupOnValidate
  */
  @JsonProperty("adminPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }

  /**
   * Sets the <code>adminPoolLookupOnValidate</code> property.
   */
 public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

  /**
   * Sets the <code>adminPoolLookupOnValidate</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
    return this;
  }

 /**
  * Get userPoolMaxActive
  * @return userPoolMaxActive
  */
  @JsonProperty("userPool.maxActive")
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }

  /**
   * Sets the <code>userPoolMaxActive</code> property.
   */
 public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

  /**
   * Sets the <code>userPoolMaxActive</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
    return this;
  }

 /**
  * Get userPoolLookupOnValidate
  * @return userPoolLookupOnValidate
  */
  @JsonProperty("userPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }

  /**
   * Sets the <code>userPoolLookupOnValidate</code> property.
   */
 public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

  /**
   * Sets the <code>userPoolLookupOnValidate</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
    return this;
  }

 /**
  * Get userBaseDN
  * @return userBaseDN
  */
  @JsonProperty("user.baseDN")
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }

  /**
   * Sets the <code>userBaseDN</code> property.
   */
 public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

  /**
   * Sets the <code>userBaseDN</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
    return this;
  }

 /**
  * Get userObjectclass
  * @return userObjectclass
  */
  @JsonProperty("user.objectclass")
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }

  /**
   * Sets the <code>userObjectclass</code> property.
   */
 public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

  /**
   * Sets the <code>userObjectclass</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
    return this;
  }

 /**
  * Get userIdAttribute
  * @return userIdAttribute
  */
  @JsonProperty("user.idAttribute")
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }

  /**
   * Sets the <code>userIdAttribute</code> property.
   */
 public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  /**
   * Sets the <code>userIdAttribute</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
    return this;
  }

 /**
  * Get userExtraFilter
  * @return userExtraFilter
  */
  @JsonProperty("user.extraFilter")
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }

  /**
   * Sets the <code>userExtraFilter</code> property.
   */
 public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

  /**
   * Sets the <code>userExtraFilter</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
    return this;
  }

 /**
  * Get userMakeDnPath
  * @return userMakeDnPath
  */
  @JsonProperty("user.makeDnPath")
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }

  /**
   * Sets the <code>userMakeDnPath</code> property.
   */
 public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

  /**
   * Sets the <code>userMakeDnPath</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
    return this;
  }

 /**
  * Get groupBaseDN
  * @return groupBaseDN
  */
  @JsonProperty("group.baseDN")
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }

  /**
   * Sets the <code>groupBaseDN</code> property.
   */
 public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

  /**
   * Sets the <code>groupBaseDN</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
    return this;
  }

 /**
  * Get groupObjectclass
  * @return groupObjectclass
  */
  @JsonProperty("group.objectclass")
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }

  /**
   * Sets the <code>groupObjectclass</code> property.
   */
 public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

  /**
   * Sets the <code>groupObjectclass</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
    return this;
  }

 /**
  * Get groupNameAttribute
  * @return groupNameAttribute
  */
  @JsonProperty("group.nameAttribute")
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }

  /**
   * Sets the <code>groupNameAttribute</code> property.
   */
 public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  /**
   * Sets the <code>groupNameAttribute</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
    return this;
  }

 /**
  * Get groupExtraFilter
  * @return groupExtraFilter
  */
  @JsonProperty("group.extraFilter")
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }

  /**
   * Sets the <code>groupExtraFilter</code> property.
   */
 public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

  /**
   * Sets the <code>groupExtraFilter</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
    return this;
  }

 /**
  * Get groupMakeDnPath
  * @return groupMakeDnPath
  */
  @JsonProperty("group.makeDnPath")
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }

  /**
   * Sets the <code>groupMakeDnPath</code> property.
   */
 public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

  /**
   * Sets the <code>groupMakeDnPath</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
    return this;
  }

 /**
  * Get groupMemberAttribute
  * @return groupMemberAttribute
  */
  @JsonProperty("group.memberAttribute")
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  /**
   * Sets the <code>groupMemberAttribute</code> property.
   */
 public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  /**
   * Sets the <code>groupMemberAttribute</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
    return this;
  }

 /**
  * Get useUidForExtId
  * @return useUidForExtId
  */
  @JsonProperty("useUidForExtId")
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }

  /**
   * Sets the <code>useUidForExtId</code> property.
   */
 public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

  /**
   * Sets the <code>useUidForExtId</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties useUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
    return this;
  }

 /**
  * Get customattributes
  * @return customattributes
  */
  @JsonProperty("customattributes")
  public ConfigNodePropertyArray getCustomattributes() {
    return customattributes;
  }

  /**
   * Sets the <code>customattributes</code> property.
   */
 public void setCustomattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
  }

  /**
   * Sets the <code>customattributes</code> property.
   */
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties customattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

