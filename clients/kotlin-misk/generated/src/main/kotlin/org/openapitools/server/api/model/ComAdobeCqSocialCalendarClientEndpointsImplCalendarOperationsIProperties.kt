package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(
    val maxRetry: ConfigNodePropertyInteger? = null,
    val fieldWhitelist: ConfigNodePropertyArray? = null,
    val attachmentTypeBlacklist: ConfigNodePropertyArray? = null
)
