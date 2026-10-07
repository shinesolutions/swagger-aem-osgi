package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(
    val eventFilter: ConfigNodePropertyString? = null,
    val launchesEventhandlerThreadpoolMaxsize: ConfigNodePropertyInteger? = null,
    val launchesEventhandlerThreadpoolPriority: ConfigNodePropertyDropDown? = null,
    val launchesEventhandlerUpdatelastmodification: ConfigNodePropertyBoolean? = null
)
