-module(openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties/0]).

-type openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties() ::
  [ {'payload_move_white_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'payload_move_handle_from_workflow_process', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties() ->
    openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties([]).

openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties(Fields) ->
  Default = [ {'payload.move.white.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'payload.move.handle.from.workflow.process', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

