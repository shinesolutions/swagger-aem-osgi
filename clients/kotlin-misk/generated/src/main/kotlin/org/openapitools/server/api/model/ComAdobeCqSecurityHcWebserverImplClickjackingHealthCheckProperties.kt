package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(
    val hcTags: ConfigNodePropertyArray? = null,
    val webserverAddress: ConfigNodePropertyString? = null
)
