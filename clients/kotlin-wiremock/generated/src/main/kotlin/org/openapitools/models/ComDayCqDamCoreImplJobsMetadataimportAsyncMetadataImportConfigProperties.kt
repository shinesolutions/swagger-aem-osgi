@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(
    @field:JsonProperty("operation")
    val operation: ConfigNodePropertyString? = null,

    @field:JsonProperty("operationIcon")
    val operationIcon: ConfigNodePropertyString? = null,

    @field:JsonProperty("topicName")
    val topicName: ConfigNodePropertyString? = null,

    @field:JsonProperty("emailEnabled")
    val emailEnabled: ConfigNodePropertyBoolean? = null,

)
