package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(
    val users: ConfigNodePropertyArray? = null,
    val groups: ConfigNodePropertyArray? = null
)
