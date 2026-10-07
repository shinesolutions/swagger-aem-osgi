package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(
    val comAdobeCqScreensAnalyticsImplUrl: ConfigNodePropertyString? = null,
    val comAdobeCqScreensAnalyticsImplApikey: ConfigNodePropertyString? = null,
    val comAdobeCqScreensAnalyticsImplProject: ConfigNodePropertyString? = null,
    val comAdobeCqScreensAnalyticsImplEnvironment: ConfigNodePropertyDropDown? = null,
    val comAdobeCqScreensAnalyticsImplSendFrequency: ConfigNodePropertyInteger? = null
)
