@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(
    @field:JsonProperty("granite.maintenance.mandatory")
    val graniteMaintenanceMandatory: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("job.topics")
    val jobTopics: ConfigNodePropertyString? = null,

)
