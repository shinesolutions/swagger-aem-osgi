package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ConfigNodePropertyArray? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ConfigNodePropertyString? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ConfigNodePropertyInteger? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ConfigNodePropertyString? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ConfigNodePropertyString? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ConfigNodePropertyInteger? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ConfigNodePropertyBoolean? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ConfigNodePropertyString? = null,
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ConfigNodePropertyString? = null
)
