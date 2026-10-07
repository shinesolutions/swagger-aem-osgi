package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(
    val datasourceName: ConfigNodePropertyString? = null,
    val datasourceSvcPropName: ConfigNodePropertyString? = null,
    val datasourceJndiName: ConfigNodePropertyString? = null,
    val jndiProperties: ConfigNodePropertyArray? = null
)
