@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(
    @field:JsonProperty("paths")
    val paths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("excludedPaths")
    val excludedPaths: ConfigNodePropertyArray? = null,

)
