@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(
    @field:JsonProperty("cq.searchpromote.configuration.server.uri")
    val cqSearchpromoteConfigurationServerUri: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.searchpromote.configuration.environment")
    val cqSearchpromoteConfigurationEnvironment: ConfigNodePropertyString? = null,

    @field:JsonProperty("connection.timeout")
    val connectionTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("socket.timeout")
    val socketTimeout: ConfigNodePropertyInteger? = null,

)
