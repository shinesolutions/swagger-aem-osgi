@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(
    @field:JsonProperty("purgeCompleted")
    val purgeCompleted: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("completedAge")
    val completedAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("purgeActive")
    val purgeActive: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("activeAge")
    val activeAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("saveThreshold")
    val saveThreshold: ConfigNodePropertyInteger? = null,

)
