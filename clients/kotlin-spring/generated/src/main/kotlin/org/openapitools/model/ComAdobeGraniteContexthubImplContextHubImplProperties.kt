package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param comAdobeGraniteContexthubSilentMode 
 * @param comAdobeGraniteContexthubShowUi 
 */
data class ComAdobeGraniteContexthubImplContextHubImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.contexthub.silent_mode")
    @get:JsonProperty("com.adobe.granite.contexthub.silent_mode") val comAdobeGraniteContexthubSilentMode: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.contexthub.show_ui")
    @get:JsonProperty("com.adobe.granite.contexthub.show_ui") val comAdobeGraniteContexthubShowUi: ConfigNodePropertyBoolean? = null
) {

}

