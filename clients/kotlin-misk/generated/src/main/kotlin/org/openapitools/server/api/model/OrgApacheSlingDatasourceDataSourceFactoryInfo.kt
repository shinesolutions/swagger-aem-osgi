package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingDatasourceDataSourceFactoryProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDatasourceDataSourceFactoryInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingDatasourceDataSourceFactoryProperties? = null
)
