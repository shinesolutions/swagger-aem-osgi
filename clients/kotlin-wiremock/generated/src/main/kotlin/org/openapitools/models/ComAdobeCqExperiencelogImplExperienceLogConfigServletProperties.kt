@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("disabledForGroups")
    val disabledForGroups: ConfigNodePropertyArray? = null,

)
