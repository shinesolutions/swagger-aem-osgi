package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString providerName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString hostName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger hostPort = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean hostSsl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean hostTls = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean hostNoCertCheck = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString bindDn = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString bindPassword = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString searchTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger adminPoolMaxActive = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean adminPoolLookupOnValidate = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger userPoolMaxActive = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean userPoolLookupOnValidate = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString userBaseDN = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray userObjectclass = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString userIdAttribute = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString userExtraFilter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean userMakeDnPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString groupBaseDN = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray groupObjectclass = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString groupNameAttribute = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString groupExtraFilter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean groupMakeDnPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString groupMemberAttribute = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean useUidForExtId = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray customattributes = null;
 /**
   * Get providerName
   * @return providerName
  **/
  @JsonProperty("provider.name")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

 /**
   * Get hostName
   * @return hostName
  **/
  @JsonProperty("host.name")
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }

  public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
    return this;
  }

 /**
   * Get hostPort
   * @return hostPort
  **/
  @JsonProperty("host.port")
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }

  public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
    return this;
  }

 /**
   * Get hostSsl
   * @return hostSsl
  **/
  @JsonProperty("host.ssl")
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }

  public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
    return this;
  }

 /**
   * Get hostTls
   * @return hostTls
  **/
  @JsonProperty("host.tls")
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }

  public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
    return this;
  }

 /**
   * Get hostNoCertCheck
   * @return hostNoCertCheck
  **/
  @JsonProperty("host.noCertCheck")
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }

  public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
    return this;
  }

 /**
   * Get bindDn
   * @return bindDn
  **/
  @JsonProperty("bind.dn")
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }

  public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
    return this;
  }

 /**
   * Get bindPassword
   * @return bindPassword
  **/
  @JsonProperty("bind.password")
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

 /**
   * Get searchTimeout
   * @return searchTimeout
  **/
  @JsonProperty("searchTimeout")
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }

  public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties searchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
    return this;
  }

 /**
   * Get adminPoolMaxActive
   * @return adminPoolMaxActive
  **/
  @JsonProperty("adminPool.maxActive")
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }

  public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
    return this;
  }

 /**
   * Get adminPoolLookupOnValidate
   * @return adminPoolLookupOnValidate
  **/
  @JsonProperty("adminPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }

  public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
    return this;
  }

 /**
   * Get userPoolMaxActive
   * @return userPoolMaxActive
  **/
  @JsonProperty("userPool.maxActive")
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }

  public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
    return this;
  }

 /**
   * Get userPoolLookupOnValidate
   * @return userPoolLookupOnValidate
  **/
  @JsonProperty("userPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }

  public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
    return this;
  }

 /**
   * Get userBaseDN
   * @return userBaseDN
  **/
  @JsonProperty("user.baseDN")
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }

  public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
    return this;
  }

 /**
   * Get userObjectclass
   * @return userObjectclass
  **/
  @JsonProperty("user.objectclass")
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }

  public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
    return this;
  }

 /**
   * Get userIdAttribute
   * @return userIdAttribute
  **/
  @JsonProperty("user.idAttribute")
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }

  public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
    return this;
  }

 /**
   * Get userExtraFilter
   * @return userExtraFilter
  **/
  @JsonProperty("user.extraFilter")
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }

  public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
    return this;
  }

 /**
   * Get userMakeDnPath
   * @return userMakeDnPath
  **/
  @JsonProperty("user.makeDnPath")
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }

  public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
    return this;
  }

 /**
   * Get groupBaseDN
   * @return groupBaseDN
  **/
  @JsonProperty("group.baseDN")
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }

  public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
    return this;
  }

 /**
   * Get groupObjectclass
   * @return groupObjectclass
  **/
  @JsonProperty("group.objectclass")
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }

  public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
    return this;
  }

 /**
   * Get groupNameAttribute
   * @return groupNameAttribute
  **/
  @JsonProperty("group.nameAttribute")
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }

  public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
    return this;
  }

 /**
   * Get groupExtraFilter
   * @return groupExtraFilter
  **/
  @JsonProperty("group.extraFilter")
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }

  public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
    return this;
  }

 /**
   * Get groupMakeDnPath
   * @return groupMakeDnPath
  **/
  @JsonProperty("group.makeDnPath")
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }

  public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
    return this;
  }

 /**
   * Get groupMemberAttribute
   * @return groupMemberAttribute
  **/
  @JsonProperty("group.memberAttribute")
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
    return this;
  }

 /**
   * Get useUidForExtId
   * @return useUidForExtId
  **/
  @JsonProperty("useUidForExtId")
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }

  public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties useUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
    return this;
  }

 /**
   * Get customattributes
   * @return customattributes
  **/
  @JsonProperty("customattributes")
  public ConfigNodePropertyArray getCustomattributes() {
    return customattributes;
  }

  public void setCustomattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties customattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

