@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmFoundationFormsImplMailServletProperties(
    @field:JsonProperty("sling.servlet.resourceTypes")
    val slingServletResourceTypes: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.selectors")
    val slingServletSelectors: ConfigNodePropertyString? = null,

    @field:JsonProperty("resource.whitelist")
    val resourceWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.blacklist")
    val resourceBlacklist: ConfigNodePropertyString? = null,

)
