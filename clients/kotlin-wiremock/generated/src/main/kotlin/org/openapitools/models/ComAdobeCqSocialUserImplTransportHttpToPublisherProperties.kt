@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(
    @field:JsonProperty("enable")
    val enable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("agent.configuration")
    val agentConfiguration: ConfigNodePropertyArray? = null,

    @field:JsonProperty("context.path")
    val contextPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("disabled.cipher.suites")
    val disabledCipherSuites: ConfigNodePropertyArray? = null,

    @field:JsonProperty("enabled.cipher.suites")
    val enabledCipherSuites: ConfigNodePropertyArray? = null,

)
