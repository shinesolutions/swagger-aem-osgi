@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(
    @field:JsonProperty("includedPaths")
    val includedPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("enableAsyncObserver")
    val enableAsyncObserver: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("observerQueueSize")
    val observerQueueSize: ConfigNodePropertyInteger? = null,

)
