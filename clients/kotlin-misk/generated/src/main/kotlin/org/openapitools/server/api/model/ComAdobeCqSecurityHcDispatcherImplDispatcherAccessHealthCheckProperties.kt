package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(
    val hcTags: ConfigNodePropertyArray? = null,
    val dispatcherAddress: ConfigNodePropertyString? = null,
    val dispatcherFilterAllowed: ConfigNodePropertyArray? = null,
    val dispatcherFilterBlocked: ConfigNodePropertyArray? = null
)
