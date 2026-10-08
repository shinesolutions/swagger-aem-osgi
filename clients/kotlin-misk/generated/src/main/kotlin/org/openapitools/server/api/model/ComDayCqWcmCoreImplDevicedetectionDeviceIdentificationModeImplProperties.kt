package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(
    val dimDefaultMode: ConfigNodePropertyDropDown? = null,
    val dimAppcacheEnabled: ConfigNodePropertyBoolean? = null
)
