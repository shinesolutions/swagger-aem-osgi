@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("tagpattern")
    val tagpattern: ConfigNodePropertyString? = null,

)
