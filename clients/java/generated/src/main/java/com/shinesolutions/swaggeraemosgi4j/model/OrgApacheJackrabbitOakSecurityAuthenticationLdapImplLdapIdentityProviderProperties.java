/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties {
  public static final String SERIALIZED_NAME_PROVIDER_NAME = "provider.name";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private ConfigNodePropertyString providerName = null;

  public static final String SERIALIZED_NAME_HOST_NAME = "host.name";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private ConfigNodePropertyString hostName = null;

  public static final String SERIALIZED_NAME_HOST_PORT = "host.port";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private ConfigNodePropertyInteger hostPort = null;

  public static final String SERIALIZED_NAME_HOST_SSL = "host.ssl";
  @SerializedName(SERIALIZED_NAME_HOST_SSL)
  private ConfigNodePropertyBoolean hostSsl = null;

  public static final String SERIALIZED_NAME_HOST_TLS = "host.tls";
  @SerializedName(SERIALIZED_NAME_HOST_TLS)
  private ConfigNodePropertyBoolean hostTls = null;

  public static final String SERIALIZED_NAME_HOST_NO_CERT_CHECK = "host.noCertCheck";
  @SerializedName(SERIALIZED_NAME_HOST_NO_CERT_CHECK)
  private ConfigNodePropertyBoolean hostNoCertCheck = null;

  public static final String SERIALIZED_NAME_BIND_DN = "bind.dn";
  @SerializedName(SERIALIZED_NAME_BIND_DN)
  private ConfigNodePropertyString bindDn = null;

  public static final String SERIALIZED_NAME_BIND_PASSWORD = "bind.password";
  @SerializedName(SERIALIZED_NAME_BIND_PASSWORD)
  private ConfigNodePropertyString bindPassword = null;

  public static final String SERIALIZED_NAME_SEARCH_TIMEOUT = "searchTimeout";
  @SerializedName(SERIALIZED_NAME_SEARCH_TIMEOUT)
  private ConfigNodePropertyString searchTimeout = null;

  public static final String SERIALIZED_NAME_ADMIN_POOL_MAX_ACTIVE = "adminPool.maxActive";
  @SerializedName(SERIALIZED_NAME_ADMIN_POOL_MAX_ACTIVE)
  private ConfigNodePropertyInteger adminPoolMaxActive = null;

  public static final String SERIALIZED_NAME_ADMIN_POOL_LOOKUP_ON_VALIDATE = "adminPool.lookupOnValidate";
  @SerializedName(SERIALIZED_NAME_ADMIN_POOL_LOOKUP_ON_VALIDATE)
  private ConfigNodePropertyBoolean adminPoolLookupOnValidate = null;

  public static final String SERIALIZED_NAME_USER_POOL_MAX_ACTIVE = "userPool.maxActive";
  @SerializedName(SERIALIZED_NAME_USER_POOL_MAX_ACTIVE)
  private ConfigNodePropertyInteger userPoolMaxActive = null;

  public static final String SERIALIZED_NAME_USER_POOL_LOOKUP_ON_VALIDATE = "userPool.lookupOnValidate";
  @SerializedName(SERIALIZED_NAME_USER_POOL_LOOKUP_ON_VALIDATE)
  private ConfigNodePropertyBoolean userPoolLookupOnValidate = null;

  public static final String SERIALIZED_NAME_USER_BASE_D_N = "user.baseDN";
  @SerializedName(SERIALIZED_NAME_USER_BASE_D_N)
  private ConfigNodePropertyString userBaseDN = null;

  public static final String SERIALIZED_NAME_USER_OBJECTCLASS = "user.objectclass";
  @SerializedName(SERIALIZED_NAME_USER_OBJECTCLASS)
  private ConfigNodePropertyArray userObjectclass = null;

  public static final String SERIALIZED_NAME_USER_ID_ATTRIBUTE = "user.idAttribute";
  @SerializedName(SERIALIZED_NAME_USER_ID_ATTRIBUTE)
  private ConfigNodePropertyString userIdAttribute = null;

  public static final String SERIALIZED_NAME_USER_EXTRA_FILTER = "user.extraFilter";
  @SerializedName(SERIALIZED_NAME_USER_EXTRA_FILTER)
  private ConfigNodePropertyString userExtraFilter = null;

  public static final String SERIALIZED_NAME_USER_MAKE_DN_PATH = "user.makeDnPath";
  @SerializedName(SERIALIZED_NAME_USER_MAKE_DN_PATH)
  private ConfigNodePropertyBoolean userMakeDnPath = null;

  public static final String SERIALIZED_NAME_GROUP_BASE_D_N = "group.baseDN";
  @SerializedName(SERIALIZED_NAME_GROUP_BASE_D_N)
  private ConfigNodePropertyString groupBaseDN = null;

  public static final String SERIALIZED_NAME_GROUP_OBJECTCLASS = "group.objectclass";
  @SerializedName(SERIALIZED_NAME_GROUP_OBJECTCLASS)
  private ConfigNodePropertyArray groupObjectclass = null;

  public static final String SERIALIZED_NAME_GROUP_NAME_ATTRIBUTE = "group.nameAttribute";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME_ATTRIBUTE)
  private ConfigNodePropertyString groupNameAttribute = null;

  public static final String SERIALIZED_NAME_GROUP_EXTRA_FILTER = "group.extraFilter";
  @SerializedName(SERIALIZED_NAME_GROUP_EXTRA_FILTER)
  private ConfigNodePropertyString groupExtraFilter = null;

  public static final String SERIALIZED_NAME_GROUP_MAKE_DN_PATH = "group.makeDnPath";
  @SerializedName(SERIALIZED_NAME_GROUP_MAKE_DN_PATH)
  private ConfigNodePropertyBoolean groupMakeDnPath = null;

  public static final String SERIALIZED_NAME_GROUP_MEMBER_ATTRIBUTE = "group.memberAttribute";
  @SerializedName(SERIALIZED_NAME_GROUP_MEMBER_ATTRIBUTE)
  private ConfigNodePropertyString groupMemberAttribute = null;

  public static final String SERIALIZED_NAME_USE_UID_FOR_EXT_ID = "useUidForExtId";
  @SerializedName(SERIALIZED_NAME_USE_UID_FOR_EXT_ID)
  private ConfigNodePropertyBoolean useUidForExtId = null;

  public static final String SERIALIZED_NAME_CUSTOMATTRIBUTES = "customattributes";
  @SerializedName(SERIALIZED_NAME_CUSTOMATTRIBUTES)
  private ConfigNodePropertyArray customattributes = null;

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties hostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHostName() {
    return hostName;
  }

  public void setHostName(ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties hostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
    return this;
  }

   /**
   * Get hostPort
   * @return hostPort
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }

  public void setHostPort(ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties hostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
    return this;
  }

   /**
   * Get hostSsl
   * @return hostSsl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }

  public void setHostSsl(ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties hostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
    return this;
  }

   /**
   * Get hostTls
   * @return hostTls
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }

  public void setHostTls(ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties hostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
    return this;
  }

   /**
   * Get hostNoCertCheck
   * @return hostNoCertCheck
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }

  public void setHostNoCertCheck(ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties bindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
    return this;
  }

   /**
   * Get bindDn
   * @return bindDn
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBindDn() {
    return bindDn;
  }

  public void setBindDn(ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties bindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

   /**
   * Get bindPassword
   * @return bindPassword
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties searchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
    return this;
  }

   /**
   * Get searchTimeout
   * @return searchTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }

  public void setSearchTimeout(ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties adminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
    return this;
  }

   /**
   * Get adminPoolMaxActive
   * @return adminPoolMaxActive
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }

  public void setAdminPoolMaxActive(ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties adminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
    return this;
  }

   /**
   * Get adminPoolLookupOnValidate
   * @return adminPoolLookupOnValidate
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }

  public void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties userPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
    return this;
  }

   /**
   * Get userPoolMaxActive
   * @return userPoolMaxActive
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }

  public void setUserPoolMaxActive(ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties userPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
    return this;
  }

   /**
   * Get userPoolLookupOnValidate
   * @return userPoolLookupOnValidate
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }

  public void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties userBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
    return this;
  }

   /**
   * Get userBaseDN
   * @return userBaseDN
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }

  public void setUserBaseDN(ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties userObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
    return this;
  }

   /**
   * Get userObjectclass
   * @return userObjectclass
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }

  public void setUserObjectclass(ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties userIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
    return this;
  }

   /**
   * Get userIdAttribute
   * @return userIdAttribute
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }

  public void setUserIdAttribute(ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties userExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
    return this;
  }

   /**
   * Get userExtraFilter
   * @return userExtraFilter
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }

  public void setUserExtraFilter(ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties userMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
    return this;
  }

   /**
   * Get userMakeDnPath
   * @return userMakeDnPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }

  public void setUserMakeDnPath(ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties groupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
    return this;
  }

   /**
   * Get groupBaseDN
   * @return groupBaseDN
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }

  public void setGroupBaseDN(ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties groupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
    return this;
  }

   /**
   * Get groupObjectclass
   * @return groupObjectclass
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }

  public void setGroupObjectclass(ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties groupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
    return this;
  }

   /**
   * Get groupNameAttribute
   * @return groupNameAttribute
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }

  public void setGroupNameAttribute(ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties groupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
    return this;
  }

   /**
   * Get groupExtraFilter
   * @return groupExtraFilter
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }

  public void setGroupExtraFilter(ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties groupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
    return this;
  }

   /**
   * Get groupMakeDnPath
   * @return groupMakeDnPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }

  public void setGroupMakeDnPath(ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties groupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
    return this;
  }

   /**
   * Get groupMemberAttribute
   * @return groupMemberAttribute
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  public void setGroupMemberAttribute(ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties useUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
    return this;
  }

   /**
   * Get useUidForExtId
   * @return useUidForExtId
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }

  public void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties customattributes(ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
    return this;
  }

   /**
   * Get customattributes
   * @return customattributes
  **/
  @ApiModelProperty(value = "")
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
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties = (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties) o;
    return Objects.equals(this.providerName, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.providerName) &&
        Objects.equals(this.hostName, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.hostName) &&
        Objects.equals(this.hostPort, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.hostPort) &&
        Objects.equals(this.hostSsl, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.hostSsl) &&
        Objects.equals(this.hostTls, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.hostTls) &&
        Objects.equals(this.hostNoCertCheck, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.hostNoCertCheck) &&
        Objects.equals(this.bindDn, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.bindDn) &&
        Objects.equals(this.bindPassword, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.bindPassword) &&
        Objects.equals(this.searchTimeout, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.searchTimeout) &&
        Objects.equals(this.adminPoolMaxActive, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.adminPoolMaxActive) &&
        Objects.equals(this.adminPoolLookupOnValidate, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.adminPoolLookupOnValidate) &&
        Objects.equals(this.userPoolMaxActive, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.userPoolMaxActive) &&
        Objects.equals(this.userPoolLookupOnValidate, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.userPoolLookupOnValidate) &&
        Objects.equals(this.userBaseDN, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.userBaseDN) &&
        Objects.equals(this.userObjectclass, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.userObjectclass) &&
        Objects.equals(this.userIdAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.userIdAttribute) &&
        Objects.equals(this.userExtraFilter, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.userExtraFilter) &&
        Objects.equals(this.userMakeDnPath, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.userMakeDnPath) &&
        Objects.equals(this.groupBaseDN, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.groupBaseDN) &&
        Objects.equals(this.groupObjectclass, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.groupObjectclass) &&
        Objects.equals(this.groupNameAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.groupNameAttribute) &&
        Objects.equals(this.groupExtraFilter, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.groupExtraFilter) &&
        Objects.equals(this.groupMakeDnPath, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.groupMakeDnPath) &&
        Objects.equals(this.groupMemberAttribute, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.groupMemberAttribute) &&
        Objects.equals(this.useUidForExtId, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.useUidForExtId) &&
        Objects.equals(this.customattributes, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties.customattributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, hostName, hostPort, hostSsl, hostTls, hostNoCertCheck, bindDn, bindPassword, searchTimeout, adminPoolMaxActive, adminPoolLookupOnValidate, userPoolMaxActive, userPoolLookupOnValidate, userBaseDN, userObjectclass, userIdAttribute, userExtraFilter, userMakeDnPath, groupBaseDN, groupObjectclass, groupNameAttribute, groupExtraFilter, groupMakeDnPath, groupMemberAttribute, useUidForExtId, customattributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProviderProperties {\n");
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

