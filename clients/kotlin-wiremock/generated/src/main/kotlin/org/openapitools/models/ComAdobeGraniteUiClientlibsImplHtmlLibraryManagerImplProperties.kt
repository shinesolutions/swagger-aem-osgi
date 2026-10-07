@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(
    @field:JsonProperty("htmllibmanager.timing")
    val htmllibmanagerTiming: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("htmllibmanager.debug.init.js")
    val htmllibmanagerDebugInitJs: ConfigNodePropertyString? = null,

    @field:JsonProperty("htmllibmanager.minify")
    val htmllibmanagerMinify: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("htmllibmanager.debug")
    val htmllibmanagerDebug: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("htmllibmanager.gzip")
    val htmllibmanagerGzip: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("htmllibmanager.maxDataUriSize")
    val htmllibmanagerMaxDataUriSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("htmllibmanager.maxage")
    val htmllibmanagerMaxage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("htmllibmanager.forceCQUrlInfo")
    val htmllibmanagerForceCQUrlInfo: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("htmllibmanager.defaultthemename")
    val htmllibmanagerDefaultthemename: ConfigNodePropertyString? = null,

    @field:JsonProperty("htmllibmanager.defaultuserthemename")
    val htmllibmanagerDefaultuserthemename: ConfigNodePropertyString? = null,

    @field:JsonProperty("htmllibmanager.clientmanager")
    val htmllibmanagerClientmanager: ConfigNodePropertyString? = null,

    @field:JsonProperty("htmllibmanager.path.list")
    val htmllibmanagerPathList: ConfigNodePropertyArray? = null,

    @field:JsonProperty("htmllibmanager.excluded.path.list")
    val htmllibmanagerExcludedPathList: ConfigNodePropertyArray? = null,

    @field:JsonProperty("htmllibmanager.processor.js")
    val htmllibmanagerProcessorJs: ConfigNodePropertyArray? = null,

    @field:JsonProperty("htmllibmanager.processor.css")
    val htmllibmanagerProcessorCss: ConfigNodePropertyArray? = null,

    @field:JsonProperty("htmllibmanager.longcache.patterns")
    val htmllibmanagerLongcachePatterns: ConfigNodePropertyArray? = null,

    @field:JsonProperty("htmllibmanager.longcache.format")
    val htmllibmanagerLongcacheFormat: ConfigNodePropertyString? = null,

    @field:JsonProperty("htmllibmanager.useFileSystemOutputCache")
    val htmllibmanagerUseFileSystemOutputCache: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
    val htmllibmanagerFileSystemOutputCacheLocation: ConfigNodePropertyString? = null,

    @field:JsonProperty("htmllibmanager.disable.replacement")
    val htmllibmanagerDisableReplacement: ConfigNodePropertyArray? = null,

)
