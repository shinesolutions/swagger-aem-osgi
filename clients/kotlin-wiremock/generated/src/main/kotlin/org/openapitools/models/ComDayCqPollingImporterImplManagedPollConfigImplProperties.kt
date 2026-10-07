@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqPollingImporterImplManagedPollConfigImplProperties(
    @field:JsonProperty("id")
    val id: ConfigNodePropertyString? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("reference")
    val reference: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("interval")
    val interval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("expression")
    val expression: ConfigNodePropertyString? = null,

    @field:JsonProperty("source")
    val source: ConfigNodePropertyString? = null,

    @field:JsonProperty("target")
    val target: ConfigNodePropertyString? = null,

    @field:JsonProperty("login")
    val login: ConfigNodePropertyString? = null,

    @field:JsonProperty("password")
    val password: ConfigNodePropertyString? = null,

)
