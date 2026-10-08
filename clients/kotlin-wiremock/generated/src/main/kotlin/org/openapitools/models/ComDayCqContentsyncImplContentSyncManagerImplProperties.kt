@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqContentsyncImplContentSyncManagerImplProperties(
    @field:JsonProperty("contentsync.fallback.authorizable")
    val contentsyncFallbackAuthorizable: ConfigNodePropertyString? = null,

    @field:JsonProperty("contentsync.fallback.updateuser")
    val contentsyncFallbackUpdateuser: ConfigNodePropertyString? = null,

)
