@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeFormsCommonServletTempCleanUpTaskProperties(
    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("Duration for Temporary Storage")
    val durationForTemporaryStorage: ConfigNodePropertyString? = null,

    @field:JsonProperty("Duration for Anonymous Storage")
    val durationForAnonymousStorage: ConfigNodePropertyString? = null,

)
