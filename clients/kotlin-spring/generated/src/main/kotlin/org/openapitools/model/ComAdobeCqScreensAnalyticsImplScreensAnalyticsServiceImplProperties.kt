package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyDropDown
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
 * @param comAdobeCqScreensAnalyticsImplUrl 
 * @param comAdobeCqScreensAnalyticsImplApikey 
 * @param comAdobeCqScreensAnalyticsImplProject 
 * @param comAdobeCqScreensAnalyticsImplEnvironment 
 * @param comAdobeCqScreensAnalyticsImplSendFrequency 
 */
data class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.analytics.impl.url")
    @get:JsonProperty("com.adobe.cq.screens.analytics.impl.url") val comAdobeCqScreensAnalyticsImplUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.analytics.impl.apikey")
    @get:JsonProperty("com.adobe.cq.screens.analytics.impl.apikey") val comAdobeCqScreensAnalyticsImplApikey: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.analytics.impl.project")
    @get:JsonProperty("com.adobe.cq.screens.analytics.impl.project") val comAdobeCqScreensAnalyticsImplProject: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.analytics.impl.environment")
    @get:JsonProperty("com.adobe.cq.screens.analytics.impl.environment") val comAdobeCqScreensAnalyticsImplEnvironment: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.screens.analytics.impl.sendFrequency")
    @get:JsonProperty("com.adobe.cq.screens.analytics.impl.sendFrequency") val comAdobeCqScreensAnalyticsImplSendFrequency: ConfigNodePropertyInteger? = null
) {

}

