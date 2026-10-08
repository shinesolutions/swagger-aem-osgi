@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqScreensImplScreensChannelPostProcessorProperties(
    @field:JsonProperty("screens.channels.properties.to.remove")
    val screensChannelsPropertiesToRemove: ConfigNodePropertyArray? = null,

)
