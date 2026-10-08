@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(
    @field:JsonProperty("name.whitelist")
    val nameWhitelist: ConfigNodePropertyString? = null,

    @field:JsonProperty("allow.expressions")
    val allowExpressions: ConfigNodePropertyBoolean? = null,

)
