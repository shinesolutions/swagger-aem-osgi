-module(openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties/0]).

-type openapi_com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties() ::
    #{ 'payload_move_white_list' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'payload_move_handle_from_workflow_process' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'payload_move_white_list' := PayloadMoveWhiteList,
          'payload_move_handle_from_workflow_process' := PayloadMoveHandleFromWorkflowProcess
        }) ->
    #{ 'payload.move.white.list' => PayloadMoveWhiteList,
       'payload.move.handle.from.workflow.process' => PayloadMoveHandleFromWorkflowProcess
     }.
