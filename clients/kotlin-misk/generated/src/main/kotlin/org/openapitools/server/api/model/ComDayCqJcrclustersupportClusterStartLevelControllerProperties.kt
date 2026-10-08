package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqJcrclustersupportClusterStartLevelControllerProperties(
    val clusterLevelEnable: ConfigNodePropertyBoolean? = null,
    val clusterMasterLevel: ConfigNodePropertyInteger? = null,
    val clusterSlaveLevel: ConfigNodePropertyInteger? = null
)
