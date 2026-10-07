@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletBinaryProviderServletProperties(
    @field:JsonProperty("sling.servlet.resourceTypes")
    val slingServletResourceTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.dam.drm.enable")
    val cqDamDrmEnable: ConfigNodePropertyBoolean? = null,

)
