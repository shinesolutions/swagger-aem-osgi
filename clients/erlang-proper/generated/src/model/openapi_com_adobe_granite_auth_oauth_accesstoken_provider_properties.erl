-module(openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties/0]).

-export([openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_token_provider_title', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_token_provider_default_claims', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'auth_token_provider_endpoint', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_access_token_request', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_token_provider_keypair_alias', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_token_provider_conn_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'auth_token_provider_so_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'auth_token_provider_client_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_token_provider_scope', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_token_provider_reuse_access_token', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'auth_token_provider_relaxed_ssl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'token_request_customizer_type', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_token_validator_type', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties() ->
    openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties([]).

openapi_com_adobe_granite_auth_oauth_accesstoken_provider_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.token.provider.title', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.token.provider.default.claims', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'auth.token.provider.endpoint', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.access.token.request', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.token.provider.keypair.alias', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.token.provider.conn.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'auth.token.provider.so.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'auth.token.provider.client.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.token.provider.scope', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.token.provider.reuse.access.token', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'auth.token.provider.relaxed.ssl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'token.request.customizer.type', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.token.validator.type', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

