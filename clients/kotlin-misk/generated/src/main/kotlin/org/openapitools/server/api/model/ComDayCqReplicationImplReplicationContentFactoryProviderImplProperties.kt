package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(
    val replicationContentUseFileStorage: ConfigNodePropertyBoolean? = null,
    val replicationContentMaxCommitAttempts: ConfigNodePropertyInteger? = null
)
