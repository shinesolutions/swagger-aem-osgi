package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(
    val createPreviewEnabled: ConfigNodePropertyBoolean? = null,
    val updatePreviewEnabled: ConfigNodePropertyBoolean? = null,
    val queueSize: ConfigNodePropertyInteger? = null,
    val folderPreviewRenditionRegex: ConfigNodePropertyString? = null
)
