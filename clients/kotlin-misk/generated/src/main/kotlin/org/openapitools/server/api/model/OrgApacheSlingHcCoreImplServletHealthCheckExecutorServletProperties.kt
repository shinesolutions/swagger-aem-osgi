package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(
    val servletPath: ConfigNodePropertyString? = null,
    val disabled: ConfigNodePropertyBoolean? = null,
    val corsAccessControlAllowOrigin: ConfigNodePropertyString? = null
)
