package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheHttpProxyconfiguratorProperties(
    val proxyEnabled: ConfigNodePropertyBoolean? = null,
    val proxyHost: ConfigNodePropertyString? = null,
    val proxyPort: ConfigNodePropertyInteger? = null,
    val proxyUser: ConfigNodePropertyString? = null,
    val proxyPassword: ConfigNodePropertyString? = null,
    val proxyExceptions: ConfigNodePropertyArray? = null
)
