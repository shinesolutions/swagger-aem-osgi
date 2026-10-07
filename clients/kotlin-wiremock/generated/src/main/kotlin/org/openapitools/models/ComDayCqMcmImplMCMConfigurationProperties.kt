@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqMcmImplMCMConfigurationProperties(
    @field:JsonProperty("experience.indirection")
    val experienceIndirection: ConfigNodePropertyArray? = null,

    @field:JsonProperty("touchpoint.indirection")
    val touchpointIndirection: ConfigNodePropertyArray? = null,

)
