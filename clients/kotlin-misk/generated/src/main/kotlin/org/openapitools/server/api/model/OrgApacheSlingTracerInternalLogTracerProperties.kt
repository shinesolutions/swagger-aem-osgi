package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingTracerInternalLogTracerProperties(
    val tracerSets: ConfigNodePropertyArray? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val servletEnabled: ConfigNodePropertyBoolean? = null,
    val recordingCacheSizeInMB: ConfigNodePropertyInteger? = null,
    val recordingCacheDurationInSecs: ConfigNodePropertyInteger? = null,
    val recordingCompressionEnabled: ConfigNodePropertyBoolean? = null,
    val gzipResponse: ConfigNodePropertyBoolean? = null
)
