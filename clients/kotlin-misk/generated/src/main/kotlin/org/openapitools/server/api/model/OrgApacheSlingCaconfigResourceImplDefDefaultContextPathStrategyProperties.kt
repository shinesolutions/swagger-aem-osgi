package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(
    val enabled: ConfigNodePropertyBoolean? = null,
    val configRefResourceNames: ConfigNodePropertyArray? = null,
    val configRefPropertyNames: ConfigNodePropertyArray? = null,
    val serviceRanking: ConfigNodePropertyInteger? = null
)
