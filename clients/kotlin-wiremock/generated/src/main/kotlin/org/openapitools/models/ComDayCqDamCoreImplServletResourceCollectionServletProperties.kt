@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletResourceCollectionServletProperties(
    @field:JsonProperty("sling.servlet.resourceTypes")
    val slingServletResourceTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.selectors")
    val slingServletSelectors: ConfigNodePropertyString? = null,

    @field:JsonProperty("download.config")
    val downloadConfig: ConfigNodePropertyString? = null,

    @field:JsonProperty("view.selector")
    val viewSelector: ConfigNodePropertyString? = null,

    @field:JsonProperty("send_email")
    val sendEmail: ConfigNodePropertyBoolean? = null,

)
