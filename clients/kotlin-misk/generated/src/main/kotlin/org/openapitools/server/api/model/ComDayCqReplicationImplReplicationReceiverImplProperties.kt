package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqReplicationImplReplicationReceiverImplProperties(
    val receiverTmpfileThreshold: ConfigNodePropertyInteger? = null,
    val receiverPackagesUseInstall: ConfigNodePropertyBoolean? = null
)
