@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(
    @field:JsonProperty("handler.name")
    val handlerName: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.expirationTime")
    val userExpirationTime: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.autoMembership")
    val userAutoMembership: ConfigNodePropertyArray? = null,

    @field:JsonProperty("user.propertyMapping")
    val userPropertyMapping: ConfigNodePropertyArray? = null,

    @field:JsonProperty("user.pathPrefix")
    val userPathPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.membershipExpTime")
    val userMembershipExpTime: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.membershipNestingDepth")
    val userMembershipNestingDepth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("user.dynamicMembership")
    val userDynamicMembership: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("user.disableMissing")
    val userDisableMissing: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("group.expirationTime")
    val groupExpirationTime: ConfigNodePropertyString? = null,

    @field:JsonProperty("group.autoMembership")
    val groupAutoMembership: ConfigNodePropertyArray? = null,

    @field:JsonProperty("group.propertyMapping")
    val groupPropertyMapping: ConfigNodePropertyArray? = null,

    @field:JsonProperty("group.pathPrefix")
    val groupPathPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("enableRFC7613UsercaseMappedProfile")
    val enableRFC7613UsercaseMappedProfile: ConfigNodePropertyBoolean? = null,

)
