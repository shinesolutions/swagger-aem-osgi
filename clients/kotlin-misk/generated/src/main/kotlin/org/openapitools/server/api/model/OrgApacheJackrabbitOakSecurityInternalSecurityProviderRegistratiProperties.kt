package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(
    val requiredServicePids: ConfigNodePropertyArray? = null,
    val authorizationCompositionType: ConfigNodePropertyDropDown? = null
)
