package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(
    val name: ConfigNodePropertyString? = null,
    val title: ConfigNodePropertyString? = null,
    val details: ConfigNodePropertyString? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val serviceName: ConfigNodePropertyString? = null,
    val logLevel: ConfigNodePropertyDropDown? = null,
    val allowedRoots: ConfigNodePropertyArray? = null,
    val requestAuthorizationStrategyTarget: ConfigNodePropertyString? = null,
    val queueProviderFactoryTarget: ConfigNodePropertyString? = null,
    val packageBuilderTarget: ConfigNodePropertyString? = null,
    val triggersTarget: ConfigNodePropertyString? = null,
    val priorityQueues: ConfigNodePropertyArray? = null
)
