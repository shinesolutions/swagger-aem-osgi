package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEventImplJobsJobConsumerManagerProperties(
    val orgApacheSlingInstallerConfigurationPersist: ConfigNodePropertyBoolean? = null,
    val jobConsumermanagerWhitelist: ConfigNodePropertyArray? = null,
    val jobConsumermanagerBlacklist: ConfigNodePropertyArray? = null
)
