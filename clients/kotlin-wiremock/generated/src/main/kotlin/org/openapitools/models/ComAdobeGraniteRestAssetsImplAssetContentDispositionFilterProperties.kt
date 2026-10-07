@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(
    @field:JsonProperty("mime.allowEmpty")
    val mimeAllowEmpty: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("mime.allowed")
    val mimeAllowed: ConfigNodePropertyArray? = null,

)
