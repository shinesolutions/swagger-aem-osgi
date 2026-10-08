-module(openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties/0]).

-export([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties/1]).

-export_type([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties/0]).

-type openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'fallbackPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties() ->
    openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties([]).

openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'fallbackPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

