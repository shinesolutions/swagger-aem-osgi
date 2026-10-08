package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param schedulerPeriod 
 * @param schedulerConcurrent 
 * @param serviceBadLinkToleranceInterval 
 * @param serviceCheckOverridePatterns 
 * @param serviceCacheBrokenInternalLinks 
 * @param serviceSpecialLinkPrefix 
 * @param serviceSpecialLinkPatterns 
 */
data class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduler.period")
    @get:JsonProperty("scheduler.period") val schedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduler.concurrent")
    @get:JsonProperty("scheduler.concurrent") val schedulerConcurrent: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service.bad_link_tolerance_interval")
    @get:JsonProperty("service.bad_link_tolerance_interval") val serviceBadLinkToleranceInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service.check_override_patterns")
    @get:JsonProperty("service.check_override_patterns") val serviceCheckOverridePatterns: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service.cache_broken_internal_links")
    @get:JsonProperty("service.cache_broken_internal_links") val serviceCacheBrokenInternalLinks: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service.special_link_prefix")
    @get:JsonProperty("service.special_link_prefix") val serviceSpecialLinkPrefix: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service.special_link_patterns")
    @get:JsonProperty("service.special_link_patterns") val serviceSpecialLinkPatterns: ConfigNodePropertyArray? = null
) {

}

