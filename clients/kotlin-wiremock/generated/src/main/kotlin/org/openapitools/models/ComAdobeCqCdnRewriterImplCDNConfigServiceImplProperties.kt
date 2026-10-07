@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(
    @field:JsonProperty("cdn.config.distribution.domain")
    val cdnConfigDistributionDomain: ConfigNodePropertyString? = null,

    @field:JsonProperty("cdn.config.enable.rewriting")
    val cdnConfigEnableRewriting: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cdn.config.path.prefixes")
    val cdnConfigPathPrefixes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cdn.config.cdnttl")
    val cdnConfigCdnttl: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cdn.config.application.protocol")
    val cdnConfigApplicationProtocol: ConfigNodePropertyString? = null,

)
