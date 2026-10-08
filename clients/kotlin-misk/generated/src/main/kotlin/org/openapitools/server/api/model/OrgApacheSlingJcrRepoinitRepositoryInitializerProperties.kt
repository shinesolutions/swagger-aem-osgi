package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(
    val references: ConfigNodePropertyArray? = null,
    val scripts: ConfigNodePropertyArray? = null
)
