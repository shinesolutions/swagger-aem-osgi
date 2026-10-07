@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(
    @field:JsonProperty("servletPath")
    val servletPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("disabled")
    val disabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cors.accessControlAllowOrigin")
    val corsAccessControlAllowOrigin: ConfigNodePropertyString? = null,

)
