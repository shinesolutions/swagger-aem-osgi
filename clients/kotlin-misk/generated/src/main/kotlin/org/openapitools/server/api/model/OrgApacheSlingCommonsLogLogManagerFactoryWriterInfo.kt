package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties? = null
)
