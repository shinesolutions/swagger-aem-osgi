@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(
    @field:JsonProperty("root.path")
    val rootPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("fix.inconsistencies")
    val fixInconsistencies: ConfigNodePropertyBoolean? = null,

)
