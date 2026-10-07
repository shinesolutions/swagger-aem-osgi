@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(
    @field:JsonProperty("firewall.deserialization.whitelist")
    val firewallDeserializationWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("firewall.deserialization.blacklist")
    val firewallDeserializationBlacklist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("firewall.deserialization.diagnostics")
    val firewallDeserializationDiagnostics: ConfigNodePropertyString? = null,

)
