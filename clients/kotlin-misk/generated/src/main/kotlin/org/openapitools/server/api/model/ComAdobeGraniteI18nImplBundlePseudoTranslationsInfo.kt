package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties? = null
)
