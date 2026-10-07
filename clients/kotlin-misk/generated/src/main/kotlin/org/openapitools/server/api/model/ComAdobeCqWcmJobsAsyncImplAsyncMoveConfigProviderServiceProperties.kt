package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties(
    val threshold: ConfigNodePropertyInteger? = null,
    val jobTopicName: ConfigNodePropertyString? = null,
    val emailEnabled: ConfigNodePropertyBoolean? = null
)
