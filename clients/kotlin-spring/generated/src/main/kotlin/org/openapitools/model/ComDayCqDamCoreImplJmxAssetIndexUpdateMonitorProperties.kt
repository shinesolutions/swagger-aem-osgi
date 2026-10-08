package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyFloat
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
 * @param jmxObjectname 
 * @param propertyMeasureEnabled 
 * @param propertyName 
 * @param propertyMaxWaitMs 
 * @param propertyMaxRate 
 * @param fulltextMeasureEnabled 
 * @param fulltextName 
 * @param fulltextMaxWaitMs 
 * @param fulltextMaxRate 
 */
data class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jmx.objectname")
    @get:JsonProperty("jmx.objectname") val jmxObjectname: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("property.measure.enabled")
    @get:JsonProperty("property.measure.enabled") val propertyMeasureEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("property.name")
    @get:JsonProperty("property.name") val propertyName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("property.max.wait.ms")
    @get:JsonProperty("property.max.wait.ms") val propertyMaxWaitMs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("property.max.rate")
    @get:JsonProperty("property.max.rate") val propertyMaxRate: ConfigNodePropertyFloat? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("fulltext.measure.enabled")
    @get:JsonProperty("fulltext.measure.enabled") val fulltextMeasureEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("fulltext.name")
    @get:JsonProperty("fulltext.name") val fulltextName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("fulltext.max.wait.ms")
    @get:JsonProperty("fulltext.max.wait.ms") val fulltextMaxWaitMs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("fulltext.max.rate")
    @get:JsonProperty("fulltext.max.rate") val fulltextMaxRate: ConfigNodePropertyFloat? = null
) {

}

