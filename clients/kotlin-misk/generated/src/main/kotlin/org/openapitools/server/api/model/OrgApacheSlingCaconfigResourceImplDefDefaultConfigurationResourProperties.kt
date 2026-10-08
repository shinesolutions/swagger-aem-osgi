package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(
    val enabled: ConfigNodePropertyBoolean? = null,
    val configPath: ConfigNodePropertyString? = null,
    val fallbackPaths: ConfigNodePropertyArray? = null,
    val configCollectionInheritancePropertyNames: ConfigNodePropertyArray? = null
)
