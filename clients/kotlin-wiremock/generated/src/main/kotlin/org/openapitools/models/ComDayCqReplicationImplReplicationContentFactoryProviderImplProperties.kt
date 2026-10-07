@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(
    @field:JsonProperty("replication.content.useFileStorage")
    val replicationContentUseFileStorage: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("replication.content.maxCommitAttempts")
    val replicationContentMaxCommitAttempts: ConfigNodePropertyInteger? = null,

)
