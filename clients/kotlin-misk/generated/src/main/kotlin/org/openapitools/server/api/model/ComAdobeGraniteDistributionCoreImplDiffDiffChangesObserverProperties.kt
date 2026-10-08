package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(
    val enabled: ConfigNodePropertyBoolean? = null,
    val agentName: ConfigNodePropertyString? = null,
    val diffPath: ConfigNodePropertyString? = null,
    val observedPath: ConfigNodePropertyString? = null,
    val serviceName: ConfigNodePropertyString? = null,
    val propertyNames: ConfigNodePropertyString? = null,
    val distributionDelay: ConfigNodePropertyInteger? = null,
    val serviceUserTarget: ConfigNodePropertyString? = null
)
