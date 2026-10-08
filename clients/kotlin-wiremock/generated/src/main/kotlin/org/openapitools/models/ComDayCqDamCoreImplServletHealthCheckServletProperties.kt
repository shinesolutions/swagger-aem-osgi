@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletHealthCheckServletProperties(
    @field:JsonProperty("cq.dam.sync.workflow.id")
    val cqDamSyncWorkflowId: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.sync.folder.types")
    val cqDamSyncFolderTypes: ConfigNodePropertyArray? = null,

)
