
package org.openapitools.client.model


case class ComDayCqJcrclustersupportClusterStartLevelControllerProperties (
    _clusterLevelEnable: Option[ConfigNodePropertyBoolean],
    _clusterMasterLevel: Option[ConfigNodePropertyInteger],
    _clusterSlaveLevel: Option[ConfigNodePropertyInteger]
)
object ComDayCqJcrclustersupportClusterStartLevelControllerProperties {
    def toStringBody(var_clusterLevelEnable: Object, var_clusterMasterLevel: Object, var_clusterSlaveLevel: Object) =
        s"""
        | {
        | "clusterLevelEnable":$var_clusterLevelEnable,"clusterMasterLevel":$var_clusterMasterLevel,"clusterSlaveLevel":$var_clusterSlaveLevel
        | }
        """.stripMargin
}
