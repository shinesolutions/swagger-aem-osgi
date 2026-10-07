@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEngineImplSlingMainServletProperties(
    @field:JsonProperty("sling.max.calls")
    val slingMaxCalls: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("sling.max.inclusions")
    val slingMaxInclusions: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("sling.trace.allow")
    val slingTraceAllow: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("sling.max.record.requests")
    val slingMaxRecordRequests: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("sling.store.pattern.requests")
    val slingStorePatternRequests: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.serverinfo")
    val slingServerinfo: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.additional.response.headers")
    val slingAdditionalResponseHeaders: ConfigNodePropertyArray? = null,

)
