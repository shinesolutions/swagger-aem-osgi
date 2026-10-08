@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(
    @field:JsonProperty("pathBuilder.target")
    val pathBuilderTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("suggest.basepath")
    val suggestBasepath: ConfigNodePropertyString? = null,

)
