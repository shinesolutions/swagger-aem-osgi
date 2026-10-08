package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername 
 * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword 
 */
data class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")
    @get:JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password") val comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ConfigNodePropertyString? = null
) {

}

