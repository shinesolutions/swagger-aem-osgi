package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqStatisticsImplStatisticsServiceImplProperties(
    val schedulerPeriod: ConfigNodePropertyInteger? = null,
    val schedulerConcurrent: ConfigNodePropertyBoolean? = null,
    val path: ConfigNodePropertyString? = null,
    val workspace: ConfigNodePropertyString? = null,
    val keywordsPath: ConfigNodePropertyString? = null,
    val asyncEntries: ConfigNodePropertyBoolean? = null
)
