package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingStartupfilterImplStartupFilterImplProperties(
    val activeByDefault: ConfigNodePropertyBoolean? = null,
    val defaultMessage: ConfigNodePropertyString? = null
)
