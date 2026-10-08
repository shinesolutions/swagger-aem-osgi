package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties? = null
)
