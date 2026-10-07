-module(openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties).

-export([encode/1]).

-export_type([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties/0]).

-type openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties() ::
    #{ 'fontList' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'fontList' := FontList
        }) ->
    #{ 'fontList' => FontList
     }.
