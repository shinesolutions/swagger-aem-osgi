package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(
    val eventFilter: ConfigNodePropertyString? = null,
    val minThreadPoolSize: ConfigNodePropertyInteger? = null,
    val maxThreadPoolSize: ConfigNodePropertyInteger? = null,
    val cqWcmWorkflowTerminateOnActivate: ConfigNodePropertyBoolean? = null,
    val cqWcmWorklfowTerminateExclusionList: ConfigNodePropertyArray? = null
)
