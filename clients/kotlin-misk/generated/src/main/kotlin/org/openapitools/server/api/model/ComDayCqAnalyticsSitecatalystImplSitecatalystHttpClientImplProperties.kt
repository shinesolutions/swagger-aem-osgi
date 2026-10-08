package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(
    val cqAnalyticsSitecatalystServiceDatacenterUrl: ConfigNodePropertyArray? = null,
    val devhostnamepatterns: ConfigNodePropertyArray? = null,
    val connectionTimeout: ConfigNodePropertyInteger? = null,
    val socketTimeout: ConfigNodePropertyInteger? = null
)
