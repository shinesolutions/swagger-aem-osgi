@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingStartupfilterImplStartupFilterImplProperties(
    @field:JsonProperty("active.by.default")
    val activeByDefault: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("default.message")
    val defaultMessage: ConfigNodePropertyString? = null,

)
