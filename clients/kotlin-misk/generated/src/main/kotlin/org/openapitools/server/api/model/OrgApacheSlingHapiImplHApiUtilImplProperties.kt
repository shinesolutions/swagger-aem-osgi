package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingHapiImplHApiUtilImplProperties(
    val orgApacheSlingHapiToolsResourcetype: ConfigNodePropertyString? = null,
    val orgApacheSlingHapiToolsCollectionresourcetype: ConfigNodePropertyString? = null,
    val orgApacheSlingHapiToolsSearchpaths: ConfigNodePropertyArray? = null,
    val orgApacheSlingHapiToolsExternalurl: ConfigNodePropertyString? = null,
    val orgApacheSlingHapiToolsEnabled: ConfigNodePropertyBoolean? = null
)
