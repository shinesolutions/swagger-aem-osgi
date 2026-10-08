-module(openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties() ::
  [ {'diffPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'serviceUser_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties() ->
    openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties([]).

openapi_com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties(Fields) ->
  Default = [ {'diffPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'serviceUser.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

