@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(
    @field:JsonProperty("dim.default.mode")
    val dimDefaultMode: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("dim.appcache.enabled")
    val dimAppcacheEnabled: ConfigNodePropertyBoolean? = null,

)
