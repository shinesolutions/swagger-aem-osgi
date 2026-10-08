-module(openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties/0]).

-export([openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties/1]).

-export_type([openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties/0]).

-type openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties() ->
    openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties([]).

openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

