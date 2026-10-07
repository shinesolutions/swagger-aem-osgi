-module(openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties/0]).

-export([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties/1]).

-export_type([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties/0]).

-type openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_controlFlag', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'oauth_offline_validation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties() ->
    openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties([]).

openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.controlFlag', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'oauth.offline.validation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

