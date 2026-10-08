@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(
    @field:JsonProperty("createPreviewEnabled")
    val createPreviewEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("updatePreviewEnabled")
    val updatePreviewEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("queueSize")
    val queueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("folderPreviewRenditionRegex")
    val folderPreviewRenditionRegex: ConfigNodePropertyString? = null,

)
