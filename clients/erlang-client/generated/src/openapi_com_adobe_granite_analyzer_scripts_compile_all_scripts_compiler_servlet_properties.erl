-module(openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties/0]).

-type openapi_com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_properties() ::
    #{ 'disabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'disabled' := Disabled
        }) ->
    #{ 'disabled' => Disabled
     }.
