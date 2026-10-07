package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val keypairId: ConfigNodePropertyString? = null,
    val keypairAlias: ConfigNodePropertyString? = null,
    val cdnrewriterAttributes: ConfigNodePropertyArray? = null,
    val cdnRewriterDistributionDomain: ConfigNodePropertyString? = null
)
