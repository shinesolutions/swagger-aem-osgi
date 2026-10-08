package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsMetricsInternalLogReporterProperties(
    val period: ConfigNodePropertyInteger? = null,
    val timeUnit: ConfigNodePropertyDropDown? = null,
    val level: ConfigNodePropertyDropDown? = null,
    val loggerName: ConfigNodePropertyString? = null,
    val prefix: ConfigNodePropertyString? = null,
    val pattern: ConfigNodePropertyString? = null,
    val registryName: ConfigNodePropertyString? = null
)
