@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(
    @field:JsonProperty("dmreplicateonmodify.enabled")
    val dmreplicateonmodifyEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("dmreplicateonmodify.forcesyncdeletes")
    val dmreplicateonmodifyForcesyncdeletes: ConfigNodePropertyBoolean? = null,

)
