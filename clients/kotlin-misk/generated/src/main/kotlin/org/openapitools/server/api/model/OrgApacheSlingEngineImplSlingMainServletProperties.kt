package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEngineImplSlingMainServletProperties(
    val slingMaxCalls: ConfigNodePropertyInteger? = null,
    val slingMaxInclusions: ConfigNodePropertyInteger? = null,
    val slingTraceAllow: ConfigNodePropertyBoolean? = null,
    val slingMaxRecordRequests: ConfigNodePropertyInteger? = null,
    val slingStorePatternRequests: ConfigNodePropertyArray? = null,
    val slingServerinfo: ConfigNodePropertyString? = null,
    val slingAdditionalResponseHeaders: ConfigNodePropertyArray? = null
)
