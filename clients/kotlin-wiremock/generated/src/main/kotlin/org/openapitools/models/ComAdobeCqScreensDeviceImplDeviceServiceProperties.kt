@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqScreensDeviceImplDeviceServiceProperties(
    @field:JsonProperty("com.adobe.aem.screens.player.pingfrequency")
    val comAdobeAemScreensPlayerPingfrequency: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.aem.screens.device.pasword.specialchars")
    val comAdobeAemScreensDevicePaswordSpecialchars: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.aem.screens.device.pasword.minlowercasechars")
    val comAdobeAemScreensDevicePaswordMinlowercasechars: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.aem.screens.device.pasword.minuppercasechars")
    val comAdobeAemScreensDevicePaswordMinuppercasechars: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.aem.screens.device.pasword.minnumberchars")
    val comAdobeAemScreensDevicePaswordMinnumberchars: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.aem.screens.device.pasword.minspecialchars")
    val comAdobeAemScreensDevicePaswordMinspecialchars: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.aem.screens.device.pasword.minlength")
    val comAdobeAemScreensDevicePaswordMinlength: ConfigNodePropertyInteger? = null,

)
