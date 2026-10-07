package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(
    val checkInternval: ConfigNodePropertyInteger? = null,
    val excludeIds: ConfigNodePropertyArray? = null,
    val encryptPing: ConfigNodePropertyBoolean? = null
)
