@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteInfocollectorInfoCollectorProperties(
    @field:JsonProperty("granite.infocollector.includeThreadDumps")
    val graniteInfocollectorIncludeThreadDumps: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.infocollector.includeHeapDump")
    val graniteInfocollectorIncludeHeapDump: ConfigNodePropertyBoolean? = null,

)
