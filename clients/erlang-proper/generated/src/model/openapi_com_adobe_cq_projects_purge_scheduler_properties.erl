-module(openapi_com_adobe_cq_projects_purge_scheduler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_projects_purge_scheduler_properties/0]).

-export([openapi_com_adobe_cq_projects_purge_scheduler_properties/1]).

-export_type([openapi_com_adobe_cq_projects_purge_scheduler_properties/0]).

-type openapi_com_adobe_cq_projects_purge_scheduler_properties() ::
  [ {'scheduledpurge_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scheduledpurge_purgeActive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'scheduledpurge_templates', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'scheduledpurge_purgeGroups', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'scheduledpurge_purgeAssets', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'scheduledpurge_terminateRunningWorkflows', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'scheduledpurge_daysold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'scheduledpurge_saveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_projects_purge_scheduler_properties() ->
    openapi_com_adobe_cq_projects_purge_scheduler_properties([]).

openapi_com_adobe_cq_projects_purge_scheduler_properties(Fields) ->
  Default = [ {'scheduledpurge.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scheduledpurge.purgeActive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'scheduledpurge.templates', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'scheduledpurge.purgeGroups', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'scheduledpurge.purgeAssets', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'scheduledpurge.terminateRunningWorkflows', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'scheduledpurge.daysold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'scheduledpurge.saveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

