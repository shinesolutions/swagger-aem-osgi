@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(
    @field:JsonProperty("device.info.transformer.enabled")
    val deviceInfoTransformerEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("device.info.transformer.css.style")
    val deviceInfoTransformerCssStyle: ConfigNodePropertyString? = null,

)
