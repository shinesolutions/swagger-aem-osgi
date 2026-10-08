package models

type ComDayCqJcrclustersupportClusterStartLevelControllerProperties struct {

	ClusterLevelEnable ConfigNodePropertyBoolean `json:"cluster.level.enable,omitempty"`

	ClusterMasterLevel ConfigNodePropertyInteger `json:"cluster.master.level,omitempty"`

	ClusterSlaveLevel ConfigNodePropertyInteger `json:"cluster.slave.level,omitempty"`
}
