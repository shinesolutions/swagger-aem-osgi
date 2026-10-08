package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqAuthImplCugCugSupportImplProperties(
    val cugExemptedPrincipals: ConfigNodePropertyArray? = null,
    val cugEnabled: ConfigNodePropertyBoolean? = null,
    val cugPrincipalsRegex: ConfigNodePropertyString? = null,
    val cugPrincipalsReplacement: ConfigNodePropertyString? = null
)
