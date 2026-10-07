package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName 
 * @param cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName 
 * @param cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName 
 * @param cqDamS7damVideoproxyclientserviceHttpReadtimeoutName 
 * @param cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName 
 * @param cqDamS7damVideoproxyclientserviceHttpMaxretrycountName 
 * @param cqDamS7damVideoproxyclientserviceUploadprogressIntervalName 
 */
data class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name")
    @get:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name") val cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name")
    @get:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name") val cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name")
    @get:JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name") val cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name")
    @get:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name") val cqDamS7damVideoproxyclientserviceHttpReadtimeoutName: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name")
    @get:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name") val cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name")
    @get:JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name") val cqDamS7damVideoproxyclientserviceHttpMaxretrycountName: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name")
    @get:JsonProperty("cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name") val cqDamS7damVideoproxyclientserviceUploadprogressIntervalName: ConfigNodePropertyInteger? = null
) {

}

