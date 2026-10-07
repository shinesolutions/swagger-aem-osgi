@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReplicationContentStaticContentBuilderProperties(
    @field:JsonProperty("host")
    val host: ConfigNodePropertyString? = null,

    @field:JsonProperty("port")
    val port: ConfigNodePropertyInteger? = null,

)
