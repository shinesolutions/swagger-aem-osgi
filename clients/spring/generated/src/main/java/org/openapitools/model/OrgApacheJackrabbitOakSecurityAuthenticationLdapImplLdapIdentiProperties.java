package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString providerName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hostName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger hostPort;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean hostSsl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean hostTls;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean hostNoCertCheck;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString bindDn;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString bindPassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString searchTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger adminPoolMaxActive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean adminPoolLookupOnValidate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger userPoolMaxActive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean userPoolLookupOnValidate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userBaseDN;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray userObjectclass;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userIdAttribute;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userExtraFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean userMakeDnPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupBaseDN;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray groupObjectclass;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupNameAttribute;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupExtraFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean groupMakeDnPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupMemberAttribute;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean useUidForExtId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray customattributes;

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties providerName(@Nullable ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Get providerName
   * @return providerName
   */
  @Valid 
  @Schema(name = "provider.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.name")
  public @Nullable ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  @JsonProperty("provider.name")
  public void setProviderName(@Nullable ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostName(@Nullable ConfigNodePropertyString hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * Get hostName
   * @return hostName
   */
  @Valid 
  @Schema(name = "host.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host.name")
  public @Nullable ConfigNodePropertyString getHostName() {
    return hostName;
  }

  @JsonProperty("host.name")
  public void setHostName(@Nullable ConfigNodePropertyString hostName) {
    this.hostName = hostName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostPort(@Nullable ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * Get hostPort
   * @return hostPort
   */
  @Valid 
  @Schema(name = "host.port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host.port")
  public @Nullable ConfigNodePropertyInteger getHostPort() {
    return hostPort;
  }

  @JsonProperty("host.port")
  public void setHostPort(@Nullable ConfigNodePropertyInteger hostPort) {
    this.hostPort = hostPort;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostSsl(@Nullable ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
    return this;
  }

  /**
   * Get hostSsl
   * @return hostSsl
   */
  @Valid 
  @Schema(name = "host.ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host.ssl")
  public @Nullable ConfigNodePropertyBoolean getHostSsl() {
    return hostSsl;
  }

  @JsonProperty("host.ssl")
  public void setHostSsl(@Nullable ConfigNodePropertyBoolean hostSsl) {
    this.hostSsl = hostSsl;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostTls(@Nullable ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
    return this;
  }

  /**
   * Get hostTls
   * @return hostTls
   */
  @Valid 
  @Schema(name = "host.tls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host.tls")
  public @Nullable ConfigNodePropertyBoolean getHostTls() {
    return hostTls;
  }

  @JsonProperty("host.tls")
  public void setHostTls(@Nullable ConfigNodePropertyBoolean hostTls) {
    this.hostTls = hostTls;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties hostNoCertCheck(@Nullable ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
    return this;
  }

  /**
   * Get hostNoCertCheck
   * @return hostNoCertCheck
   */
  @Valid 
  @Schema(name = "host.noCertCheck", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host.noCertCheck")
  public @Nullable ConfigNodePropertyBoolean getHostNoCertCheck() {
    return hostNoCertCheck;
  }

  @JsonProperty("host.noCertCheck")
  public void setHostNoCertCheck(@Nullable ConfigNodePropertyBoolean hostNoCertCheck) {
    this.hostNoCertCheck = hostNoCertCheck;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindDn(@Nullable ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
    return this;
  }

  /**
   * Get bindDn
   * @return bindDn
   */
  @Valid 
  @Schema(name = "bind.dn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bind.dn")
  public @Nullable ConfigNodePropertyString getBindDn() {
    return bindDn;
  }

  @JsonProperty("bind.dn")
  public void setBindDn(@Nullable ConfigNodePropertyString bindDn) {
    this.bindDn = bindDn;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties bindPassword(@Nullable ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

  /**
   * Get bindPassword
   * @return bindPassword
   */
  @Valid 
  @Schema(name = "bind.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bind.password")
  public @Nullable ConfigNodePropertyString getBindPassword() {
    return bindPassword;
  }

  @JsonProperty("bind.password")
  public void setBindPassword(@Nullable ConfigNodePropertyString bindPassword) {
    this.bindPassword = bindPassword;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties searchTimeout(@Nullable ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
    return this;
  }

  /**
   * Get searchTimeout
   * @return searchTimeout
   */
  @Valid 
  @Schema(name = "searchTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchTimeout")
  public @Nullable ConfigNodePropertyString getSearchTimeout() {
    return searchTimeout;
  }

  @JsonProperty("searchTimeout")
  public void setSearchTimeout(@Nullable ConfigNodePropertyString searchTimeout) {
    this.searchTimeout = searchTimeout;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolMaxActive(@Nullable ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
    return this;
  }

  /**
   * Get adminPoolMaxActive
   * @return adminPoolMaxActive
   */
  @Valid 
  @Schema(name = "adminPool.maxActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminPool.maxActive")
  public @Nullable ConfigNodePropertyInteger getAdminPoolMaxActive() {
    return adminPoolMaxActive;
  }

  @JsonProperty("adminPool.maxActive")
  public void setAdminPoolMaxActive(@Nullable ConfigNodePropertyInteger adminPoolMaxActive) {
    this.adminPoolMaxActive = adminPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties adminPoolLookupOnValidate(@Nullable ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
    return this;
  }

  /**
   * Get adminPoolLookupOnValidate
   * @return adminPoolLookupOnValidate
   */
  @Valid 
  @Schema(name = "adminPool.lookupOnValidate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminPool.lookupOnValidate")
  public @Nullable ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() {
    return adminPoolLookupOnValidate;
  }

  @JsonProperty("adminPool.lookupOnValidate")
  public void setAdminPoolLookupOnValidate(@Nullable ConfigNodePropertyBoolean adminPoolLookupOnValidate) {
    this.adminPoolLookupOnValidate = adminPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolMaxActive(@Nullable ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
    return this;
  }

  /**
   * Get userPoolMaxActive
   * @return userPoolMaxActive
   */
  @Valid 
  @Schema(name = "userPool.maxActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPool.maxActive")
  public @Nullable ConfigNodePropertyInteger getUserPoolMaxActive() {
    return userPoolMaxActive;
  }

  @JsonProperty("userPool.maxActive")
  public void setUserPoolMaxActive(@Nullable ConfigNodePropertyInteger userPoolMaxActive) {
    this.userPoolMaxActive = userPoolMaxActive;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userPoolLookupOnValidate(@Nullable ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
    return this;
  }

  /**
   * Get userPoolLookupOnValidate
   * @return userPoolLookupOnValidate
   */
  @Valid 
  @Schema(name = "userPool.lookupOnValidate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPool.lookupOnValidate")
  public @Nullable ConfigNodePropertyBoolean getUserPoolLookupOnValidate() {
    return userPoolLookupOnValidate;
  }

  @JsonProperty("userPool.lookupOnValidate")
  public void setUserPoolLookupOnValidate(@Nullable ConfigNodePropertyBoolean userPoolLookupOnValidate) {
    this.userPoolLookupOnValidate = userPoolLookupOnValidate;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userBaseDN(@Nullable ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
    return this;
  }

  /**
   * Get userBaseDN
   * @return userBaseDN
   */
  @Valid 
  @Schema(name = "user.baseDN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.baseDN")
  public @Nullable ConfigNodePropertyString getUserBaseDN() {
    return userBaseDN;
  }

  @JsonProperty("user.baseDN")
  public void setUserBaseDN(@Nullable ConfigNodePropertyString userBaseDN) {
    this.userBaseDN = userBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userObjectclass(@Nullable ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
    return this;
  }

  /**
   * Get userObjectclass
   * @return userObjectclass
   */
  @Valid 
  @Schema(name = "user.objectclass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.objectclass")
  public @Nullable ConfigNodePropertyArray getUserObjectclass() {
    return userObjectclass;
  }

  @JsonProperty("user.objectclass")
  public void setUserObjectclass(@Nullable ConfigNodePropertyArray userObjectclass) {
    this.userObjectclass = userObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userIdAttribute(@Nullable ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
    return this;
  }

  /**
   * Get userIdAttribute
   * @return userIdAttribute
   */
  @Valid 
  @Schema(name = "user.idAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.idAttribute")
  public @Nullable ConfigNodePropertyString getUserIdAttribute() {
    return userIdAttribute;
  }

  @JsonProperty("user.idAttribute")
  public void setUserIdAttribute(@Nullable ConfigNodePropertyString userIdAttribute) {
    this.userIdAttribute = userIdAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userExtraFilter(@Nullable ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
    return this;
  }

  /**
   * Get userExtraFilter
   * @return userExtraFilter
   */
  @Valid 
  @Schema(name = "user.extraFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.extraFilter")
  public @Nullable ConfigNodePropertyString getUserExtraFilter() {
    return userExtraFilter;
  }

  @JsonProperty("user.extraFilter")
  public void setUserExtraFilter(@Nullable ConfigNodePropertyString userExtraFilter) {
    this.userExtraFilter = userExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties userMakeDnPath(@Nullable ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
    return this;
  }

  /**
   * Get userMakeDnPath
   * @return userMakeDnPath
   */
  @Valid 
  @Schema(name = "user.makeDnPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.makeDnPath")
  public @Nullable ConfigNodePropertyBoolean getUserMakeDnPath() {
    return userMakeDnPath;
  }

  @JsonProperty("user.makeDnPath")
  public void setUserMakeDnPath(@Nullable ConfigNodePropertyBoolean userMakeDnPath) {
    this.userMakeDnPath = userMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupBaseDN(@Nullable ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
    return this;
  }

  /**
   * Get groupBaseDN
   * @return groupBaseDN
   */
  @Valid 
  @Schema(name = "group.baseDN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.baseDN")
  public @Nullable ConfigNodePropertyString getGroupBaseDN() {
    return groupBaseDN;
  }

  @JsonProperty("group.baseDN")
  public void setGroupBaseDN(@Nullable ConfigNodePropertyString groupBaseDN) {
    this.groupBaseDN = groupBaseDN;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupObjectclass(@Nullable ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
    return this;
  }

  /**
   * Get groupObjectclass
   * @return groupObjectclass
   */
  @Valid 
  @Schema(name = "group.objectclass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.objectclass")
  public @Nullable ConfigNodePropertyArray getGroupObjectclass() {
    return groupObjectclass;
  }

  @JsonProperty("group.objectclass")
  public void setGroupObjectclass(@Nullable ConfigNodePropertyArray groupObjectclass) {
    this.groupObjectclass = groupObjectclass;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupNameAttribute(@Nullable ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
    return this;
  }

  /**
   * Get groupNameAttribute
   * @return groupNameAttribute
   */
  @Valid 
  @Schema(name = "group.nameAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.nameAttribute")
  public @Nullable ConfigNodePropertyString getGroupNameAttribute() {
    return groupNameAttribute;
  }

  @JsonProperty("group.nameAttribute")
  public void setGroupNameAttribute(@Nullable ConfigNodePropertyString groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupExtraFilter(@Nullable ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
    return this;
  }

  /**
   * Get groupExtraFilter
   * @return groupExtraFilter
   */
  @Valid 
  @Schema(name = "group.extraFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.extraFilter")
  public @Nullable ConfigNodePropertyString getGroupExtraFilter() {
    return groupExtraFilter;
  }

  @JsonProperty("group.extraFilter")
  public void setGroupExtraFilter(@Nullable ConfigNodePropertyString groupExtraFilter) {
    this.groupExtraFilter = groupExtraFilter;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMakeDnPath(@Nullable ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
    return this;
  }

  /**
   * Get groupMakeDnPath
   * @return groupMakeDnPath
   */
  @Valid 
  @Schema(name = "group.makeDnPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.makeDnPath")
  public @Nullable ConfigNodePropertyBoolean getGroupMakeDnPath() {
    return groupMakeDnPath;
  }

  @JsonProperty("group.makeDnPath")
  public void setGroupMakeDnPath(@Nullable ConfigNodePropertyBoolean groupMakeDnPath) {
    this.groupMakeDnPath = groupMakeDnPath;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties groupMemberAttribute(@Nullable ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
    return this;
  }

  /**
   * Get groupMemberAttribute
   * @return groupMemberAttribute
   */
  @Valid 
  @Schema(name = "group.memberAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.memberAttribute")
  public @Nullable ConfigNodePropertyString getGroupMemberAttribute() {
    return groupMemberAttribute;
  }

  @JsonProperty("group.memberAttribute")
  public void setGroupMemberAttribute(@Nullable ConfigNodePropertyString groupMemberAttribute) {
    this.groupMemberAttribute = groupMemberAttribute;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties useUidForExtId(@Nullable ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
    return this;
  }

  /**
   * Get useUidForExtId
   * @return useUidForExtId
   */
  @Valid 
  @Schema(name = "useUidForExtId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useUidForExtId")
  public @Nullable ConfigNodePropertyBoolean getUseUidForExtId() {
    return useUidForExtId;
  }

  @JsonProperty("useUidForExtId")
  public void setUseUidForExtId(@Nullable ConfigNodePropertyBoolean useUidForExtId) {
    this.useUidForExtId = useUidForExtId;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties customattributes(@Nullable ConfigNodePropertyArray customattributes) {
    this.customattributes = customattributes;
    return this;
  }

  /**
   * Get customattributes
   * @return customattributes
   */
  @Valid 
  @Schema(name = "customattributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customattributes")
  public @Nullable ConfigNodePropertyArray getCustomattributes() {
    return customattributes;
  }

  @JsonProperty("customattributes")
  public void setCustomattributes(@Nullable ConfigNodePropertyArray customattributes) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

