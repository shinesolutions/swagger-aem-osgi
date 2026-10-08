@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(
    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("launches.eventhandler.threadpool.maxsize")
    val launchesEventhandlerThreadpoolMaxsize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("launches.eventhandler.threadpool.priority")
    val launchesEventhandlerThreadpoolPriority: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("launches.eventhandler.updatelastmodification")
    val launchesEventhandlerUpdatelastmodification: ConfigNodePropertyBoolean? = null,

)
