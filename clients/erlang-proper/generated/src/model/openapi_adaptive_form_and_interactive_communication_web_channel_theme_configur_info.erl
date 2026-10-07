-module(openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info).

-include("openapi.hrl").

-export([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info/0]).

-export([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info/1]).

-export_type([openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info/0]).

-type openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties:openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties() }
  ].


openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info() ->
    openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info([]).

openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties:openapi_adaptive_form_and_interactive_communication_web_channel_theme_configur_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

