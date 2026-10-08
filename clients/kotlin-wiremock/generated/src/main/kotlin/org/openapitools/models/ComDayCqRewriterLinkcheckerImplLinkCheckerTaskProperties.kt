@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(
    @field:JsonProperty("scheduler.period")
    val schedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("scheduler.concurrent")
    val schedulerConcurrent: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("good_link_test_interval")
    val goodLinkTestInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("bad_link_test_interval")
    val badLinkTestInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("link_unused_interval")
    val linkUnusedInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("connection.timeout")
    val connectionTimeout: ConfigNodePropertyInteger? = null,

)
