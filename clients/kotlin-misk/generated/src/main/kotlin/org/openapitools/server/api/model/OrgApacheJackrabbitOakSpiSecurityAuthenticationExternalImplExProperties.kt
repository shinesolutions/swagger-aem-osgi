package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(
    val jaasRanking: ConfigNodePropertyInteger? = null,
    val jaasControlFlag: ConfigNodePropertyString? = null,
    val jaasRealmName: ConfigNodePropertyString? = null,
    val idpName: ConfigNodePropertyString? = null,
    val syncHandlerName: ConfigNodePropertyString? = null
)
