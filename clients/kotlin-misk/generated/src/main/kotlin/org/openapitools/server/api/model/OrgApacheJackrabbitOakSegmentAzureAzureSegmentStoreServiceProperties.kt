package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(
    val accountName: ConfigNodePropertyString? = null,
    val containerName: ConfigNodePropertyString? = null,
    val accessKey: ConfigNodePropertyString? = null,
    val rootPath: ConfigNodePropertyString? = null,
    val connectionURL: ConfigNodePropertyString? = null
)
