package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplLightboxLightboxServletProperties(
    val slingServletPaths: ConfigNodePropertyString? = null,
    val slingServletMethods: ConfigNodePropertyArray? = null,
    val cqDamEnableAnonymous: ConfigNodePropertyBoolean? = null
)
