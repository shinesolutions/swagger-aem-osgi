package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(
    val description: ConfigNodePropertyString? = null,
    val overrides: ConfigNodePropertyArray? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val serviceRanking: ConfigNodePropertyInteger? = null
)
