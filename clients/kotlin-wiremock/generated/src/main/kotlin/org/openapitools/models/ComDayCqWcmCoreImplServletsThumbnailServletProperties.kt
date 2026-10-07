@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplServletsThumbnailServletProperties(
    @field:JsonProperty("workspace")
    val workspace: ConfigNodePropertyString? = null,

    @field:JsonProperty("dimensions")
    val dimensions: ConfigNodePropertyArray? = null,

)
