-module(openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties/0]).

-export([openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties/1]).

-export_type([openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties/0]).

-type openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'jaas_controlFlag', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'headers', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cookies', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'parameters', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'usermap', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'format', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'trustedCredentialsAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties() ->
    openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties([]).

openapi_com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'jaas.controlFlag', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'headers', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cookies', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'parameters', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'usermap', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'format', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'trustedCredentialsAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

