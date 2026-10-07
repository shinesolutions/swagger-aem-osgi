@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(
    @field:JsonProperty("provider.name")
    val providerName: ConfigNodePropertyString? = null,

    @field:JsonProperty("host.name")
    val hostName: ConfigNodePropertyString? = null,

    @field:JsonProperty("host.port")
    val hostPort: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("host.ssl")
    val hostSsl: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("host.tls")
    val hostTls: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("host.noCertCheck")
    val hostNoCertCheck: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("bind.dn")
    val bindDn: ConfigNodePropertyString? = null,

    @field:JsonProperty("bind.password")
    val bindPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("searchTimeout")
    val searchTimeout: ConfigNodePropertyString? = null,

    @field:JsonProperty("adminPool.maxActive")
    val adminPoolMaxActive: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("adminPool.lookupOnValidate")
    val adminPoolLookupOnValidate: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("userPool.maxActive")
    val userPoolMaxActive: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("userPool.lookupOnValidate")
    val userPoolLookupOnValidate: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("user.baseDN")
    val userBaseDN: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.objectclass")
    val userObjectclass: ConfigNodePropertyArray? = null,

    @field:JsonProperty("user.idAttribute")
    val userIdAttribute: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.extraFilter")
    val userExtraFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.makeDnPath")
    val userMakeDnPath: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("group.baseDN")
    val groupBaseDN: ConfigNodePropertyString? = null,

    @field:JsonProperty("group.objectclass")
    val groupObjectclass: ConfigNodePropertyArray? = null,

    @field:JsonProperty("group.nameAttribute")
    val groupNameAttribute: ConfigNodePropertyString? = null,

    @field:JsonProperty("group.extraFilter")
    val groupExtraFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("group.makeDnPath")
    val groupMakeDnPath: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("group.memberAttribute")
    val groupMemberAttribute: ConfigNodePropertyString? = null,

    @field:JsonProperty("useUidForExtId")
    val useUidForExtId: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("customattributes")
    val customattributes: ConfigNodePropertyArray? = null,

)
