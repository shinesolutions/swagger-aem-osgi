@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(
    @field:JsonProperty("enable")
    val enable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ttl1")
    val ttl1: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("ttl2")
    val ttl2: ConfigNodePropertyInteger? = null,

)
