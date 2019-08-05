-module(openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info).

-export([encode/1]).

-export_type([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info/0]).

-type openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties:openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
