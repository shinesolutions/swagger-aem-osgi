package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreProcessMetadataProcessorProcessProperties(
    val processLabel: ConfigNodePropertyString? = null,
    val cqDamEnableSha1: ConfigNodePropertyBoolean? = null,
    val cqDamMetadataXssprotectedProperties: ConfigNodePropertyArray? = null
)
