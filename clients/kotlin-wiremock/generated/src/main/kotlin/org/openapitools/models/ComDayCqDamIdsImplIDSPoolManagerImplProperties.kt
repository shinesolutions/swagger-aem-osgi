@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamIdsImplIDSPoolManagerImplProperties(
    @field:JsonProperty("max.errors.to.blacklist")
    val maxErrorsToBlacklist: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("retry.interval.to.whitelist")
    val retryIntervalToWhitelist: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("connect.timeout")
    val connectTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("socket.timeout")
    val socketTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("process.label")
    val processLabel: ConfigNodePropertyString? = null,

    @field:JsonProperty("connection.use.max")
    val connectionUseMax: ConfigNodePropertyInteger? = null,

)
