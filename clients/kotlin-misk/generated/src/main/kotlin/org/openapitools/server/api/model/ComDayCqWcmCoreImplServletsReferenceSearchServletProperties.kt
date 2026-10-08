package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(
    val referencesearchservletMaxReferencesPerPage: ConfigNodePropertyInteger? = null,
    val referencesearchservletMaxPages: ConfigNodePropertyInteger? = null
)
