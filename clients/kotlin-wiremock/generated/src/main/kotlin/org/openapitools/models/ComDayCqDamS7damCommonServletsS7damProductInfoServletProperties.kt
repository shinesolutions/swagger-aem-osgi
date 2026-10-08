@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(
    @field:JsonProperty("sling.servlet.paths")
    val slingServletPaths: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyString? = null,

)
