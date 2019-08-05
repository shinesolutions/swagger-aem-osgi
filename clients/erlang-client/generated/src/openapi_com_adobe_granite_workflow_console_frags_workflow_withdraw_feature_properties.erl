-module(openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties/0]).

-type openapi_com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'enabled' := Enabled
        }) ->
    #{ 'enabled' => Enabled
     }.
