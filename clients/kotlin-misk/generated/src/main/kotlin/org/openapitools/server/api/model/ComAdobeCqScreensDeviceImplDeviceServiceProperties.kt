package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqScreensDeviceImplDeviceServiceProperties(
    val comAdobeAemScreensPlayerPingfrequency: ConfigNodePropertyInteger? = null,
    val comAdobeAemScreensDevicePaswordSpecialchars: ConfigNodePropertyString? = null,
    val comAdobeAemScreensDevicePaswordMinlowercasechars: ConfigNodePropertyInteger? = null,
    val comAdobeAemScreensDevicePaswordMinuppercasechars: ConfigNodePropertyInteger? = null,
    val comAdobeAemScreensDevicePaswordMinnumberchars: ConfigNodePropertyInteger? = null,
    val comAdobeAemScreensDevicePaswordMinspecialchars: ConfigNodePropertyInteger? = null,
    val comAdobeAemScreensDevicePaswordMinlength: ConfigNodePropertyInteger? = null
)
