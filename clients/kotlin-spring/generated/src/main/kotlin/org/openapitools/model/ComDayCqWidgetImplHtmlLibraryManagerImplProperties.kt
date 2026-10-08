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
 * @param htmllibmanagerClientmanager 
 * @param htmllibmanagerDebug 
 * @param htmllibmanagerDebugConsole 
 * @param htmllibmanagerDebugInitJs 
 * @param htmllibmanagerDefaultthemename 
 * @param htmllibmanagerDefaultuserthemename 
 * @param htmllibmanagerFirebuglitePath 
 * @param htmllibmanagerForceCQUrlInfo 
 * @param htmllibmanagerGzip 
 * @param htmllibmanagerMaxage 
 * @param htmllibmanagerMaxDataUriSize 
 * @param htmllibmanagerMinify 
 * @param htmllibmanagerPathList 
 * @param htmllibmanagerTiming 
 */
data class ComDayCqWidgetImplHtmlLibraryManagerImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.clientmanager")
    @get:JsonProperty("htmllibmanager.clientmanager") val htmllibmanagerClientmanager: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.debug")
    @get:JsonProperty("htmllibmanager.debug") val htmllibmanagerDebug: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.debug.console")
    @get:JsonProperty("htmllibmanager.debug.console") val htmllibmanagerDebugConsole: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.debug.init.js")
    @get:JsonProperty("htmllibmanager.debug.init.js") val htmllibmanagerDebugInitJs: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.defaultthemename")
    @get:JsonProperty("htmllibmanager.defaultthemename") val htmllibmanagerDefaultthemename: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.defaultuserthemename")
    @get:JsonProperty("htmllibmanager.defaultuserthemename") val htmllibmanagerDefaultuserthemename: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.firebuglite.path")
    @get:JsonProperty("htmllibmanager.firebuglite.path") val htmllibmanagerFirebuglitePath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.forceCQUrlInfo")
    @get:JsonProperty("htmllibmanager.forceCQUrlInfo") val htmllibmanagerForceCQUrlInfo: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.gzip")
    @get:JsonProperty("htmllibmanager.gzip") val htmllibmanagerGzip: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.maxage")
    @get:JsonProperty("htmllibmanager.maxage") val htmllibmanagerMaxage: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.maxDataUriSize")
    @get:JsonProperty("htmllibmanager.maxDataUriSize") val htmllibmanagerMaxDataUriSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.minify")
    @get:JsonProperty("htmllibmanager.minify") val htmllibmanagerMinify: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.path.list")
    @get:JsonProperty("htmllibmanager.path.list") val htmllibmanagerPathList: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.timing")
    @get:JsonProperty("htmllibmanager.timing") val htmllibmanagerTiming: ConfigNodePropertyBoolean? = null
) {

}

