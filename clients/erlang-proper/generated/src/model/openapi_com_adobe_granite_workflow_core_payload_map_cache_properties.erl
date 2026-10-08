-module(openapi_com_adobe_granite_workflow_core_payload_map_cache_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_payload_map_cache_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_payload_map_cache_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_payload_map_cache_properties/0]).

-type openapi_com_adobe_granite_workflow_core_payload_map_cache_properties() ::
  [ {'getSystemWorkflowModels', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'getPackageRootPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_workflow_core_payload_map_cache_properties() ->
    openapi_com_adobe_granite_workflow_core_payload_map_cache_properties([]).

openapi_com_adobe_granite_workflow_core_payload_map_cache_properties(Fields) ->
  Default = [ {'getSystemWorkflowModels', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'getPackageRootPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

