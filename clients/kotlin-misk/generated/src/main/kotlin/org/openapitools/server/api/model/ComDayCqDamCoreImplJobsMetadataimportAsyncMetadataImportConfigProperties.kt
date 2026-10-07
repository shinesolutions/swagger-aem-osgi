package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(
    val operation: ConfigNodePropertyString? = null,
    val operationIcon: ConfigNodePropertyString? = null,
    val topicName: ConfigNodePropertyString? = null,
    val emailEnabled: ConfigNodePropertyBoolean? = null
)
