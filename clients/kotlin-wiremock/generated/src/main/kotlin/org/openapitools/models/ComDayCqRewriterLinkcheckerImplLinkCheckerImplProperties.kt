@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(
    @field:JsonProperty("scheduler.period")
    val schedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("scheduler.concurrent")
    val schedulerConcurrent: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("service.bad_link_tolerance_interval")
    val serviceBadLinkToleranceInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("service.check_override_patterns")
    val serviceCheckOverridePatterns: ConfigNodePropertyArray? = null,

    @field:JsonProperty("service.cache_broken_internal_links")
    val serviceCacheBrokenInternalLinks: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("service.special_link_prefix")
    val serviceSpecialLinkPrefix: ConfigNodePropertyArray? = null,

    @field:JsonProperty("service.special_link_patterns")
    val serviceSpecialLinkPatterns: ConfigNodePropertyArray? = null,

)
