@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(
    @field:JsonProperty("getSystemWorkflowModels")
    val getSystemWorkflowModels: ConfigNodePropertyArray? = null,

    @field:JsonProperty("getPackageRootPath")
    val getPackageRootPath: ConfigNodePropertyString? = null,

)
