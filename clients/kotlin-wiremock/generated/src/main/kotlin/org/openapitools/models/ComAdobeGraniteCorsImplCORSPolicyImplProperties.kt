@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteCorsImplCORSPolicyImplProperties(
    @field:JsonProperty("alloworigin")
    val alloworigin: ConfigNodePropertyArray? = null,

    @field:JsonProperty("alloworiginregexp")
    val alloworiginregexp: ConfigNodePropertyArray? = null,

    @field:JsonProperty("allowedpaths")
    val allowedpaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("exposedheaders")
    val exposedheaders: ConfigNodePropertyArray? = null,

    @field:JsonProperty("maxage")
    val maxage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("supportedheaders")
    val supportedheaders: ConfigNodePropertyArray? = null,

    @field:JsonProperty("supportedmethods")
    val supportedmethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("supportscredentials")
    val supportscredentials: ConfigNodePropertyBoolean? = null,

)
