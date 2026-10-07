@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(
    @field:JsonProperty("jmx.objectname")
    val jmxObjectname: ConfigNodePropertyString? = null,

    @field:JsonProperty("property.measure.enabled")
    val propertyMeasureEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("property.name")
    val propertyName: ConfigNodePropertyString? = null,

    @field:JsonProperty("property.max.wait.ms")
    val propertyMaxWaitMs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("property.max.rate")
    val propertyMaxRate: ConfigNodePropertyFloat? = null,

    @field:JsonProperty("fulltext.measure.enabled")
    val fulltextMeasureEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("fulltext.name")
    val fulltextName: ConfigNodePropertyString? = null,

    @field:JsonProperty("fulltext.max.wait.ms")
    val fulltextMaxWaitMs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("fulltext.max.rate")
    val fulltextMaxRate: ConfigNodePropertyFloat? = null,

)
