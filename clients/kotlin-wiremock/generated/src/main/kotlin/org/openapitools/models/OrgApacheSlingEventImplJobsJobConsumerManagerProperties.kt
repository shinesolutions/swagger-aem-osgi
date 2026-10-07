@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEventImplJobsJobConsumerManagerProperties(
    @field:JsonProperty("org.apache.sling.installer.configuration.persist")
    val orgApacheSlingInstallerConfigurationPersist: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("job.consumermanager.whitelist")
    val jobConsumermanagerWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("job.consumermanager.blacklist")
    val jobConsumermanagerBlacklist: ConfigNodePropertyArray? = null,

)
