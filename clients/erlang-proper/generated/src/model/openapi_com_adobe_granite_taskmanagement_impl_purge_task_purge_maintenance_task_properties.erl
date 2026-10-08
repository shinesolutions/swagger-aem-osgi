-module(openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties/0]).

-export([openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties() ::
  [ {'purgeCompleted', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'completedAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'purgeActive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'activeAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'saveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties() ->
    openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties([]).

openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties(Fields) ->
  Default = [ {'purgeCompleted', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'completedAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'purgeActive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'activeAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'saveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

