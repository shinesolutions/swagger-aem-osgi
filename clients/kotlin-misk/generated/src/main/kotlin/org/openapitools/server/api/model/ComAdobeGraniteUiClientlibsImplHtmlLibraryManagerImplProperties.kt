package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(
    val htmllibmanagerTiming: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerDebugInitJs: ConfigNodePropertyString? = null,
    val htmllibmanagerMinify: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerDebug: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerGzip: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerMaxDataUriSize: ConfigNodePropertyInteger? = null,
    val htmllibmanagerMaxage: ConfigNodePropertyInteger? = null,
    val htmllibmanagerForceCQUrlInfo: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerDefaultthemename: ConfigNodePropertyString? = null,
    val htmllibmanagerDefaultuserthemename: ConfigNodePropertyString? = null,
    val htmllibmanagerClientmanager: ConfigNodePropertyString? = null,
    val htmllibmanagerPathList: ConfigNodePropertyArray? = null,
    val htmllibmanagerExcludedPathList: ConfigNodePropertyArray? = null,
    val htmllibmanagerProcessorJs: ConfigNodePropertyArray? = null,
    val htmllibmanagerProcessorCss: ConfigNodePropertyArray? = null,
    val htmllibmanagerLongcachePatterns: ConfigNodePropertyArray? = null,
    val htmllibmanagerLongcacheFormat: ConfigNodePropertyString? = null,
    val htmllibmanagerUseFileSystemOutputCache: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerFileSystemOutputCacheLocation: ConfigNodePropertyString? = null,
    val htmllibmanagerDisableReplacement: ConfigNodePropertyArray? = null
)
