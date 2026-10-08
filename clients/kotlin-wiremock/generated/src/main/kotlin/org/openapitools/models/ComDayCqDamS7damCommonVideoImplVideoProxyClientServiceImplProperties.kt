@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(
    @field:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name")
    val cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name")
    val cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name")
    val cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name")
    val cqDamS7damVideoproxyclientserviceHttpReadtimeoutName: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name")
    val cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name")
    val cqDamS7damVideoproxyclientserviceHttpMaxretrycountName: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name")
    val cqDamS7damVideoproxyclientserviceUploadprogressIntervalName: ConfigNodePropertyInteger? = null,

)
