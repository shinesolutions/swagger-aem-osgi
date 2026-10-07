package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(
    val asyncConfigs: ConfigNodePropertyArray? = null,
    val leaseTimeOutMinutes: ConfigNodePropertyInteger? = null,
    val failingIndexTimeoutSeconds: ConfigNodePropertyInteger? = null,
    val errorWarnIntervalSeconds: ConfigNodePropertyInteger? = null
)
