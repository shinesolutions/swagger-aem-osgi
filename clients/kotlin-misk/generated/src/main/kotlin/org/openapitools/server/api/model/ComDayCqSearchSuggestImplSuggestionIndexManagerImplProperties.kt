package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(
    val pathBuilderTarget: ConfigNodePropertyString? = null,
    val suggestBasepath: ConfigNodePropertyString? = null
)
