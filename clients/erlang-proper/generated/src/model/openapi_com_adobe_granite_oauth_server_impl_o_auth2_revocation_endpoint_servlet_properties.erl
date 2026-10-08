-module(openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties/0]).

-export([openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties/0]).

-type openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties() ::
  [ {'sling_servlet_paths', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_revocation_active', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties() ->
    openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties([]).

openapi_com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.paths', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.revocation.active', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

