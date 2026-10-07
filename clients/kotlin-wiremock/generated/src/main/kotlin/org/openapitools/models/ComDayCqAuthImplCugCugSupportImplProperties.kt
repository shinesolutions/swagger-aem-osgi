@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAuthImplCugCugSupportImplProperties(
    @field:JsonProperty("cug.exempted.principals")
    val cugExemptedPrincipals: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cug.enabled")
    val cugEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cug.principals.regex")
    val cugPrincipalsRegex: ConfigNodePropertyString? = null,

    @field:JsonProperty("cug.principals.replacement")
    val cugPrincipalsReplacement: ConfigNodePropertyString? = null,

)
