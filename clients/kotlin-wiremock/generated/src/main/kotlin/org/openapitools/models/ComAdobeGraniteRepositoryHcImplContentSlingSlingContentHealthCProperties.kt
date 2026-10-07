@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(
    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("exclude.search.path")
    val excludeSearchPath: ConfigNodePropertyArray? = null,

)
