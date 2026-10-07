@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(
    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ConfigNodePropertyArray? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")
    val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ConfigNodePropertyString? = null,

)
