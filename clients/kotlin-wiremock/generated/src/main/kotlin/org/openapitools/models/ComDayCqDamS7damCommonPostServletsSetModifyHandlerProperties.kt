@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties(
    @field:JsonProperty("sling.post.operation")
    val slingPostOperation: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyString? = null,

)
