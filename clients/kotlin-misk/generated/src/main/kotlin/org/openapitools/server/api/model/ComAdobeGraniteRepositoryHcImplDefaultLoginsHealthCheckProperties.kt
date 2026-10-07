package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(
    val hcTags: ConfigNodePropertyArray? = null,
    val accountLogins: ConfigNodePropertyArray? = null,
    val consoleLogins: ConfigNodePropertyArray? = null
)
