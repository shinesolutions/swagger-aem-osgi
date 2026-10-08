@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(
    @field:JsonProperty("showPlaceholder")
    val showPlaceholder: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("maximumCacheEntries")
    val maximumCacheEntries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("af.scripting.compatversion")
    val afScriptingCompatversion: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("makeFileNameUnique")
    val makeFileNameUnique: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("generatingCompliantData")
    val generatingCompliantData: ConfigNodePropertyBoolean? = null,

)
