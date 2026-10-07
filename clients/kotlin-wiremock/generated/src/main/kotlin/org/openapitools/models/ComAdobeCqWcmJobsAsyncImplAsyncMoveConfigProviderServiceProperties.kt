@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties(
    @field:JsonProperty("threshold")
    val threshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("jobTopicName")
    val jobTopicName: ConfigNodePropertyString? = null,

    @field:JsonProperty("emailEnabled")
    val emailEnabled: ConfigNodePropertyBoolean? = null,

)
