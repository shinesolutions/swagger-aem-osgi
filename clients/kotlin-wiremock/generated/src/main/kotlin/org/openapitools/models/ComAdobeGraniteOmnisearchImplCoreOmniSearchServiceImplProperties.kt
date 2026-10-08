@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(
    @field:JsonProperty("omnisearch.suggestion.requiretext.min")
    val omnisearchSuggestionRequiretextMin: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("omnisearch.suggestion.spellcheck.require")
    val omnisearchSuggestionSpellcheckRequire: ConfigNodePropertyBoolean? = null,

)
