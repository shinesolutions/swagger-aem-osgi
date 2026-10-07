-module(openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties/0]).

-export([openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_clientIds_allowed', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'auth_bearer_sync_ims', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'auth_tokenRequestParameter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_bearer_configid', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_jwt_support', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties() ->
    openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties([]).

openapi_com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.clientIds.allowed', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'auth.bearer.sync.ims', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'auth.tokenRequestParameter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.bearer.configid', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.jwt.support', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

