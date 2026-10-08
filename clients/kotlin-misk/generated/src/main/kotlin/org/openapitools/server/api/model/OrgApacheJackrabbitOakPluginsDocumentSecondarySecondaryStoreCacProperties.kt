package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(
    val includedPaths: ConfigNodePropertyArray? = null,
    val enableAsyncObserver: ConfigNodePropertyBoolean? = null,
    val observerQueueSize: ConfigNodePropertyInteger? = null
)
