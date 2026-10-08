@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(
    @field:JsonProperty("getCacheExpirationUnit")
    val getCacheExpirationUnit: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("getCacheExpirationValue")
    val getCacheExpirationValue: ConfigNodePropertyInteger? = null,

)
