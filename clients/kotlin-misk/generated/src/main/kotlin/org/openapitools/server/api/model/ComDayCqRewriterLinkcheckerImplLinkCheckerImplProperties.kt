package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(
    val schedulerPeriod: ConfigNodePropertyInteger? = null,
    val schedulerConcurrent: ConfigNodePropertyBoolean? = null,
    val serviceBadLinkToleranceInterval: ConfigNodePropertyInteger? = null,
    val serviceCheckOverridePatterns: ConfigNodePropertyArray? = null,
    val serviceCacheBrokenInternalLinks: ConfigNodePropertyBoolean? = null,
    val serviceSpecialLinkPrefix: ConfigNodePropertyArray? = null,
    val serviceSpecialLinkPatterns: ConfigNodePropertyArray? = null
)
