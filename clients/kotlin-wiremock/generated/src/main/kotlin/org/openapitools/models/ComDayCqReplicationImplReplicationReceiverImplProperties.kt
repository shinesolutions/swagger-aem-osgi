@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReplicationImplReplicationReceiverImplProperties(
    @field:JsonProperty("receiver.tmpfile.threshold")
    val receiverTmpfileThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("receiver.packages.use.install")
    val receiverPackagesUseInstall: ConfigNodePropertyBoolean? = null,

)
