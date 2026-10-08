package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialSyncImplDiffChangesObserverProperties(
    val enabled: ConfigNodePropertyBoolean? = null,
    val agentName: ConfigNodePropertyString? = null,
    val diffPath: ConfigNodePropertyString? = null,
    val propertyNames: ConfigNodePropertyString? = null
)
