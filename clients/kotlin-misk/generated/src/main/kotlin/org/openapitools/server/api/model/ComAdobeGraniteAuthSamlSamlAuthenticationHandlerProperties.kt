package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(
    val path: ConfigNodePropertyArray? = null,
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val idpUrl: ConfigNodePropertyString? = null,
    val idpCertAlias: ConfigNodePropertyString? = null,
    val idpHttpRedirect: ConfigNodePropertyBoolean? = null,
    val serviceProviderEntityId: ConfigNodePropertyString? = null,
    val assertionConsumerServiceURL: ConfigNodePropertyString? = null,
    val spPrivateKeyAlias: ConfigNodePropertyString? = null,
    val keyStorePassword: ConfigNodePropertyString? = null,
    val defaultRedirectUrl: ConfigNodePropertyString? = null,
    val userIDAttribute: ConfigNodePropertyString? = null,
    val useEncryption: ConfigNodePropertyBoolean? = null,
    val createUser: ConfigNodePropertyBoolean? = null,
    val userIntermediatePath: ConfigNodePropertyString? = null,
    val addGroupMemberships: ConfigNodePropertyBoolean? = null,
    val groupMembershipAttribute: ConfigNodePropertyString? = null,
    val defaultGroups: ConfigNodePropertyArray? = null,
    val nameIdFormat: ConfigNodePropertyString? = null,
    val synchronizeAttributes: ConfigNodePropertyArray? = null,
    val handleLogout: ConfigNodePropertyBoolean? = null,
    val logoutUrl: ConfigNodePropertyString? = null,
    val clockTolerance: ConfigNodePropertyInteger? = null,
    val digestMethod: ConfigNodePropertyString? = null,
    val signatureMethod: ConfigNodePropertyString? = null,
    val identitySyncType: ConfigNodePropertyDropDown? = null,
    val idpIdentifier: ConfigNodePropertyString? = null
)
