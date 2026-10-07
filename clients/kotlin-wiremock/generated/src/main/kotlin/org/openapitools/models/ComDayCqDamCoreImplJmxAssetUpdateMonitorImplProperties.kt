@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(
    @field:JsonProperty("jmx.objectname")
    val jmxObjectname: ConfigNodePropertyString? = null,

    @field:JsonProperty("active")
    val active: ConfigNodePropertyBoolean? = null,

)
