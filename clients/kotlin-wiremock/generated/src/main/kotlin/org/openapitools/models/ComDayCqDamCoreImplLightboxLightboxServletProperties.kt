@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplLightboxLightboxServletProperties(
    @field:JsonProperty("sling.servlet.paths")
    val slingServletPaths: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.dam.enable.anonymous")
    val cqDamEnableAnonymous: ConfigNodePropertyBoolean? = null,

)
