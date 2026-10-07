@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqHistoryImplHistoryRequestFilterProperties(
    @field:JsonProperty("history.requestFilter.excludedSelectors")
    val historyRequestFilterExcludedSelectors: ConfigNodePropertyArray? = null,

    @field:JsonProperty("history.requestFilter.excludedExtensions")
    val historyRequestFilterExcludedExtensions: ConfigNodePropertyArray? = null,

)
