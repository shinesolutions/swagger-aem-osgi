package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingI18nImplI18NFilterProperties(
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val slingFilterScope: ConfigNodePropertyArray? = null
)
