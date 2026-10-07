package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(
    val damShowexpired: ConfigNodePropertyBoolean? = null,
    val damShowhidden: ConfigNodePropertyBoolean? = null,
    val tagTitleSearch: ConfigNodePropertyBoolean? = null,
    val guessTotal: ConfigNodePropertyString? = null,
    val damExpiryProperty: ConfigNodePropertyString? = null
)
