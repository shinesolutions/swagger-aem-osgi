@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingTracerInternalLogTracerProperties(
    @field:JsonProperty("tracerSets")
    val tracerSets: ConfigNodePropertyArray? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("servletEnabled")
    val servletEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("recordingCacheSizeInMB")
    val recordingCacheSizeInMB: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("recordingCacheDurationInSecs")
    val recordingCacheDurationInSecs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("recordingCompressionEnabled")
    val recordingCompressionEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("gzipResponse")
    val gzipResponse: ConfigNodePropertyBoolean? = null,

)
