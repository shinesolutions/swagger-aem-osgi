package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(
    val handlerName: ConfigNodePropertyString? = null,
    val userExpirationTime: ConfigNodePropertyString? = null,
    val userAutoMembership: ConfigNodePropertyArray? = null,
    val userPropertyMapping: ConfigNodePropertyArray? = null,
    val userPathPrefix: ConfigNodePropertyString? = null,
    val userMembershipExpTime: ConfigNodePropertyString? = null,
    val userMembershipNestingDepth: ConfigNodePropertyInteger? = null,
    val userDynamicMembership: ConfigNodePropertyBoolean? = null,
    val userDisableMissing: ConfigNodePropertyBoolean? = null,
    val groupExpirationTime: ConfigNodePropertyString? = null,
    val groupAutoMembership: ConfigNodePropertyArray? = null,
    val groupPropertyMapping: ConfigNodePropertyArray? = null,
    val groupPathPrefix: ConfigNodePropertyString? = null,
    val enableRFC7613UsercaseMappedProfile: ConfigNodePropertyBoolean? = null
)
