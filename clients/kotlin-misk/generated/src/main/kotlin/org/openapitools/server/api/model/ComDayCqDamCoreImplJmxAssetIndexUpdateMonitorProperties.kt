package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyFloat
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(
    val jmxObjectname: ConfigNodePropertyString? = null,
    val propertyMeasureEnabled: ConfigNodePropertyBoolean? = null,
    val propertyName: ConfigNodePropertyString? = null,
    val propertyMaxWaitMs: ConfigNodePropertyInteger? = null,
    val propertyMaxRate: ConfigNodePropertyFloat? = null,
    val fulltextMeasureEnabled: ConfigNodePropertyBoolean? = null,
    val fulltextName: ConfigNodePropertyString? = null,
    val fulltextMaxWaitMs: ConfigNodePropertyInteger? = null,
    val fulltextMaxRate: ConfigNodePropertyFloat? = null
)
