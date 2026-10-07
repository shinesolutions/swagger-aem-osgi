@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(
    @field:JsonProperty("merge.root")
    val mergeRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("merge.readOnly")
    val mergeReadOnly: ConfigNodePropertyBoolean? = null,

)
