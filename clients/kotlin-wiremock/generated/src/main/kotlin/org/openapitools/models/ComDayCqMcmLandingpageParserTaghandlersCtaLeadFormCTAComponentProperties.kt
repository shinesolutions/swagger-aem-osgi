@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("tagpattern")
    val tagpattern: ConfigNodePropertyString? = null,

)
