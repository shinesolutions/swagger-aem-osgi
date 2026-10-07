-module(openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'agentName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'diffPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'observedPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'propertyNames', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'distributionDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'serviceUser_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties() ->
    openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties([]).

openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'agentName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'diffPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'observedPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'propertyNames', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'distributionDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'serviceUser.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

