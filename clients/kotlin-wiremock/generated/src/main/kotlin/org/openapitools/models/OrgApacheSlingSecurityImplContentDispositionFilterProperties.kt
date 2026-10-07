@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingSecurityImplContentDispositionFilterProperties(
    @field:JsonProperty("sling.content.disposition.paths")
    val slingContentDispositionPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.content.disposition.excluded.paths")
    val slingContentDispositionExcludedPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.content.disposition.all.paths")
    val slingContentDispositionAllPaths: ConfigNodePropertyBoolean? = null,

)
