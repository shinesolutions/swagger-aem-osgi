@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(
    @field:JsonProperty("usersPath")
    val usersPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("groupsPath")
    val groupsPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("systemRelativePath")
    val systemRelativePath: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultDepth")
    val defaultDepth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("importBehavior")
    val importBehavior: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("passwordHashAlgorithm")
    val passwordHashAlgorithm: ConfigNodePropertyString? = null,

    @field:JsonProperty("passwordHashIterations")
    val passwordHashIterations: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("passwordSaltSize")
    val passwordSaltSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("omitAdminPw")
    val omitAdminPw: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("supportAutoSave")
    val supportAutoSave: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("passwordMaxAge")
    val passwordMaxAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("initialPasswordChange")
    val initialPasswordChange: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("passwordHistorySize")
    val passwordHistorySize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("passwordExpiryForAdmin")
    val passwordExpiryForAdmin: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cacheExpiration")
    val cacheExpiration: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enableRFC7613UsercaseMappedProfile")
    val enableRFC7613UsercaseMappedProfile: ConfigNodePropertyBoolean? = null,

)
