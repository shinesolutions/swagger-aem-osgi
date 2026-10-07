@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(
    @field:JsonProperty("watchwords.positive")
    val watchwordsPositive: ConfigNodePropertyArray? = null,

    @field:JsonProperty("watchwords.negative")
    val watchwordsNegative: ConfigNodePropertyArray? = null,

    @field:JsonProperty("watchwords.path")
    val watchwordsPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("sentiment.path")
    val sentimentPath: ConfigNodePropertyString? = null,

)
