package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWidgetImplHtmlLibraryManagerImplProperties(
    val htmllibmanagerClientmanager: ConfigNodePropertyString? = null,
    val htmllibmanagerDebug: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerDebugConsole: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerDebugInitJs: ConfigNodePropertyString? = null,
    val htmllibmanagerDefaultthemename: ConfigNodePropertyString? = null,
    val htmllibmanagerDefaultuserthemename: ConfigNodePropertyString? = null,
    val htmllibmanagerFirebuglitePath: ConfigNodePropertyString? = null,
    val htmllibmanagerForceCQUrlInfo: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerGzip: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerMaxage: ConfigNodePropertyInteger? = null,
    val htmllibmanagerMaxDataUriSize: ConfigNodePropertyInteger? = null,
    val htmllibmanagerMinify: ConfigNodePropertyBoolean? = null,
    val htmllibmanagerPathList: ConfigNodePropertyArray? = null,
    val htmllibmanagerTiming: ConfigNodePropertyBoolean? = null
)
