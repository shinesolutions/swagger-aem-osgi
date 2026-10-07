package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param cqAnalyticsTestandtargetApiUrl 
 * @param cqAnalyticsTestandtargetTimeout 
 * @param cqAnalyticsTestandtargetSockettimeout 
 * @param cqAnalyticsTestandtargetRecommendationsUrlReplace 
 * @param cqAnalyticsTestandtargetRecommendationsUrlReplacewith 
 */
data class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.analytics.testandtarget.api.url")
    @get:JsonProperty("cq.analytics.testandtarget.api.url") val cqAnalyticsTestandtargetApiUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.analytics.testandtarget.timeout")
    @get:JsonProperty("cq.analytics.testandtarget.timeout") val cqAnalyticsTestandtargetTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.analytics.testandtarget.sockettimeout")
    @get:JsonProperty("cq.analytics.testandtarget.sockettimeout") val cqAnalyticsTestandtargetSockettimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
    @get:JsonProperty("cq.analytics.testandtarget.recommendations.url.replace") val cqAnalyticsTestandtargetRecommendationsUrlReplace: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
    @get:JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith") val cqAnalyticsTestandtargetRecommendationsUrlReplacewith: ConfigNodePropertyString? = null
) {

}

