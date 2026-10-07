package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplServletBinaryProviderServletProperties(
    val slingServletResourceTypes: ConfigNodePropertyArray? = null,
    val slingServletMethods: ConfigNodePropertyArray? = null,
    val cqDamDrmEnable: ConfigNodePropertyBoolean? = null
)
