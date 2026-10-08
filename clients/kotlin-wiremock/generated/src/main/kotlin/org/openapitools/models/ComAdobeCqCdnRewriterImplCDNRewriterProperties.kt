@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqCdnRewriterImplCDNRewriterProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cdnrewriter.attributes")
    val cdnrewriterAttributes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cdn.rewriter.distribution.domain")
    val cdnRewriterDistributionDomain: ConfigNodePropertyString? = null,

)
