@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyArray? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("idpUrl")
    val idpUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("idpCertAlias")
    val idpCertAlias: ConfigNodePropertyString? = null,

    @field:JsonProperty("idpHttpRedirect")
    val idpHttpRedirect: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("serviceProviderEntityId")
    val serviceProviderEntityId: ConfigNodePropertyString? = null,

    @field:JsonProperty("assertionConsumerServiceURL")
    val assertionConsumerServiceURL: ConfigNodePropertyString? = null,

    @field:JsonProperty("spPrivateKeyAlias")
    val spPrivateKeyAlias: ConfigNodePropertyString? = null,

    @field:JsonProperty("keyStorePassword")
    val keyStorePassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultRedirectUrl")
    val defaultRedirectUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("userIDAttribute")
    val userIDAttribute: ConfigNodePropertyString? = null,

    @field:JsonProperty("useEncryption")
    val useEncryption: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("createUser")
    val createUser: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("userIntermediatePath")
    val userIntermediatePath: ConfigNodePropertyString? = null,

    @field:JsonProperty("addGroupMemberships")
    val addGroupMemberships: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("groupMembershipAttribute")
    val groupMembershipAttribute: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultGroups")
    val defaultGroups: ConfigNodePropertyArray? = null,

    @field:JsonProperty("nameIdFormat")
    val nameIdFormat: ConfigNodePropertyString? = null,

    @field:JsonProperty("synchronizeAttributes")
    val synchronizeAttributes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("handleLogout")
    val handleLogout: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("logoutUrl")
    val logoutUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("clockTolerance")
    val clockTolerance: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("digestMethod")
    val digestMethod: ConfigNodePropertyString? = null,

    @field:JsonProperty("signatureMethod")
    val signatureMethod: ConfigNodePropertyString? = null,

    @field:JsonProperty("identitySyncType")
    val identitySyncType: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("idpIdentifier")
    val idpIdentifier: ConfigNodePropertyString? = null,

)
