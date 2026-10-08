package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(
    val name: ConfigNodePropertyString? = null,
    val title: ConfigNodePropertyString? = null,
    val details: ConfigNodePropertyString? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val serviceName: ConfigNodePropertyString? = null,
    val logLevel: ConfigNodePropertyDropDown? = null,
    val queueProcessingEnabled: ConfigNodePropertyBoolean? = null,
    val packageExporterTarget: ConfigNodePropertyString? = null,
    val packageImporterTarget: ConfigNodePropertyString? = null,
    val requestAuthorizationStrategyTarget: ConfigNodePropertyString? = null,
    val triggersTarget: ConfigNodePropertyString? = null
)
