package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(
    val userMapping: ConfigNodePropertyArray? = null,
    val userDefault: ConfigNodePropertyString? = null,
    val userEnableDefaultMapping: ConfigNodePropertyBoolean? = null,
    val requireValidation: ConfigNodePropertyBoolean? = null
)
