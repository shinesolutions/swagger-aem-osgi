package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(
    val providerName: ConfigNodePropertyString? = null,
    val hostName: ConfigNodePropertyString? = null,
    val hostPort: ConfigNodePropertyInteger? = null,
    val hostSsl: ConfigNodePropertyBoolean? = null,
    val hostTls: ConfigNodePropertyBoolean? = null,
    val hostNoCertCheck: ConfigNodePropertyBoolean? = null,
    val bindDn: ConfigNodePropertyString? = null,
    val bindPassword: ConfigNodePropertyString? = null,
    val searchTimeout: ConfigNodePropertyString? = null,
    val adminPoolMaxActive: ConfigNodePropertyInteger? = null,
    val adminPoolLookupOnValidate: ConfigNodePropertyBoolean? = null,
    val userPoolMaxActive: ConfigNodePropertyInteger? = null,
    val userPoolLookupOnValidate: ConfigNodePropertyBoolean? = null,
    val userBaseDN: ConfigNodePropertyString? = null,
    val userObjectclass: ConfigNodePropertyArray? = null,
    val userIdAttribute: ConfigNodePropertyString? = null,
    val userExtraFilter: ConfigNodePropertyString? = null,
    val userMakeDnPath: ConfigNodePropertyBoolean? = null,
    val groupBaseDN: ConfigNodePropertyString? = null,
    val groupObjectclass: ConfigNodePropertyArray? = null,
    val groupNameAttribute: ConfigNodePropertyString? = null,
    val groupExtraFilter: ConfigNodePropertyString? = null,
    val groupMakeDnPath: ConfigNodePropertyBoolean? = null,
    val groupMemberAttribute: ConfigNodePropertyString? = null,
    val useUidForExtId: ConfigNodePropertyBoolean? = null,
    val customattributes: ConfigNodePropertyArray? = null
)
