-module(openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties).

-include("openapi.hrl").

-export([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties/0]).

-export([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties/1]).

-export_type([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties/0]).

-type openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties() ::
  [ {'fontList', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties() ->
    openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties([]).

openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties(Fields) ->
  Default = [ {'fontList', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

