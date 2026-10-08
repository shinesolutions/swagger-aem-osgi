-module(openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties/0]).

-export([openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties/1]).

-export_type([openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties/0]).

-type openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties() ::
  [ {'alloworigin', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'alloworiginregexp', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'allowedpaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'exposedheaders', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'maxage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'supportedheaders', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'supportedmethods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'supportscredentials', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties() ->
    openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties([]).

openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties(Fields) ->
  Default = [ {'alloworigin', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'alloworiginregexp', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'allowedpaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'exposedheaders', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'maxage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'supportedheaders', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'supportedmethods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'supportscredentials', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

