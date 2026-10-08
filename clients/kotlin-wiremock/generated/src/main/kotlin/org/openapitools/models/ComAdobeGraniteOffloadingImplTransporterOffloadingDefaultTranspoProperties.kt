@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(
    @field:JsonProperty("default.transport.agent-to-worker.prefix")
    val defaultTransportAgentToWorkerPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("default.transport.agent-to-master.prefix")
    val defaultTransportAgentToMasterPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("default.transport.input.package")
    val defaultTransportInputPackage: ConfigNodePropertyString? = null,

    @field:JsonProperty("default.transport.output.package")
    val defaultTransportOutputPackage: ConfigNodePropertyString? = null,

    @field:JsonProperty("default.transport.replication.synchronous")
    val defaultTransportReplicationSynchronous: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("default.transport.contentpackage")
    val defaultTransportContentpackage: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("offloading.transporter.default.enabled")
    val offloadingTransporterDefaultEnabled: ConfigNodePropertyBoolean? = null,

)
