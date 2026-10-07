@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqJcrclustersupportClusterStartLevelControllerProperties(
    @field:JsonProperty("cluster.level.enable")
    val clusterLevelEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cluster.master.level")
    val clusterMasterLevel: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.slave.level")
    val clusterSlaveLevel: ConfigNodePropertyInteger? = null,

)
