@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(
    @field:JsonProperty("job.consumermanager.disableDistribution")
    val jobConsumermanagerDisableDistribution: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("startup.delay")
    val startupDelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cleanup.period")
    val cleanupPeriod: ConfigNodePropertyInteger? = null,

)
