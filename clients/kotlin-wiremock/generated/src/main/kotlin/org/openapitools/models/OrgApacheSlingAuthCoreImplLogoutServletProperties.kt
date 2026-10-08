@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingAuthCoreImplLogoutServletProperties(
    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.servlet.paths")
    val slingServletPaths: ConfigNodePropertyString? = null,

)
