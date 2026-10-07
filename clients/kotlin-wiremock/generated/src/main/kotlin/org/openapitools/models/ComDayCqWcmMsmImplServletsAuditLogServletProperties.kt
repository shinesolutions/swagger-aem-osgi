@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmMsmImplServletsAuditLogServletProperties(
    @field:JsonProperty("auditlogservlet.default.events.count")
    val auditlogservletDefaultEventsCount: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("auditlogservlet.default.path")
    val auditlogservletDefaultPath: ConfigNodePropertyString? = null,

)
