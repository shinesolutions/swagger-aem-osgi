@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteContexthubImplContextHubImplProperties(
    @field:JsonProperty("com.adobe.granite.contexthub.silent_mode")
    val comAdobeGraniteContexthubSilentMode: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("com.adobe.granite.contexthub.show_ui")
    val comAdobeGraniteContexthubShowUi: ConfigNodePropertyBoolean? = null,

)
