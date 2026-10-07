package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(
    val usersPath: ConfigNodePropertyString? = null,
    val groupsPath: ConfigNodePropertyString? = null,
    val systemRelativePath: ConfigNodePropertyString? = null,
    val defaultDepth: ConfigNodePropertyInteger? = null,
    val importBehavior: ConfigNodePropertyDropDown? = null,
    val passwordHashAlgorithm: ConfigNodePropertyString? = null,
    val passwordHashIterations: ConfigNodePropertyInteger? = null,
    val passwordSaltSize: ConfigNodePropertyInteger? = null,
    val omitAdminPw: ConfigNodePropertyBoolean? = null,
    val supportAutoSave: ConfigNodePropertyBoolean? = null,
    val passwordMaxAge: ConfigNodePropertyInteger? = null,
    val initialPasswordChange: ConfigNodePropertyBoolean? = null,
    val passwordHistorySize: ConfigNodePropertyInteger? = null,
    val passwordExpiryForAdmin: ConfigNodePropertyBoolean? = null,
    val cacheExpiration: ConfigNodePropertyInteger? = null,
    val enableRFC7613UsercaseMappedProfile: ConfigNodePropertyBoolean? = null
)
