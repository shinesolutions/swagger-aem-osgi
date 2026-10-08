package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(
    val poolName: ConfigNodePropertyString? = null,
    val allowedPoolNames: ConfigNodePropertyArray? = null,
    val schedulerUseleaderforsingle: ConfigNodePropertyBoolean? = null,
    val metricsFilters: ConfigNodePropertyArray? = null,
    val slowThresholdMillis: ConfigNodePropertyInteger? = null
)
