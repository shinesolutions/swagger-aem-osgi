package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(
    val enable: ConfigNodePropertyBoolean? = null,
    val agentConfiguration: ConfigNodePropertyArray? = null,
    val contextPath: ConfigNodePropertyString? = null,
    val disabledCipherSuites: ConfigNodePropertyArray? = null,
    val enabledCipherSuites: ConfigNodePropertyArray? = null
)
