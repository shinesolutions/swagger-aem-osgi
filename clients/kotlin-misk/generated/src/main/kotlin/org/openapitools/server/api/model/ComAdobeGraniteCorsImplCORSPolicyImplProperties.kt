package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteCorsImplCORSPolicyImplProperties(
    val alloworigin: ConfigNodePropertyArray? = null,
    val alloworiginregexp: ConfigNodePropertyArray? = null,
    val allowedpaths: ConfigNodePropertyArray? = null,
    val exposedheaders: ConfigNodePropertyArray? = null,
    val maxage: ConfigNodePropertyInteger? = null,
    val supportedheaders: ConfigNodePropertyArray? = null,
    val supportedmethods: ConfigNodePropertyArray? = null,
    val supportscredentials: ConfigNodePropertyBoolean? = null
)
