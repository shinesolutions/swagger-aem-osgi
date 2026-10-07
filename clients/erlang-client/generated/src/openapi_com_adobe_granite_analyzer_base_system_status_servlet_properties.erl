-module(openapi_com_adobe_granite_analyzer_base_system_status_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_analyzer_base_system_status_servlet_properties/0]).

-type openapi_com_adobe_granite_analyzer_base_system_status_servlet_properties() ::
    #{ 'disabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'disabled' := Disabled
        }) ->
    #{ 'disabled' => Disabled
     }.
