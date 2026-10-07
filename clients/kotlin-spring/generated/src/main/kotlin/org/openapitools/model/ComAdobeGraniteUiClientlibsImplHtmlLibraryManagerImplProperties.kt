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
 * @param htmllibmanagerTiming 
 * @param htmllibmanagerDebugInitJs 
 * @param htmllibmanagerMinify 
 * @param htmllibmanagerDebug 
 * @param htmllibmanagerGzip 
 * @param htmllibmanagerMaxDataUriSize 
 * @param htmllibmanagerMaxage 
 * @param htmllibmanagerForceCQUrlInfo 
 * @param htmllibmanagerDefaultthemename 
 * @param htmllibmanagerDefaultuserthemename 
 * @param htmllibmanagerClientmanager 
 * @param htmllibmanagerPathList 
 * @param htmllibmanagerExcludedPathList 
 * @param htmllibmanagerProcessorJs 
 * @param htmllibmanagerProcessorCss 
 * @param htmllibmanagerLongcachePatterns 
 * @param htmllibmanagerLongcacheFormat 
 * @param htmllibmanagerUseFileSystemOutputCache 
 * @param htmllibmanagerFileSystemOutputCacheLocation 
 * @param htmllibmanagerDisableReplacement 
 */
data class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.timing")
    @get:JsonProperty("htmllibmanager.timing") val htmllibmanagerTiming: ConfigNodePropertyBoolean? = null,

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
    @param:JsonProperty("htmllibmanager.minify")
    @get:JsonProperty("htmllibmanager.minify") val htmllibmanagerMinify: ConfigNodePropertyBoolean? = null,

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
    @param:JsonProperty("htmllibmanager.gzip")
    @get:JsonProperty("htmllibmanager.gzip") val htmllibmanagerGzip: ConfigNodePropertyBoolean? = null,

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
    @param:JsonProperty("htmllibmanager.maxage")
    @get:JsonProperty("htmllibmanager.maxage") val htmllibmanagerMaxage: ConfigNodePropertyInteger? = null,

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
    @param:JsonProperty("htmllibmanager.clientmanager")
    @get:JsonProperty("htmllibmanager.clientmanager") val htmllibmanagerClientmanager: ConfigNodePropertyString? = null,

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
    @param:JsonProperty("htmllibmanager.excluded.path.list")
    @get:JsonProperty("htmllibmanager.excluded.path.list") val htmllibmanagerExcludedPathList: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.processor.js")
    @get:JsonProperty("htmllibmanager.processor.js") val htmllibmanagerProcessorJs: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.processor.css")
    @get:JsonProperty("htmllibmanager.processor.css") val htmllibmanagerProcessorCss: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.longcache.patterns")
    @get:JsonProperty("htmllibmanager.longcache.patterns") val htmllibmanagerLongcachePatterns: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.longcache.format")
    @get:JsonProperty("htmllibmanager.longcache.format") val htmllibmanagerLongcacheFormat: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.useFileSystemOutputCache")
    @get:JsonProperty("htmllibmanager.useFileSystemOutputCache") val htmllibmanagerUseFileSystemOutputCache: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
    @get:JsonProperty("htmllibmanager.fileSystemOutputCacheLocation") val htmllibmanagerFileSystemOutputCacheLocation: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("htmllibmanager.disable.replacement")
    @get:JsonProperty("htmllibmanager.disable.replacement") val htmllibmanagerDisableReplacement: ConfigNodePropertyArray? = null
) {

}

