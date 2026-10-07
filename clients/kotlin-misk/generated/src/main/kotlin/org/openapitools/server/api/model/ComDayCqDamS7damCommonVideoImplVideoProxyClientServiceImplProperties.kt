package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(
    val cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName: ConfigNodePropertyInteger? = null,
    val cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName: ConfigNodePropertyInteger? = null,
    val cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName: ConfigNodePropertyInteger? = null,
    val cqDamS7damVideoproxyclientserviceHttpReadtimeoutName: ConfigNodePropertyInteger? = null,
    val cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName: ConfigNodePropertyInteger? = null,
    val cqDamS7damVideoproxyclientserviceHttpMaxretrycountName: ConfigNodePropertyInteger? = null,
    val cqDamS7damVideoproxyclientserviceUploadprogressIntervalName: ConfigNodePropertyInteger? = null
)
