package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties   {
  
  private ConfigNodePropertyString providerName = null;

  private ConfigNodePropertyString hostName = null;

  private ConfigNodePropertyInteger hostPort = null;

  private ConfigNodePropertyBoolean hostSsl = null;

  private ConfigNodePropertyBoolean hostTls = null;

  private ConfigNodePropertyBoolean hostNoCertCheck = null;

  private ConfigNodePropertyString bindDn = null;

  private ConfigNodePropertyString bindPassword = null;

  private ConfigNodePropertyString searchTimeout = null;

  private ConfigNodePropertyInteger adminPoolMaxActive = null;

  private ConfigNodePropertyBoolean adminPoolLookupOnValidate = null;

  private ConfigNodePropertyInteger userPoolMaxActive = null;

  private ConfigNodePropertyBoolean userPoolLookupOnValidate = null;

  private ConfigNodePropertyString userBaseDN = null;

  private ConfigNodePropertyArray userObjectclass = null;

  private ConfigNodePropertyString userIdAttribute = null;

  private ConfigNodePropertyString userExtraFilter = null;

  private ConfigNodePropertyBoolean userMakeDnPath = null;

  private ConfigNodePropertyString groupBaseDN = null;

  private ConfigNodePropertyArray groupObjectclass = null;

  private ConfigNodePropertyString groupNameAttribute = null;

  private ConfigNodePropertyString groupExtraFilter = null;

  private ConfigNodePropertyBoolean groupMakeDnPath = null;

  private ConfigNodePropertyString groupMemberAttribute = null;

  private ConfigNodePropertyBoolean useUidForExtId = null;

  private ConfigNodePropertyArray customattributes = null;


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.name")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }
  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("host.name")
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }
  public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("host.port")
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }
  public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("host.ssl")
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }
  public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("host.tls")
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }
  public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("host.noCertCheck")
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }
  public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bind.dn")
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }
  public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bind.password")
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }
  public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties searchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("searchTimeout")
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }
  public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("adminPool.maxActive")
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }
  public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("adminPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }
  public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userPool.maxActive")
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }
  public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userPool.lookupOnValidate")
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }
  public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.baseDN")
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }
  public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.objectclass")
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }
  public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.idAttribute")
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }
  public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.extraFilter")
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }
  public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.makeDnPath")
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }
  public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.baseDN")
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }
  public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.objectclass")
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }
  public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.nameAttribute")
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }
  public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.extraFilter")
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }
  public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.makeDnPath")
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }
  public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.memberAttribute")
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }
  public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties useUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("useUidForExtId")
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }
  public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties customattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customattributes")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

