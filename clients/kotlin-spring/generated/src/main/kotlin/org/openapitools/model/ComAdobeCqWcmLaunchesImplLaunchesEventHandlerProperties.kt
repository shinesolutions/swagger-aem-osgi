package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param eventFilter 
 * @param launchesEventhandlerThreadpoolMaxsize 
 * @param launchesEventhandlerThreadpoolPriority 
 * @param launchesEventhandlerUpdatelastmodification 
 */
data class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("event.filter")
    @get:JsonProperty("event.filter") val eventFilter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("launches.eventhandler.threadpool.maxsize")
    @get:JsonProperty("launches.eventhandler.threadpool.maxsize") val launchesEventhandlerThreadpoolMaxsize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("launches.eventhandler.threadpool.priority")
    @get:JsonProperty("launches.eventhandler.threadpool.priority") val launchesEventhandlerThreadpoolPriority: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("launches.eventhandler.updatelastmodification")
    @get:JsonProperty("launches.eventhandler.updatelastmodification") val launchesEventhandlerUpdatelastmodification: ConfigNodePropertyBoolean? = null
) {

}

