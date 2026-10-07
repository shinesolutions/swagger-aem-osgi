@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(
    @field:JsonProperty("automoderation.sequence")
    val automoderationSequence: ConfigNodePropertyArray? = null,

    @field:JsonProperty("automoderation.onfailurestop")
    val automoderationOnfailurestop: ConfigNodePropertyBoolean? = null,

)
