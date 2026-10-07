-module(openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'encryptedPassword', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties() ->
    openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties([]).

openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'encryptedPassword', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

