@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(
    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("disk.space.warn.threshold")
    val diskSpaceWarnThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("disk.space.error.threshold")
    val diskSpaceErrorThreshold: ConfigNodePropertyInteger? = null,

)
