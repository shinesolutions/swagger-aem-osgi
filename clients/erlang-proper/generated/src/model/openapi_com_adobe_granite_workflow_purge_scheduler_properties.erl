-module(openapi_com_adobe_granite_workflow_purge_scheduler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_purge_scheduler_properties/0]).

-export([openapi_com_adobe_granite_workflow_purge_scheduler_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_purge_scheduler_properties/0]).

-type openapi_com_adobe_granite_workflow_purge_scheduler_properties() ::
  [ {'scheduledpurge_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scheduledpurge_workflowStatus', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'scheduledpurge_modelIds', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'scheduledpurge_daysold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_workflow_purge_scheduler_properties() ->
    openapi_com_adobe_granite_workflow_purge_scheduler_properties([]).

openapi_com_adobe_granite_workflow_purge_scheduler_properties(Fields) ->
  Default = [ {'scheduledpurge.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scheduledpurge.workflowStatus', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'scheduledpurge.modelIds', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'scheduledpurge.daysold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

