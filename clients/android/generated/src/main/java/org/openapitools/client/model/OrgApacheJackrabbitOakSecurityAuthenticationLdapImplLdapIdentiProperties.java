/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyArray;
import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyInteger;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {
  
  @SerializedName("provider.name")
  private ConfigNodePropertyString providerName = null;
  @SerializedName("host.name")
  private ConfigNodePropertyString hostName = null;
  @SerializedName("host.port")
  private ConfigNodePropertyInteger hostPort = null;
  @SerializedName("host.ssl")
  private ConfigNodePropertyBoolean hostSsl = null;
  @SerializedName("host.tls")
  private ConfigNodePropertyBoolean hostTls = null;
  @SerializedName("host.noCertCheck")
  private ConfigNodePropertyBoolean hostNoCertCheck = null;
  @SerializedName("bind.dn")
  private ConfigNodePropertyString bindDn = null;
  @SerializedName("bind.password")
  private ConfigNodePropertyString bindPassword = null;
  @SerializedName("searchTimeout")
  private ConfigNodePropertyString searchTimeout = null;
  @SerializedName("adminPool.maxActive")
  private ConfigNodePropertyInteger adminPoolMaxActive = null;
  @SerializedName("adminPool.lookupOnValidate")
  private ConfigNodePropertyBoolean adminPoolLookupOnValidate = null;
  @SerializedName("userPool.maxActive")
  private ConfigNodePropertyInteger userPoolMaxActive = null;
  @SerializedName("userPool.lookupOnValidate")
  private ConfigNodePropertyBoolean userPoolLookupOnValidate = null;
  @SerializedName("user.baseDN")
  private ConfigNodePropertyString userBaseDN = null;
  @SerializedName("user.objectclass")
  private ConfigNodePropertyArray userObjectclass = null;
  @SerializedName("user.idAttribute")
  private ConfigNodePropertyString userIdAttribute = null;
  @SerializedName("user.extraFilter")
  private ConfigNodePropertyString userExtraFilter = null;
  @SerializedName("user.makeDnPath")
  private ConfigNodePropertyBoolean userMakeDnPath = null;
  @SerializedName("group.baseDN")
  private ConfigNodePropertyString groupBaseDN = null;
  @SerializedName("group.objectclass")
  private ConfigNodePropertyArray groupObjectclass = null;
  @SerializedName("group.nameAttribute")
  private ConfigNodePropertyString groupNameAttribute = null;
  @SerializedName("group.extraFilter")
  private ConfigNodePropertyString groupExtraFilter = null;
  @SerializedName("group.makeDnPath")
  private ConfigNodePropertyBoolean groupMakeDnPath = null;
  @SerializedName("group.memberAttribute")
  private ConfigNodePropertyString groupMemberAttribute = null;
  @SerializedName("useUidForExtId")
  private ConfigNodePropertyBoolean useUidForExtId = null;
  @SerializedName("customattributes")
  private ConfigNodePropertyArray customattributes = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }
  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }
  public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }
  public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }
  public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }
  public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }
  public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }
  public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }
  public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }
  public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }
  public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }
  public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }
  public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }
  public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }
  public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }
  public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }
  public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }
  public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }
  public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }
  public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }
  public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }
  public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }
  public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }
  public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }
  public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }
  public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.providerName == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.providerName == null : this.providerName.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.providerName)) &&
        (this.hostName == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostName == null : this.hostName.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostName)) &&
        (this.hostPort == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostPort == null : this.hostPort.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostPort)) &&
        (this.hostSsl == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostSsl == null : this.hostSsl.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostSsl)) &&
        (this.hostTls == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostTls == null : this.hostTls.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostTls)) &&
        (this.hostNoCertCheck == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostNoCertCheck == null : this.hostNoCertCheck.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.hostNoCertCheck)) &&
        (this.bindDn == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindDn == null : this.bindDn.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindDn)) &&
        (this.bindPassword == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindPassword == null : this.bindPassword.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.bindPassword)) &&
        (this.searchTimeout == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.searchTimeout == null : this.searchTimeout.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.searchTimeout)) &&
        (this.adminPoolMaxActive == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolMaxActive == null : this.adminPoolMaxActive.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolMaxActive)) &&
        (this.adminPoolLookupOnValidate == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolLookupOnValidate == null : this.adminPoolLookupOnValidate.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.adminPoolLookupOnValidate)) &&
        (this.userPoolMaxActive == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolMaxActive == null : this.userPoolMaxActive.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolMaxActive)) &&
        (this.userPoolLookupOnValidate == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolLookupOnValidate == null : this.userPoolLookupOnValidate.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userPoolLookupOnValidate)) &&
        (this.userBaseDN == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userBaseDN == null : this.userBaseDN.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userBaseDN)) &&
        (this.userObjectclass == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userObjectclass == null : this.userObjectclass.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userObjectclass)) &&
        (this.userIdAttribute == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userIdAttribute == null : this.userIdAttribute.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userIdAttribute)) &&
        (this.userExtraFilter == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userExtraFilter == null : this.userExtraFilter.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userExtraFilter)) &&
        (this.userMakeDnPath == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userMakeDnPath == null : this.userMakeDnPath.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.userMakeDnPath)) &&
        (this.groupBaseDN == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupBaseDN == null : this.groupBaseDN.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupBaseDN)) &&
        (this.groupObjectclass == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupObjectclass == null : this.groupObjectclass.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupObjectclass)) &&
        (this.groupNameAttribute == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupNameAttribute == null : this.groupNameAttribute.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupNameAttribute)) &&
        (this.groupExtraFilter == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupExtraFilter == null : this.groupExtraFilter.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupExtraFilter)) &&
        (this.groupMakeDnPath == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMakeDnPath == null : this.groupMakeDnPath.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMakeDnPath)) &&
        (this.groupMemberAttribute == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMemberAttribute == null : this.groupMemberAttribute.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.groupMemberAttribute)) &&
        (this.useUidForExtId == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.useUidForExtId == null : this.useUidForExtId.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.useUidForExtId)) &&
        (this.customattributes == null ? orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.customattributes == null : this.customattributes.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.customattributes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.providerName == null ? 0: this.providerName.hashCode());
    result = 31 * result + (this.hostName == null ? 0: this.hostName.hashCode());
    result = 31 * result + (this.hostPort == null ? 0: this.hostPort.hashCode());
    result = 31 * result + (this.hostSsl == null ? 0: this.hostSsl.hashCode());
    result = 31 * result + (this.hostTls == null ? 0: this.hostTls.hashCode());
    result = 31 * result + (this.hostNoCertCheck == null ? 0: this.hostNoCertCheck.hashCode());
    result = 31 * result + (this.bindDn == null ? 0: this.bindDn.hashCode());
    result = 31 * result + (this.bindPassword == null ? 0: this.bindPassword.hashCode());
    result = 31 * result + (this.searchTimeout == null ? 0: this.searchTimeout.hashCode());
    result = 31 * result + (this.adminPoolMaxActive == null ? 0: this.adminPoolMaxActive.hashCode());
    result = 31 * result + (this.adminPoolLookupOnValidate == null ? 0: this.adminPoolLookupOnValidate.hashCode());
    result = 31 * result + (this.userPoolMaxActive == null ? 0: this.userPoolMaxActive.hashCode());
    result = 31 * result + (this.userPoolLookupOnValidate == null ? 0: this.userPoolLookupOnValidate.hashCode());
    result = 31 * result + (this.userBaseDN == null ? 0: this.userBaseDN.hashCode());
    result = 31 * result + (this.userObjectclass == null ? 0: this.userObjectclass.hashCode());
    result = 31 * result + (this.userIdAttribute == null ? 0: this.userIdAttribute.hashCode());
    result = 31 * result + (this.userExtraFilter == null ? 0: this.userExtraFilter.hashCode());
    result = 31 * result + (this.userMakeDnPath == null ? 0: this.userMakeDnPath.hashCode());
    result = 31 * result + (this.groupBaseDN == null ? 0: this.groupBaseDN.hashCode());
    result = 31 * result + (this.groupObjectclass == null ? 0: this.groupObjectclass.hashCode());
    result = 31 * result + (this.groupNameAttribute == null ? 0: this.groupNameAttribute.hashCode());
    result = 31 * result + (this.groupExtraFilter == null ? 0: this.groupExtraFilter.hashCode());
    result = 31 * result + (this.groupMakeDnPath == null ? 0: this.groupMakeDnPath.hashCode());
    result = 31 * result + (this.groupMemberAttribute == null ? 0: this.groupMemberAttribute.hashCode());
    result = 31 * result + (this.useUidForExtId == null ? 0: this.useUidForExtId.hashCode());
    result = 31 * result + (this.customattributes == null ? 0: this.customattributes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {\n");
    
    sb.append("  providerName: ").append(providerName).append("\n");
    sb.append("  hostName: ").append(hostName).append("\n");
    sb.append("  hostPort: ").append(hostPort).append("\n");
    sb.append("  hostSsl: ").append(hostSsl).append("\n");
    sb.append("  hostTls: ").append(hostTls).append("\n");
    sb.append("  hostNoCertCheck: ").append(hostNoCertCheck).append("\n");
    sb.append("  bindDn: ").append(bindDn).append("\n");
    sb.append("  bindPassword: ").append(bindPassword).append("\n");
    sb.append("  searchTimeout: ").append(searchTimeout).append("\n");
    sb.append("  adminPoolMaxActive: ").append(adminPoolMaxActive).append("\n");
    sb.append("  adminPoolLookupOnValidate: ").append(adminPoolLookupOnValidate).append("\n");
    sb.append("  userPoolMaxActive: ").append(userPoolMaxActive).append("\n");
    sb.append("  userPoolLookupOnValidate: ").append(userPoolLookupOnValidate).append("\n");
    sb.append("  userBaseDN: ").append(userBaseDN).append("\n");
    sb.append("  userObjectclass: ").append(userObjectclass).append("\n");
    sb.append("  userIdAttribute: ").append(userIdAttribute).append("\n");
    sb.append("  userExtraFilter: ").append(userExtraFilter).append("\n");
    sb.append("  userMakeDnPath: ").append(userMakeDnPath).append("\n");
    sb.append("  groupBaseDN: ").append(groupBaseDN).append("\n");
    sb.append("  groupObjectclass: ").append(groupObjectclass).append("\n");
    sb.append("  groupNameAttribute: ").append(groupNameAttribute).append("\n");
    sb.append("  groupExtraFilter: ").append(groupExtraFilter).append("\n");
    sb.append("  groupMakeDnPath: ").append(groupMakeDnPath).append("\n");
    sb.append("  groupMemberAttribute: ").append(groupMemberAttribute).append("\n");
    sb.append("  useUidForExtId: ").append(useUidForExtId).append("\n");
    sb.append("  customattributes: ").append(customattributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}