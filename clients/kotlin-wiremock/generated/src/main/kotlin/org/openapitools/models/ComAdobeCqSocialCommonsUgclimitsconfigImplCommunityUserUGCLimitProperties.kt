@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(
    @field:JsonProperty("enable")
    val enable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("UGCLimit")
    val ugCLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("ugcLimitDuration")
    val ugcLimitDuration: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("domains")
    val domains: ConfigNodePropertyArray? = null,

    @field:JsonProperty("toList")
    val toList: ConfigNodePropertyArray? = null,

)
