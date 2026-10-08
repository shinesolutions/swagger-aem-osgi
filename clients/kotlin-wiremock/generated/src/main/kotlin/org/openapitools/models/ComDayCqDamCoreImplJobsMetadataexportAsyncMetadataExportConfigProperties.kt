@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(
    @field:JsonProperty("operation")
    val operation: ConfigNodePropertyString? = null,

    @field:JsonProperty("emailEnabled")
    val emailEnabled: ConfigNodePropertyBoolean? = null,

)
