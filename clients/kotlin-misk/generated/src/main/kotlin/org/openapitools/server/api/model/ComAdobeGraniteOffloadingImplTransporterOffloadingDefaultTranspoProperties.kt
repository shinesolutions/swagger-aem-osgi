package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(
    val defaultTransportAgentToWorkerPrefix: ConfigNodePropertyString? = null,
    val defaultTransportAgentToMasterPrefix: ConfigNodePropertyString? = null,
    val defaultTransportInputPackage: ConfigNodePropertyString? = null,
    val defaultTransportOutputPackage: ConfigNodePropertyString? = null,
    val defaultTransportReplicationSynchronous: ConfigNodePropertyBoolean? = null,
    val defaultTransportContentpackage: ConfigNodePropertyBoolean? = null,
    val offloadingTransporterDefaultEnabled: ConfigNodePropertyBoolean? = null
)
