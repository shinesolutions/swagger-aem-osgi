-module(openapi_adaptive_form_and_interactive_communication_web_channel_configuration_info).

-export([encode/1]).

-export_type([openapi_adaptive_form_and_interactive_communication_web_channel_configuration_info/0]).

-type openapi_adaptive_form_and_interactive_communication_web_channel_configuration_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties:openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties()
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
