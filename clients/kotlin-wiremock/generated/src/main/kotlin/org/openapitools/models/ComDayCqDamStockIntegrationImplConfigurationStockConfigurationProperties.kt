@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("locale")
    val locale: ConfigNodePropertyString? = null,

    @field:JsonProperty("imsConfig")
    val imsConfig: ConfigNodePropertyString? = null,

)
