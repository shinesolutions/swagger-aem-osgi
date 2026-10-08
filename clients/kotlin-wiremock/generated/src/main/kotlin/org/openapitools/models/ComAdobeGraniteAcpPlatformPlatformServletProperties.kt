@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAcpPlatformPlatformServletProperties(
    @field:JsonProperty("query.limit")
    val queryLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("file.type.extension.map")
    val fileTypeExtensionMap: ConfigNodePropertyArray? = null,

)
