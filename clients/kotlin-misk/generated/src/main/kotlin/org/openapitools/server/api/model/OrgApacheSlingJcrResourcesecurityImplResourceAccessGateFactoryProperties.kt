package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(
    val path: ConfigNodePropertyString? = null,
    val checkpathPrefix: ConfigNodePropertyString? = null,
    val jcrPath: ConfigNodePropertyString? = null
)
