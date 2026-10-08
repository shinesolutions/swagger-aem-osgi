@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletMetadataGetServletProperties(
    @field:JsonProperty("sling.servlet.resourceTypes")
    val slingServletResourceTypes: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.extensions")
    val slingServletExtensions: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.selectors")
    val slingServletSelectors: ConfigNodePropertyString? = null,

)
