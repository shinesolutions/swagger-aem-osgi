package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(
    val omnisearchSuggestionRequiretextMin: ConfigNodePropertyInteger? = null,
    val omnisearchSuggestionSpellcheckRequire: ConfigNodePropertyBoolean? = null
)
