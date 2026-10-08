-module(openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'userId', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'accessTokenProvider_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties() ->
    openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties([]).

openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'userId', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'accessTokenProvider.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

