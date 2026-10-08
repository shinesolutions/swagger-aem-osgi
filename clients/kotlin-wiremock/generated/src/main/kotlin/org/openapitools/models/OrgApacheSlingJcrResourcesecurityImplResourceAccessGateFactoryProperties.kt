@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("checkpath.prefix")
    val checkpathPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("jcrPath")
    val jcrPath: ConfigNodePropertyString? = null,

)
