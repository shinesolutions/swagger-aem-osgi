package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
