@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(
    @field:JsonProperty("archiving.enabled")
    val archivingEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("archive.since.days.completed")
    val archiveSinceDaysCompleted: ConfigNodePropertyInteger? = null,

)
