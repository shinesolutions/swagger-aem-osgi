-module(openapi_com_adobe_granite_auth_oauth_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_oauth_provider_properties/0]).

-export([openapi_com_adobe_granite_auth_oauth_provider_properties/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_provider_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_provider_properties() ::
  [ {'oauth_config_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_client_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_client_secret', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_scope', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'oauth_config_provider_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_create_users', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_userid_property', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'force_strict_username_matching', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_encode_userids', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_hash_userids', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_callBackUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_access_token_persist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_access_token_persist_cookie', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_csrf_state_protection', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_redirect_request_params', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'oauth_config_siblings_allow', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_auth_oauth_provider_properties() ->
    openapi_com_adobe_granite_auth_oauth_provider_properties([]).

openapi_com_adobe_granite_auth_oauth_provider_properties(Fields) ->
  Default = [ {'oauth.config.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.client.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.client.secret', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.scope', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'oauth.config.provider.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.create.users', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.userid.property', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'force.strict.username.matching', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.encode.userids', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.hash.userids', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.callBackUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.access.token.persist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.access.token.persist.cookie', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.csrf.state.protection', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.redirect.request.params', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'oauth.config.siblings.allow', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

