@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(
    @field:JsonProperty("com.adobe.granite.httpcache.file.documentRoot")
    val comAdobeGraniteHttpcacheFileDocumentRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.httpcache.file.includeHost")
    val comAdobeGraniteHttpcacheFileIncludeHost: ConfigNodePropertyString? = null,

)
