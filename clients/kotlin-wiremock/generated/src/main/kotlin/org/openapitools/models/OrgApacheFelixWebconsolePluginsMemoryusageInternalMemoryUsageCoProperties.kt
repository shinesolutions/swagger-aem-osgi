@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(
    @field:JsonProperty("felix.memoryusage.dump.threshold")
    val felixMemoryusageDumpThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("felix.memoryusage.dump.interval")
    val felixMemoryusageDumpInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("felix.memoryusage.dump.location")
    val felixMemoryusageDumpLocation: ConfigNodePropertyString? = null,

)
