-module(openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties/0]).

-type openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties() ::
    #{ 'cluster_level_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cluster_master_level' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cluster_slave_level' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cluster_level_enable' := ClusterLevelEnable,
          'cluster_master_level' := ClusterMasterLevel,
          'cluster_slave_level' := ClusterSlaveLevel
        }) ->
    #{ 'cluster.level.enable' => ClusterLevelEnable,
       'cluster.master.level' => ClusterMasterLevel,
       'cluster.slave.level' => ClusterSlaveLevel
     }.
