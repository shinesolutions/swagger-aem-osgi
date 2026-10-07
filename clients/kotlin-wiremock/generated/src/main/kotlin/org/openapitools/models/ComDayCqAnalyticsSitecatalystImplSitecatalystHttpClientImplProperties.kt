@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(
    @field:JsonProperty("cq.analytics.sitecatalyst.service.datacenter.url")
    val cqAnalyticsSitecatalystServiceDatacenterUrl: ConfigNodePropertyArray? = null,

    @field:JsonProperty("devhostnamepatterns")
    val devhostnamepatterns: ConfigNodePropertyArray? = null,

    @field:JsonProperty("connection.timeout")
    val connectionTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("socket.timeout")
    val socketTimeout: ConfigNodePropertyInteger? = null,

)
