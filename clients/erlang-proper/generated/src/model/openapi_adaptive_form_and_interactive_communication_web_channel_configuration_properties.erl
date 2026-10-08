-module(openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties).

-include("openapi.hrl").

-export([openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties/0]).

-export([openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties/1]).

-export_type([openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties/0]).

-type openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties() ::
  [ {'showPlaceholder', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'maximumCacheEntries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'af_scripting_compatversion', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'makeFileNameUnique', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'generatingCompliantData', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties() ->
    openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties([]).

openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties(Fields) ->
  Default = [ {'showPlaceholder', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'maximumCacheEntries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'af.scripting.compatversion', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'makeFileNameUnique', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'generatingCompliantData', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

