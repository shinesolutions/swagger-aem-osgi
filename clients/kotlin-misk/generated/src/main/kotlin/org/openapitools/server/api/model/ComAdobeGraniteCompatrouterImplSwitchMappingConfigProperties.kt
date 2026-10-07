package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(
    val group: ConfigNodePropertyString? = null,
    val ids: ConfigNodePropertyArray? = null
)
