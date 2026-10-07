-module(openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties/0]).

-export([openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties/1]).

-export_type([openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties/0]).

-type openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties() ::
  [ {'cluster_level_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cluster_master_level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_slave_level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties() ->
    openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties([]).

openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties(Fields) ->
  Default = [ {'cluster.level.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cluster.master.level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.slave.level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

