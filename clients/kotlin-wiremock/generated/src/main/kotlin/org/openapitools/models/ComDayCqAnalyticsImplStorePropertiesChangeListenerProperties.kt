@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(
    @field:JsonProperty("cq.store.listener.additionalStorePaths")
    val cqStoreListenerAdditionalStorePaths: ConfigNodePropertyArray? = null,

)
